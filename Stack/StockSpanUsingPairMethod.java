package Stack;

import java.util.*;
public class StockSpanUsingPairMethod {
    // ===== Pair class =====
    static class Pair {
        int price;
        int span;

        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }

    // ===== StockSpanner class =====
    static class StockSpanner {

        Stack<Pair> st;

        // Constructor
        public StockSpanner() {
            st = new Stack<>();
        }

        public int next(int price) {
            int span = 1;

            while (!st.isEmpty() && st.peek().price <= price) {
                span += st.peek().span;
                st.pop();
            }
            st.push(new Pair(price, span));
            return span;
        }
    }

    // ===== main function =====
    public static void main(String[] args) {
        StockSpanner sp = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int i = 0; i < prices.length; i++) {
            int ans = sp.next(prices[i]);
            System.out.println(ans);
        }
}
}
