package dz4;

import java.util.Arrays;

import static dz4.Primer1.factorial;
import static dz4.Primer1.summa;
import static dz4.Primer2.fibonaci;
import static dz4.Primer5.arrayString;
import static dz4.Primer9.arrayToString;
import static dz4.Primer9.clearf;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int f = 4;
        int fi = 8;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arry = {"Я","этого","не ","понимаю"};
        System.out.println("Сумма от 1 до " + n +" = " + summa(n));
        System.out.println(f + "!" + " = " + factorial(f));
        System.out.println(fi + " - число фибоначи = " + fibonaci(fi));
        System.out.println("Первый список - " + arrayToString(arr));
        System.out.println("Второй список (перемножение элементов первого списка) - " + arrayToString(clearf(arr)));
        System.out.println(Arrays.toString(arry));
        System.out.println("Слияние элементов :" + arrayString(arry));
    }
}
