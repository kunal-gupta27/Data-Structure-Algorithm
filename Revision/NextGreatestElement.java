public class NextGreatestElement {
    public static void main(String[] args) {
        int arr[] = {2,6,16, 1, 2, 34, 15, 20, 17};
        int n = arr.length;
        int[] ans = new int[n];
        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
