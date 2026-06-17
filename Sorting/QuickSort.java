package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
    public static void qS(int[] arr, int low, int high){

        if(low>=high) return;

        int pIndex = partition(arr,low,high);
        qS(arr,low,pIndex-1);
        qS(arr,pIndex+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        int n = arr.length;
        qS(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
