package com.example.springboot.dao;

import com.example.springboot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {//Person Database Access Object
    int insertPerson(UUID id, Person person);//If you want to insert id yourself

    default int insertPerson(Person person){//Generate randomly id
        UUID id=UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id,Person person);

}
