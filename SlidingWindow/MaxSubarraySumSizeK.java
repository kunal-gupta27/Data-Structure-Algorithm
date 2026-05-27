package SlidingWindow;

public class MaxSubarraySumSizeK {

    // Brute force approch

    // public static void main(String[] args) {
    //     int arr[] = {10, 20, 1, 3, -40, 80, 10};
    //     int k=3;
    //     int n = arr.length;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<=n-k;i++){
    //         int sum=0;
    //         for(int j=i;j<=i+k-1;j++){
    //             sum +=arr[j];
    //         }
    //         maxSum = Math.max(maxSum, sum);
    //     }
    //     System.out.println(maxSum);
    // }


    //Optimize approach
    public static void main(String[] args) {
        int arr[] = {10, 20, 1, 3, -40, 80, 10};
        int k=3;
        int n = arr.length;
        int ms = Integer.MIN_VALUE;
        int s =0, i=0, j=k-1;

        for(int a=i;a<=j;a++){
            s+=arr[a];
        }
        i++; j++;
        while(j<n){
            s = s -arr[i-1]+arr[j];
            ms = Math.max(ms, s);
            i++; j++;
        }
        System.out.println(ms);
    }
}
