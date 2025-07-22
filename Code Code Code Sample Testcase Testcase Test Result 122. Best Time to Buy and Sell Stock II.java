import java.util.Scanner;
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;                  //to add profit for each stock buy and sell
        for(int i = 1;i< prices.length;i++){      // to traverse all vlaues
            if(prices[i]>prices[i-1]){            // checks for previous day stock price 
                profit += prices[i] - prices[i-1];  //if price lower the profit is added by subtracting i and i-1 value
              
            }
        }return profit;
    }
}

public class BuyStockII {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.trim().split("\\s+");
        int[] prices = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            prices[i] = Integer.parseInt(tokens[i]);
        }
        Solution sol = new SolutionStock();
        System.out.println(sol.maxProfit(prices));
    }
}
