public class SA_Kadane {
    public static void main(String[] args) {
        int a[] = { -1, -2, -3, -4, -5 };
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            curr = curr + a[i];

            // if (curr < 0) {
            // curr = 0;
            // }
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
