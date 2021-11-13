package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Person;
import com.example.demo.services.IpersonService;





@Controller
public class HomeController {
    
    @Autowired
    @Qualifier("Service1")
    IpersonService personservice;


@GetMapping("/")
public String index(Model model){

    String text = "text from backend";
    model.addAttribute("text", text);
    model.addAttribute("list", personservice.getAll());

    return "index";
}

@GetMapping("/header")
public String header(Model model){

    String text = "text from backend";
    model.addAttribute("text", text);
    model.addAttribute("list", personservice.getAll());
    return "header/header";
}

    @PostMapping("/example1")
    @ResponseBody      
    public String example1(@RequestBody List<Person> persona){
     
        return persona.get(0).getName() ;

    }

    @GetMapping("/example2/{id}")
    @ResponseBody      
    public String example2(@PathVariable("id") int id){


    return "this is a text 222  +  " + id ;

    }


    @GetMapping("/example2")
    @ResponseBody      
    public List<Person> example2(){
        List<Person> all = new ArrayList<Person>();
        all.add(new Person(1L, "Randy111", "Ruvira111"));
        all.add(new Person(2L, "Randy2222", "Ruvira222"));
        all.add(new Person(3L, "Randy333", "Ruvira333"));

  return all;

    }

}
