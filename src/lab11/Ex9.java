package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static List<String> filterLettersOnly(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty() && s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("Hello", "Java8", "StreamAPI", "2023", "OnlyLetters", "!@#", "");
        List<String> result = filterLettersOnly(input);

        System.out.println("Исходный список: " + input);
        System.out.println("Строки только с буквами: " + result);
    }
}
