public class PowOf2OrNot {
    public static void main(String[] args) {
        int n = 8;
        if ((n&(n-1))==0) {
            System.out.println("it's power of 2");
        }else{
            System.out.println("It's not power of 2");
        }
    }

}