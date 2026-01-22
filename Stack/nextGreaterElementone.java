package Stack;

public class nextGreaterElementone {
    public static void main(String[] args) {

        // Using Array
        int arr[] = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j]; 
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }

        // Using Stack
        
    }
}
