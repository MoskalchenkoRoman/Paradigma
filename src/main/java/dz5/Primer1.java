package dz5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Primer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число : ");
        int m = scanner.nextInt();
        System.out.print("Введите последнее число : ");
        int n = scanner.nextInt();

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = m; i < n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        System.out.printf(Arrays.toString(primes.toArray()));

    }


}
