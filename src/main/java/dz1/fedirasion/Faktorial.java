package dz1.fedirasion;

import java.math.BigInteger;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число факториал которого интересует:");
        int n = scan.nextInt();
        System.out.print("Ответ = ");
        System.out.println(factorial(n));

    }
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
