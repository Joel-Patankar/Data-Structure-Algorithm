public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int first = 0, last = arr.length - 1;
        for (; first < last;) {

            int a = arr[first];
            arr[first] = arr[last];
            arr[last] = a;

            first++;
            last--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
