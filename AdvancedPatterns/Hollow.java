public class Hollow {

    public static void Hollow_Star(int tr, int tc) {
        for (int i = 1; i <= tr; i++) {
            for (int j = 1; j <= tc; j++) {
                if (i == 1 || j == 1 || i == tr || j == tc) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_Star(15, 10);
    }
}
