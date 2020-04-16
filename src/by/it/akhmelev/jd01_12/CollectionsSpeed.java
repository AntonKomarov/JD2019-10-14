package by.it.akhmelev.jd01_12;

import java.util.Arrays;
import java.util.List;

public class CollectionsSpeed {

    public static void prnt(Object o){
        System.out.println(o.toString());
    }

    public static Object[] randArray(Object[] array, int maxRandValue){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * maxRandValue);
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        randArray(array, 100);

        List<Integer> list = Arrays.asList(array);
    }
}
