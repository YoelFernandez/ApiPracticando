package yoel.fernandez.ApiRest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import yoel.fernandez.ApiRest.entity.Person;
import yoel.fernandez.ApiRest.service.PersonService;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService  personService;
    @PostMapping
    private void createPerson(@RequestBody Person person){
        personService.createPerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

}
