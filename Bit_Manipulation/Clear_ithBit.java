public class Clear_ithBit {
    public static void main(String[] args) {
        int i=1;
        // int ith_bit= 1<<i; this is my tarika.......
        int n = 10;
        // 10=1010
        int ith_bit = ~(1<<i);
        // 0010 => 1101
        // 1010/1101
        System.out.println(n&ith_bit);
        // System.out.println(n^ith_bit);  this is my tarika.......
    }
}
