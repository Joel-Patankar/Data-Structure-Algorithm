public class ClearLast_ithBit {
    public static void main(String[] args) {
        int n = 10, ith_bit = 2;
        System.out.println(n & (-1) << ith_bit);
    }
}
