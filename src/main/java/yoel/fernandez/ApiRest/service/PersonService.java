package yoel.fernandez.ApiRest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import yoel.fernandez.ApiRest.entity.Person;
import yoel.fernandez.ApiRest.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {


    private final PersonRepository personRepo;
    public void createPerson (Person person){
        personRepo.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
