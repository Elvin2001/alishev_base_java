package classes_and_objects;

import java.util.ArrayList;
import java.util.List;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Elvin", 22);
        person1.speak();

        Person person2 = new Person("Vladislav", 26);
        person2.speak();

        Person person3 = new Person("Makar", 28);
        person3.speak();

        Person person4 = new Person("Roman", 12);
        person4.speak();

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        Person.iterateList(persons);

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Hello!");
    }

    public static void iterateList(List<Person> list) {
        int i = 0;
        for (Person person : list) {
            i++;
            System.out.println("Person " + i + ": " + person.name);
        }
    }
}
