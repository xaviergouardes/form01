package com.xtechnologies.form01.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xtechnologies.form01.services.LotService;


@Controller
public class LotController 
{

	@Autowired
	private LotService LotService;
	
	@RequestMapping(value="/lots", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        
		model.addAttribute("lots", "lots");
        
		return "index";
    }

    	
}
