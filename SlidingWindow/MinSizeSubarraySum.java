package SlidingWindow;

public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int t = 7;
        int i=0;
        int s=0;
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            s+=arr[j];
            while(s>=t){
                int len = j-i+1;
                if(minLen>len) {minLen = len;}
                s-=arr[i];
                i++;
            }
        }
        if(minLen == Integer.MAX_VALUE) System.out.println(0);
        System.out.println(minLen);

    }
}
