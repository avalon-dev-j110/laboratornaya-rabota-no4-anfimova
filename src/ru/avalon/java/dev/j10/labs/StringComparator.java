package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String one, String two) {

        /*
        Лексикографическое сравнение
        < 0 - строка, вызывающая метод, сначала лексикографична (сначала в словаре)
        == 0 - две строки лексикографически эквивалентны
        > 0 - параметр, переданный методу compareTo, сначала лексикографичен

        Таким образом, "compUter".compareTo ("compArison") вернет значение (int) 'u' - (int) 'a' (21)
        Так как это положительный результат, параметр ("comparison") сначала лексикографичен
         */

        // Лексикографическое сравнение в обратном порядке
        if (one.compareTo(two) < 0) {
            return 1;
        } else if (one.compareTo(two) > 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
