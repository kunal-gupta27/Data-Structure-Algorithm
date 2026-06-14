package SlidingWindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k=100;
        int n = arr.length;
        int i=0;
        int pro = 1;
        int cnt=0;
        for(int j=0;j<n;j++){
            pro*=arr[j];
            while(pro>=k){
                pro/=arr[i];
                i++;
            }
            cnt+=(j-i+1);
        }
        System.out.println(cnt);

    }
}
