import model.Person;
import service.Impl.PersonImpl;
import service.Impl.SetExamImpl;

import java.util.*;

import static service.Impl.SetExamImpl.input;

public class Main {
    public static void main(String[] args) {

        PersonImpl listExam = new PersonImpl();
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person information:");
        while (true) {
            System.out.print("Enter person ID (or -1 to exit): ");
            int id = scanner.nextInt();
            if (id == -1)
                break;

            System.out.print("Enter person name: ");
            String name = scanner.next();

            System.out.print("Enter person age: ");
            int age = scanner.nextInt();

            Person person = new Person(id, name, age);
            persons.add(person);
        }

        listExam.inputAddPersonList(persons);
        listExam.info(persons);
        listExam.filter(persons);
        listExam.delete(persons);
        listExam.sortPerson(persons);

        SetExamImpl setExam = new SetExamImpl();
        Set<Person> personSet = input();
        setExam.info(personSet);
        setExam.filter(personSet);
        setExam.delete(personSet);



    }

    }


