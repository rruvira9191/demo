package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Person;


import org.springframework.stereotype.Service;

@Service("Service1")
public class PersonService implements IpersonService {

    @Override
    public List<Person> getAll() {
        

List<Person> all = new ArrayList<>();
all.add(new Person(1L, "Randy111", "Ruvira111"));
all.add(new Person(2L, "Randy2222", "Ruvira222"));
all.add(new Person(3L, "Randy333", "Ruvira333"));
        return all;
    }
    
    
}
