public class buyAndSell_Stock {
    public static void main(String[] args) {
        int a[] = { 0 };

        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < a.length; i++) {
            if (buy < a[i]) {
                int profit = a[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = a[i];
            }
        }
        System.out.println("Maximum profit among all day's : " + maxProfit);
    }
}
