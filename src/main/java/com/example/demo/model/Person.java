package com.example.demo.model;

public class Person {

    private Long id;
    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", lastName=" + lastName + ", name=" + name + "]";
    }
    public Person(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String name ;
    private String lastName;
    
}
