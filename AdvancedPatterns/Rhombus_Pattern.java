public class Rhombus_Pattern {
    
    public static void Print_Rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.err.println();
        }
    }
    
    public static void main(String args[]){
        Print_Rhombus(4);
    }
}
