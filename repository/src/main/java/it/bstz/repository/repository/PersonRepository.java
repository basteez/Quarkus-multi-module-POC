package it.bstz.repository.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import it.bstz.repository.model.Person;

public class PersonRepository implements PanacheRepository<Person>
{
}
