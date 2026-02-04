package Stack;

import java.util.Stack;

public class AestroidCollision {
    public static int[] collision(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) st.push(arr[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(arr[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(arr[i])) {st.pop(); }
                else if(st.isEmpty() || st.peek()<0) { st.push(arr[i]); }
            }
        }
        int[] res = new int[st.size()];

        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={4,7,1,1,2,-3,17,15,-16,-18};

        int[] ans = collision(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
