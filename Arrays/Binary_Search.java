public class Binary_Search {
    // { 2, 4, 5, 7, 9, 11, 14, 18, 19 }
    
    public static int findInd(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 5, 7, 9, 11, 14, 18, 19 };

        int key = 10;

        System.out.println(findInd(a, key));
    }
}
