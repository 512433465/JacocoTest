package com.frank.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloSpringMVC {
    @RequestMapping("/hello")  
    public String test() {  
        System.out.println("test"); 
        return "hello"; 
    }
    @RequestMapping("/hello2") 
    public String HelloWorld(Model model){  
        model.addAttribute("message","Hello World!!!spring");  
        return "hello2";  
    }  
    
    public void HelloWorld2(){  
    	 System.out.println("HelloWorld2");
    } 
    
 
    public void HelloWorld4(){  
   	 System.out.println("HelloWorld2");
   } 
}