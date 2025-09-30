// MEDIUM LEVEL QUESTION.........

public class TrappedWater {
    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // finding left max :-
        int leftMax[] = new int[a.length];
        leftMax[0] = a[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(a[i], leftMax[i - 1]);
        }

        // finding right max :-
        int rightMax[] = new int[a.length];
        rightMax[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(a[i], rightMax[i + 1]);
        }

        // Findind Trapped water
        int trapped_Water = 0;
        for (int i = 0; i < a.length; i++) {
            int trap = Math.min(rightMax[i], leftMax[i]);
            trapped_Water += trap - a[i];
        }
        System.out.println("total trapped water : " + trapped_Water);
    }
}
