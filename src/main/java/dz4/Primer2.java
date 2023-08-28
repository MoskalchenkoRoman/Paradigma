package dz4;

public class Primer2 {
    public static int fibonaci(int n){
        if (n <= 2){
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}
