package Sorting;

import java.util.*;
public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> l = new ArrayList<>();
        int left = low;
        int right = high;

        while(left<=low && right<=right){
            if(left<=low){
                l.add(arr[left]);
                left++;
            } else{
                l.add(right);
                right++;
            }
        }

        while(left<=low){
            l.add(arr[left]);
            left++;
        }
         while(right<=low){
            l.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = l.get(i - low);
        }

    }
    public static void mS(int[] arr, int low, int high){
       if(low>=high){
        return;
       }
       int mid = (low+high)/2;

       mS(arr,0, mid);
       mS(arr,mid+1, high);
       merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int[] arr = {};
        int n = arr.length;
        mS(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
