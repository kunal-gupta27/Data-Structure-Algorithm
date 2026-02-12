package Recursion;

public class Main {
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static void printDecreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        // printIncreasing(5);
        // System.out.println();
        // printDecreasing(5);
        System.out.println(factorial(5));
    }

    
}
