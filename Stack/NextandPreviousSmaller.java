package Stack;

public class NextandPreviousSmaller {
    
}

// import java.util.Stack;

// public class PreviousSmaller {
//     public static int[] prevSmaller(int[] arr) {
//         int n = arr.length;
//         int[] res = new int[n];
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             while (!st.isEmpty() && st.peek() >= arr[i]) {
//                 st.pop();
//             }

//             if (st.isEmpty()) res[i] = -1;
//             else res[i] = st.peek();

//             st.push(arr[i]);
//         }
//         return res;
//     }
// }






// import java.util.Stack;

// public class NextSmaller {
//     public static int[] nextSmaller(int[] arr) {
//         int n = arr.length;
//         int[] res = new int[n];
//         Stack<Integer> st = new Stack<>();

//         for (int i = n - 1; i >= 0; i--) {
//             while (!st.isEmpty() && st.peek() >= arr[i]) {
//                 st.pop();
//             }

//             if (st.isEmpty()) res[i] = -1;
//             else res[i] = st.peek();

//             st.push(arr[i]);
//         }
//         return res;
//     }
// }
