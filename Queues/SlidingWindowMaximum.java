package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] slidingwindow(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); 

        int idx = 0;

        for (int i = 0; i < n; i++) {

        
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.removeFirst();
            }

           
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

   
            dq.addLast(i);

            if (i >= k - 1) {
                res[idx++] = arr[dq.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 7, 1, 6};
        int k = 3;

        int[] ans = slidingwindow(arr, k);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
