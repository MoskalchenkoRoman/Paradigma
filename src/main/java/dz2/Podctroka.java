package dz2;


import java.util.*;


public class Podctroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число суммы подмассивов: ");
        int n = sc.nextInt();
        int[] arr = {5, 4, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(podctroka(arr,n));
    }


        public static List<List<Integer>> podctroka ( int[] arr, int n){
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> podArray = new ArrayList<>();
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] <= n) {
                    sum += arr[i];
                    podArray.add(arr[i]);
                } else {
                    result.add(podArray);
                    podArray = new ArrayList<>();
                    sum = 0;
                }
            }
            if (!podArray.isEmpty()) {
                result.add(podArray);
            }
            return result;
        }
    }

