package loops;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        String s3 = "Elvin";
        int length = s3.length();

        for (int i = 0; i < length; i++) {
            System.out.println(s3.charAt(i));
            if (s3.charAt(i) == 'v') break;
        }

        int num = 10;

        while (num > 5) {
            System.out.println(num);
            num--;
        }

        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("So");
        list.add("Glad");
        list.add("Misery");
        list.add("Education");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
