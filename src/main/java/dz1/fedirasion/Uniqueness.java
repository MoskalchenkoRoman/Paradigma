package dz1.fedirasion;

import java.util.ArrayList;
import java.util.HashSet;

public class Uniqueness {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(3);
        HashSet<Integer> integerHashSet = new HashSet<>(list);
        System.out.println(integerHashSet);
    }
}
