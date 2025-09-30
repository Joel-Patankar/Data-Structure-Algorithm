public class SA_Prefix {
    public static void main(String[] args) {
        int a[] = { 2, -1, -5, 6, -4, -8 };
        int ts = 0;
        int start = 0, end = a.length - 1;
        int max = Integer.MIN_VALUE;
        int Prefix[] = new int[a.length];
        Prefix[0] = a[0];
        for (int i = 1; i < Prefix.length; i++) {
            Prefix[i] = Prefix[i - 1] + a[i];
        }
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                int sum = i == 0 ? Prefix[j] : Prefix[j] - Prefix[i - 1];
                ts++;
                if (max < sum) {
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("total subarray : " + ts);
        System.out.print(" maximum sum : " + max);
    }
}
