public class FLOYDS_Triangle {

    public static void Print_Pat(int n){
        int inc = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+inc);
                inc++;
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Print_Pat(8);
    }
}
