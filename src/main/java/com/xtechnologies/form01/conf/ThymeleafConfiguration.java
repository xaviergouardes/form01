package com.xtechnologies.form01.conf;

import org.apache.commons.lang.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.thymeleaf.cache.StandardCacheManager;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.TemplateResolver;
import org.thymeleaf.templateresolver.UrlTemplateResolver;

@Configuration
public class ThymeleafConfiguration {

    private final Logger log = LoggerFactory.getLogger(ThymeleafConfiguration.class);

    @Autowired
    private Environment env;

    @Bean
    public TemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setCharacterEncoding(CharEncoding.UTF_8);
        
        //if (env.acceptsProfiles(Constants.SPRING_PROFILE_DEVELOPMENT)) {
            resolver.setCacheable(false); // default is true (for prod)
        //} else {
        //    log.info("Cache des templates Thymeleaf activé");
        //}
        return resolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());

        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.addTemplateResolver(templateResolver());
        templateEngine.addTemplateResolver(urlTemplateResolver());
        //templateEngine.addDialect(new SpringSecurityDialect());
        return templateEngine;

    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setCharacterEncoding(CharEncoding.UTF_8);
        return resolver;
    }

    @Bean
    public StandardCacheManager thymeleafCacheManager() {
        StandardCacheManager cacheManager = new StandardCacheManager();
        cacheManager.setTemplateCacheMaxSize(500);
        cacheManager.setFragmentCacheMaxSize(1000);
        return cacheManager;
    }
    
    
    @Bean
    public UrlTemplateResolver urlTemplateResolver() {
        return new UrlTemplateResolver();
    }

}