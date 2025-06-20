package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)  // Проверяем делимость без остатка
                .collect(Collectors.toList());  // Собираем результаты в новый список
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
        int divisor = 2;

        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + ": " + divisibleNumbers);
    }
}
