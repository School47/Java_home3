// Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.List;

public class Home3_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(3);
        
        sortListWithMerge(list);
        
        System.out.println("Отсортированный список:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    
    public static void sortListWithMerge(List<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int mid = list.size() / 2;
        
        // Разделение списка на две половины
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int j = mid; j < list.size(); j++) {
            right.add(list.get(j));
        }
        
        sortListWithMerge(left); // Рекурсивная сортировка левой половины списка
        sortListWithMerge(right); // Рекурсивная сортировка правой половины списка
        
        merge(list, left, right); // Слияние двух отсортированных половин
    }
    
    public static void merge(List<Integer> list, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;
        
        // Слияние левой и правой половин в исходный список
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        
        // Копирование оставшихся элементов левой половины
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        
        // Копирование оставшихся элементов правой половины
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}