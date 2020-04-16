package by.it.komarov.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskA1 {
    @Override
    public String toString() {
        return "TaskA1{" +
                "grades=" + grades +
                '}';
    }

    private List<Integer> grades = new ArrayList<>();


    public void clearBad(List<Integer> grades){
        Iterator<Integer> iterator = grades.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() <= 3) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        TaskA1 a1 = new TaskA1();
        Randomizing randomizing = new Randomizing();
        randomizing.rand(a1.getGrades(), 20, 100);
        System.out.println(a1.getGrades());

        a1.clearBad(a1.getGrades());
        System.out.println(a1.getGrades());

    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
