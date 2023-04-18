// 1. Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) <= right.get(0)) {
                result.add(left.get(0));
                left.remove(0);
            } else {
                result.add(right.get(0));
                right.remove(0);
            }
        }
        while (!left.isEmpty()) {
            result.add(left.get(0));
            left.remove(0);
        }
        while (!right.isEmpty()) {
            result.add(right.get(0));
            right.remove(0);
        }
        return result;
    }
}
