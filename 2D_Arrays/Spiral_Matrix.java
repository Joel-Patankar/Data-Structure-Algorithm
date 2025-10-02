public class Spiral_Matrix {
    public static void main(String[] args) {
        // int mat[][] = {{1,2,3,4},
        //                {5,6,7,8},
        //                {9,10,11,12},
        //                {13,14,15,16}};
        int mat[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int sr = 0,er = mat.length,sc = 0,ec = mat[0].length;
        while (sr<=er-1 && sc<=ec-1)  {
            for (int i = sc; i < ec; i++) {
                System.out.print(mat[sr][i]+" ");
            }
            for (int i = sr+1; i < er; i++) {
                System.out.print(mat[i][ec-1]+" ");
            }
            for (int i = ec-2; i >= sc; i--) {
                System.out.print(mat[er-1][i]+" ");
            }
            for (int i = er-2; i >= sr+1; i--) {
                System.out.print(mat[i][sc]+" ");
            }
            sr++;er--;sc++;ec--;
        }
    }
}
