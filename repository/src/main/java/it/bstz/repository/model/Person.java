package it.bstz.repository.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends PanacheEntity {

    public String firstName;
    public String lastName;

}
