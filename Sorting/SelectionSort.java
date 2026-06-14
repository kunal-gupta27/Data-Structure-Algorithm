package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1};
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
