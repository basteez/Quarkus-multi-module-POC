package it.bstz.service;

import it.bstz.repository.model.Person;
import it.bstz.repository.repository.PersonRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepository;

    public List<Person> listAll(){
        return personRepository.listAll();
    }

    public void persist(Person p){
        personRepository.persist(p);
    }
}
