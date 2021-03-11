package com.alijbara.anime.service;

import com.alijbara.anime.model.Person;
import com.alijbara.anime.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getPersons() {
        return this.personRepository.findAll();
    }

    public Person getPerson(int personId) {
        return this.personRepository.findById(personId).get();
    }

    public Person addPerson(Person person) {
        return this.personRepository.save(person);
    }

    public String deletePerson(Integer personId) {
        this.personRepository.deleteById(personId);
        return "Person Deleted";
    }

}
