package classes_and_objects;

import java.util.ArrayList;
import java.util.List;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Elvin";
        person1.age = 22;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Vladislav";
        person2.age = 26;
        person2.speak();

        Person person3 = new Person();
        person3.name = "Makar";
        person3.age = 28;
        person3.speak();

        Person person4 = new Person();
        person4.name = "Roman";
        person4.age = 12;
        person4.speak();

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        int i = 0;
        for (Person person : persons) {
            i++;
            System.out.println("Person " + i + ": " + person.name);
        }
    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.println("Hello!");
    }
}
