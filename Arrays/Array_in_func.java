public class Array_in_func {

    // ARRAYS ARE PASS BY REFERENCE 

    public static void array(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 10;
            System.out.println("Upadated Array => " + marks[i]);
        }
    }

    public static void main(String args[]) {
        int mrks[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < mrks.length; i++) {
            System.out.println("Original Array => " + mrks[i]);
        }
        System.out.println();

        array(mrks);
    }
}
