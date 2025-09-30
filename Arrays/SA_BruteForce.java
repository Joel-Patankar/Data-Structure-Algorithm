public class SA_BruteForce {

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };

        int ts = 0;
        int start = 0, end = a.length - 1;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {

            for (int j = i; j <= end; j++) {
                int sum = 0;

                for (int j2 = i; j2 <= j; j2++) {

                    sum = sum + a[j2];
                    
                }
                ts++;
                if (max<sum) {
                    max = sum;
                }

            }
            System.out.println();

        }
        System.out.println("total subarray : " + ts);
        System.out.print(" maximum sum : "+ max );

    }
}
