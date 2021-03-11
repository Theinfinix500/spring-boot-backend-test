package com.alijbara.anime.controller;

import com.alijbara.anime.model.Person;
import com.alijbara.anime.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getPersons() {
        System.out.println("Hello");
        return this.personService.getPersons();
    }

    @GetMapping("/{personId}")
    public Person getPerson(@PathVariable Integer personId) {
        System.out.println("Hello");
        return this.personService.getPerson(personId);
    }

    @PostMapping()
    public Person addPerson(@RequestBody Person person) {
        return this.personService.addPerson(person);
    }

    @DeleteMapping("/{personId}")
    public String deletePerson(@PathVariable Integer personId) {
        return this.personService.deletePerson(personId);
    }
}
