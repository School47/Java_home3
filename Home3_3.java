// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.List;

public class Home3_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);

        int min = findMin(numbers);
        int max = findMax(numbers);
        double average = findAverage(numbers);

        System.out.println("Исходный список:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее значение: " + average);
    }

    public static int findMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static double findAverage(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.size();
    }
}