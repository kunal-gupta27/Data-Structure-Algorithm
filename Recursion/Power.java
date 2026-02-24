package Recursion;

public class Power {
    public static int power(int p, int q){
        if(q==0) return 1;

        int smallpow = power(p,q/2);

        if(q%2==0){
            return smallpow * smallpow;
        }
        return p * smallpow * smallpow;
    }
    public static void main(String[] args) {
        int p = 2;
        int q = 10;
        System.out.println(power(p, q));
    }
}
