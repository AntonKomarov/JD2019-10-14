package by.it.komarov.jd01_12;

import javax.print.attribute.IntegerSyntax;
import java.lang.reflect.Array;
import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Randomizing randomizing = new Randomizing();
        Set<Integer> treeSet = new TreeSet<>();
    }

    public static Set<Integer> getCross(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.retainAll(second);
        return set;
    }

    public static Set<Integer> getUnioun(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.addAll(second);
        return set;
    }
}
