package dz4;

import java.math.BigInteger;

public class Primer1 {
    public static int summa(int n){
        if (n < 1){
           return 0;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = i + summa(n - 1);
        }
        return res;
    }

    public static long factorial(int n){
        if (n == 0){
            return 1;
        }
        return n==0||n==1? 1:n*factorial(n-1);
    }
}
