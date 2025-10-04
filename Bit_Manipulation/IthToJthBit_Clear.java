public class IthToJthBit_Clear {
    public static void main(String[] args) {
        int n = 10, i = 2, j = 6;
        int a = -1 << j + 1, b = 1 << i - 1;
        int bitMask = a | b;
        System.out.println(n & bitMask);
    }
}
