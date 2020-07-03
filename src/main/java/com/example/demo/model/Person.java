package com.example.demo.model;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;
    
    public void setId(UUID id){
        this.id = id;
    }

    public UUID getId(){
        return id;
    }

    public void setName(Strinf name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}