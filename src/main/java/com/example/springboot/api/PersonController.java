package com.example.springboot.api;

import com.example.springboot.model.Person;
import com.example.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")//Link-->localhost/api/v1/person
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping//(POST)
    public void addPerson(@Valid @NonNull @RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping//(GET)
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        personService.deletePersonById(id);
    }
    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id,@Valid @NonNull @RequestBody Person personToUpdate){
        personService.updatePerson(id,personToUpdate);
    }
}
