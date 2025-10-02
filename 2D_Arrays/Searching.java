public class Searching {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 47 },
                { 32, 33, 39, 50 } };
        int row = matrix.length - 1, col = 0, key = 45;

        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out
                        .println("your value : " + matrix[row][col] + " is in the index => (" + row + "," + col + ")");
                break;
            } else {
                if (matrix[row][col] < key) {
                    col++;
                } else {
                    row--;
                }
            }
        }
    }
}
