package dz1.imperial;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Сумма четных чисел = ");
        System.out.println(summ(arr));

    }
    public static int summ (int arr[]){
        int resalt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                resalt = resalt + arr[i];
            }
        }
        return resalt;
    }
}
