public class Pairs {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10,11,23 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int positon = a[i];
                System.out.print("(" + positon + "," + a[j] + ")   ");
            }
            System.out.println();
        }
    }
}
