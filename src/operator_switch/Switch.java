package operator_switch;

public class Switch {
    public static void main(String[] args) {
        int val = 10;

        switch (val) {
            case 1:
                System.out.println("1");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Не 1/5/10");

        }
    }
}
