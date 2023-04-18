import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        System.out.println(list);
        List<Integer> sortedList = Task_1.mergeSort(list);
        System.out.println("Сортировка слиянием: " + sortedList);

        Task_2.removeEvenNumbers(list);

        Task_3.searchValues(list);
    }
}
