package by.it.komarov.jd01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Randomizing randomizing = new Randomizing();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        randomizing.rand(treeSet, 20, 50);
        randomizing.rand(hashSet, 20, 50);

        prnt(hashSet);
        prnt(treeSet);

        prnt(getCross(hashSet, treeSet));
        prnt(getUnion(hashSet, treeSet));
    }

    public static void prnt(Set<Integer> set){
        System.out.println(set);
    }

    public static Set<Integer> getCross(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.retainAll(second);
        return set;
    }

    public static Set<Integer> getUnion(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.addAll(second);
        return set;
    }
}
