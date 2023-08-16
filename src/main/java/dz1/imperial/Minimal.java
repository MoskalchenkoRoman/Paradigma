package dz1.imperial;

public class Minimal {
    public static void main(String[] args) {

        int[] array = {5, 98, 38, 4, 5, 6, 7, 8, 9};

        Min(array);
    }

    private static void Min(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (mini > arr[i]){
                mini = arr[i];
            }
        }
        System.out.println(mini);
    }
}
