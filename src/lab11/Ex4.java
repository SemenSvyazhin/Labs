package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)  // Возводим каждое число в квадрат
                .collect(Collectors.toList());  // Собираем в новый список
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squares = squareNumbers(numbers);

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Квадраты чисел: " + squares);
    }
}
