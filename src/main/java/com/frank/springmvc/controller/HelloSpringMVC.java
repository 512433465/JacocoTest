package com.frank.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVC {
    @RequestMapping("/hello")  
    public String test(Model model) {
        model.addAttribute("message","Hello World!!!test");
        System.out.println("test"); 
        return "hello"; 
    }
    @RequestMapping("/hello2")
    public String HelloWorld(Model model){
        model.addAttribute("message","Hello World!!!spring2222222222222");  
        return "hello2";  
    }
    @RequestMapping("/hello1")
    public String HelloWorld2(Model model){
    	 System.out.println("HelloWorld1111111111");
         model.addAttribute("message","Hello World!!!HelloWorld1111111111");
         return "hello1";
    }

    @RequestMapping("/hello5")
    public void HelloWorld5(Model model){
   	    System.out.println("HelloWorld55555");
        System.out.println("HelloWorld55555");
        model.addAttribute("message","Hello World!!!HelloWorld55555");
   } 
}
