package service.Impl;

import model.Person;
import service.PersonService;

import java.util.Iterator;
import java.util.List;

public class PersonImpl implements PersonService {
    @Override
    public void inputAddPerson(Person person) {
        // Implementation to add a single person
    }

    @Override
    public void inputAddPersonList(List<Person> personList) {
        // Implementation to add a list of persons
    }

    @Override
    public void info(List<Person> personList) {
        System.out.println("Information of all persons:");
        for (Person person : personList) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    @Override
    public void filter(List<Person> personList) {
        System.out.println("Persons with age < 20:");
        for (Person person : personList) {
            if (person.getAge() < 20) {
                System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
            }
        }
    }

    @Override
    public void delete(List<Person> personList) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().contains("A")) {
                iterator.remove();
            }
        }
        System.out.println("After deleting persons with names containing 'A':");
        info(personList);
    }

    @Override
    public void sortPerson(List<Person> personList) {
        System.out.println("Sorting persons by age (ascending):");
        personList.sort((p1, p2) -> p1.getAge() - p2.getAge());
        info(personList);

        System.out.println("Sorting persons by age (descending):");
        personList.sort((p1, p2) -> p2.getAge() - p1.getAge());
        info(personList);
    }




























}





