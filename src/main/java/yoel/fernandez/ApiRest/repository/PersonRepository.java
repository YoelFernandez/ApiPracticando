package yoel.fernandez.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yoel.fernandez.ApiRest.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {

    
} 