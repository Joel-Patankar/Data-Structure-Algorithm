public class Get_ithBit {
    public static void main(String[] args) {
        int i = 4;
        int num1 = 7,ith_bit = 1<<i  ;

        if ((num1&ith_bit)==0) {
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        
       
    }
}
