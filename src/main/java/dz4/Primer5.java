package dz4;

public class Primer5 {
    public static String arrayString(String[] array) {
        String res = "";
        for (int i = 0; i < array.length; i++) {
          res = res + (array[i] + ",");
        }
        return res.toString();
    }
}
