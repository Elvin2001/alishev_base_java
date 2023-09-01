package classes_and_objects;

public class Lesson {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Klara");
        human1.setAge(26);
        human1.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + " " + age);
    }
}
