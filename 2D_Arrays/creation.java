import java.util.*;

public class creation {
    public static void main(String args[]) {

        int a[][] = new int[2][4];

        Scanner in = new Scanner(System.in);

        // INPUT OF 2D ARRAY
        int r = a.length, c= a[0].length;
        int min = Integer.MAX_VALUE;
        // int key = 6;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }  
        }

        // OUTPUT OF 2D ARRAY
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        // FIND MINIMUM OF 2D ARRAY
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (min>a[i][j]) {
                    min = a[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(min);

        // FIND INDEX OF EKY
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         if(a[i][j] == key)
        //         System.out.print("("+i+","+j+")");
        //     }
        // }
   }
}