package service.Impl;

import model.Person;
import service.PersonInfoService;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExamImpl implements PersonInfoService {


    @Override
    public void inputaddPerson(Person person) {

    }

    @Override
    public void inputSetPerson(Set<Person> person) {

    }

    @Override
    public void info(Set<Person> personSet) {

        System.out.println("Information of all persons:");
        for (Person person : personSet) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
        }

    }

    @Override
    public void filter(Set<Person> personSet) {
        System.out.println("Persons with age less than 20:");
        for (Person person : personSet) {
            if (person.getAge() < 20) {
                System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
            }
        }

    }

    @Override
    public void delete(Set<Person> personSet) {

        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().contains("A")) {
                iterator.remove();
            }
        }
        info(personSet);

    }


    public static Set<Person> input() {
        Scanner scanner = new Scanner(System.in);
        Set<Person> personSet = new HashSet<>();


//        System.out.println("Enter person information:");
//        while (true) {
//            System.out.print("Enter person ID (or -1 to exit): ");
//            int id = scanner.nextInt();
//            if (id == -1)
//                break;
//
//            System.out.print("Enter person name: ");
//            String name = scanner.next();
//
//            System.out.print("Enter person age: ");
//            int age = scanner.nextInt();
//
//            Person person = new Person(id, name, age);
//            personSet.add(person);

        while (true) {
            System.out.println("Enter id, name, age of the person (separated by space), or type 'exit' to finish:");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            try {
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                personSet.add(new Person(id, name, age));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter valid id and age as integers.");
            }
        }

            return personSet;

        }



    }

