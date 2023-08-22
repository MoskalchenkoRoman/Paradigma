package dz2;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();

        System.out.print(fibonacci(n));
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
