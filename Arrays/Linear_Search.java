public class Linear_Search {

    public static int FindKey(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int num[] = { 22, 34, 54, 2, 55, 67, 87, 53, 7, 93 };

        int key = 7;

        int FindIndex = FindKey(num, key);
        if (FindIndex == -1) {
            System.out.println("not found");
        } else {
            System.out.println("index is " + FindIndex);
        }

    }
}
