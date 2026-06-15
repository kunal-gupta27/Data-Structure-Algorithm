package Sorting;

import java.util.*;
public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> l = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                l.add(arr[left]);
                left++;
            } else{
                l.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            l.add(arr[left]);
            left++;
        }
         while(right<=high){
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

       mS(arr,low, mid);
       mS(arr,mid+1, high);
       merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,6,2,4};
        int n = arr.length;
        mS(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
