// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void removeEvenNumbers(List list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Все нечётные числа: " + list);
    }
}
