package scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = s.nextLine();
        System.out.print("Введите возраст: ");
        int age = s.nextInt();
        System.out.println("Отлично! Ваши данные: имя = " + name + ", возраст: " + age);
    }
}
