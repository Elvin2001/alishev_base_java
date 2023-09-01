package arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 10;
            System.out.println(nums[i]);
        }

        String[] names = new String[]{"Elvin", "Zaur", "Nail", "Vladimir"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
