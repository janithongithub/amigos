package com.example.demo.dao;

import com.example.demo.model.Person;
import java.util.UUID;


public interface PersonDao {
    //interfaces define operations allowed
   // cool thing is we can give another class to access --
   //--through interface using dependency injection
   
   //insert person with given id
   int insertPerson(UUID id, Person person);

   // insert person with generated id 
    default int insertPerson(Person person){       
        UUID id = UUID.randomUUID();        // generate id
        return(insertPerson(id, person));   //return 1 if sucessful 

        
    }
}