package Stack;
import java.util.*;
public class displaytheStack {
    //******************************recursively display reverse************************ */
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }

    //******************************recursively display ************************ */
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverse(st);
        System.out.println();
        displayRecursively(st);

   // Using stack implementation

        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);

// *********************using array****************************

        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            int x = st.pop();
            arr[i] = x;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
