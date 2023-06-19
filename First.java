import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {
    public static void main(String[] args) {
        /* Пусть дан произвольный список целых чисел.
        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее ариф. значение
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 3, 4, 1, 10, 7, 8, 9, 6));
        List<Integer> first = new ArrayList<>();

        /*
        // 1) Нужно удалить из него чётные числа
        for (Integer item : list) {
            if (item % 2 == 0) first.add(item);
        }
        System.out.println(first);
        */

        /* // 2) Найти минимальное значение
        int min = list.get(0);
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }

        }
        System.out.println(min);
        */

        /*
        // 3) Найти максимальное значение
        int max = list.get(0);
        for (Integer integer : list)
            if (integer > max) max = integer;
        System.out.println(max);
        */

        // 4) Найти среднее ариф. значение
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        System.out.println(count / list.size());
    }
}
