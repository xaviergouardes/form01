package com.xtechnologies.form01.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LotController 
{

	@RequestMapping(value="/lots", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("test", "test");
        return "index";
    }

    
}
