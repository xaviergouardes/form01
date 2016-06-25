
package com.xtechnologies.form01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude={org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
