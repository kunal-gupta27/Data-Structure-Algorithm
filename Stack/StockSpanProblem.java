package Stack;

import java.util.*;

public class StockSpanProblem {
    // ===== StockSpanner Class =====
    static class StockSpanner {

        Stack<int[]> st;  // stack liya hain integer type kaa

        // Constructor banaya hai
        public StockSpanner() {
            st = new Stack<>();
        }

        public int next(int price) {
            int span = 1;

            while (!st.isEmpty() && st.peek()[0] <= price) {
                span += st.peek()[1];
                st.pop();
            }

            st.push(new int[]{price, span});
            return span;
        }
    }

    // ===== main function =====
    public static void main(String[] args) {

        StockSpanner sp = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int i = 0; i < prices.length; i++) {
            int ans = sp.next(prices[i]);
            System.out.println("Price: " + prices[i] + "  Span: " + ans);
        }
}
}


