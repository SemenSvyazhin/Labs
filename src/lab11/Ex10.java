package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n < threshold)  // Фильтруем числа меньше порога
                .collect(Collectors.toList());  // Собираем в новый список
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 3, 15, 9);
        int threshold = 8;

        List<Integer> filteredNumbers = filterLessThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа меньше " + threshold + ": " + filteredNumbers);
    }
}
