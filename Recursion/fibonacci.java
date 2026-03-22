public class fibonacci {
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n =10;
        System.out.print(fibo(n));
    }
}
