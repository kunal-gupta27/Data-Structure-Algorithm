package Stack;

import java.util.*;
public class LargestRectHistogram {
    public static int largestRectangle(int[] height){
        int n = height.length;
        int nse[] = new int[n];
        int pse[] = new int[n];
        Stack<Integer> st = new Stack<>();

        ///calculate nse[]
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && height[st.peek()]>height[i]){
                st.pop();
            }
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        while(st.size()>0) st.pop();

        st.push(0);
        pse[0]=-1;

        for(int i=1;i<n;i++){
            while(st.size()>0 && height[st.peek()]>height[i]){
                st.pop();
            }
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        
        int m = -1;
        for(int i=0;i<n;i++){
            int a = height[i]*(nse[i]-pse[i]-1);
            m  = Math.max(m,a);
        }
        return m;



    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};  //output => 10
         
        int result = largestRectangle(heights);
        System.out.println(result);
    }
}
