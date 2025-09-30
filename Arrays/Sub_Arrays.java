public class Sub_Arrays {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };

        int ts = 0;
        int start = 0, end = a.length - 1;

        for (int i = start; i <= end; i++) {

            for (int j = i; j <= end; j++) {

                for (int j2 = i; j2 <= j; j2++) {

                    System.out.print(a[j2]);
                }
                ts++;
                System.out.print(" ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("total subarray : "+ts);
    }
}
