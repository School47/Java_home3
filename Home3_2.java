// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class Home3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        removeEvenNumbers(numbers);

        System.out.println("Список после удаления четных чисел:");
        for (int num : numbers) {
            System.out.print(num+" ");
        }
    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 != 0) { // Проверяем, является ли число нечетным
                oddNumbers.add(num);
            }
        }
        
        numbers.clear(); 
        
        for (int num : oddNumbers) {
            numbers.add(num); // Добавляем обратно только нечетные числа
        }
    }
}