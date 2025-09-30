import java.util.*;

public class Largest {

    public static int Largest(int nums[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (large < nums[i]) {
                large = nums[i];
            }
        }
        return large;
    }

    public static void main(String args[]) {
        int num[] = { 4, 2, 6, 1, 3, 7, 4 };
        System.out.println(Largest(num));
    }
}
