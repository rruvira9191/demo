package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Person;


import org.springframework.stereotype.Service;

@Service("Service2")
public class PersonService2 implements IpersonService {

    @Override
    public List<Person> getAll() {
        List<Person> all = new ArrayList<>();
all.add(new Person(1L, "Randy444", "Ruvira444"));
all.add(new Person(2L, "Randy5555", "Ruvira5555"));
all.add(new Person(3L, "Randy666", "Ruvira666"));
        return all;
    }


    
}
