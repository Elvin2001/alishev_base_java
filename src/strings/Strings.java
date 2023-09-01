package strings;

public class Strings {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = new String("String");
        String s3 = "Elvin";
        String s4 = "22";

        if (s1 == s2) {
            System.out.println("Один и тот же объект");
        } else {
            System.out.println("Разные объекты");
        }

        System.out.println("My name: " + s3 + ", my age: " + s4);
    }
}
