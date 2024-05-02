package service;

import model.Person;

import java.util.List;

public interface PersonService  {


    void inputAddPerson(Person person);

    void inputAddPersonList(List<Person> personList);

    void info(List<Person> personList);

    void filter(List<Person> personList);

    void delete(List<Person> personList);

    void sortPerson(List<Person> personList);


}
