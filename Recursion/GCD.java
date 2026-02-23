public class GCD {
    public static int gcd(int x, int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    
    //using euclid algorithm

    public static int gcdrec(int x, int y) {
        if(y==0) return x;
        return gcdrec(y,x % y);
    }
    public static void main(String[] args) {
        int x=7;
        int y=19;
        System.out.println(gcd(x, y));
        System.out.println(gcdrec(x, y));
    }
}
