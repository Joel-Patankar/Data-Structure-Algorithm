import java.util.*;

public class bin_and_dec {

    // binary to decimal 
    public static void Bn(int BC) {
    int rbc = BC;
    int Power = 0;
    int DecNum = 0;
    while (BC > 0) {
    int LastDigit = BC % 10;
    DecNum = DecNum + (LastDigit * (int)Math.pow(2, Power));
    Power++;
    BC=BC / 10;
    }
    System.out.println("binary"+rbc+ "=>"+"decimal"+DecNum);
    }

    // decimal to binary  
    public static void dctobn(int DecNum) {
        while (DecNum > 0) {
            int pow = 0;
            int bin = 0;
            while (DecNum>0) {
                int rem = DecNum%2;
                bin+=rem*(int)Math.pow(10,pow);
                pow++;
                DecNum/=2;
            }
            System.out.println(bin);
        }
    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = a.nextInt();
        
        // binary to decimal fuction
        // Bn(n);

        // decimal to binary function 
        dctobn(n);
    }
}
