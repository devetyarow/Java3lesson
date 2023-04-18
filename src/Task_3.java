// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void searchValues(List<Integer> list){
        int min = Collections.min(list);
        int max = Collections.max(list);
        int sum = 0;
        for (int value : list) {
            if (value < min) min = value;
            if (value > max) max = value;
            sum += value;
        }

        double avg = (double) sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}
