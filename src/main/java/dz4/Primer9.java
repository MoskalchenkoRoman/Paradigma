package dz4;

public class Primer9 {
    public static int[] clearf(int[] arr){
        int [] arrres = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrres[i] = arr[i]*2;
        }
        return arrres;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(array[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
