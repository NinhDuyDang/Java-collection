package service;

import model.Person;

import java.util.Set;

public interface PersonInfoService {
    void inputaddPerson(Person person);
    void inputSetPerson(Set<Person> person);

    void info(Set<Person> personSet);
    void filter(Set<Person> personSet);
    void delete(Set<Person> personSet);


}
