package by.it.kharitonenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern p = Pattern.compile("[а-яёА-ЯЁ]{4,}");
        Matcher matcher = p.matcher(sb);
        while (matcher.find()) {
            String word = matcher.group();
            if (matcher.end()-matcher.start() > matcher.group().length()) {
                sb.setCharAt(matcher.start() + 3, '#');
                sb.setCharAt(matcher.start() + 6, '#');
            }
        }
        System.out.println(sb);
    }
}