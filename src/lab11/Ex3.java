package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static List<String> filterUppercaseStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("Hello", "world", "Java", "stream", "API", "");
        List<String> result = filterUppercaseStrings(input);

        System.out.println("Исходный список: " + input);
        System.out.println("Строки с заглавной буквы: " + result);
    }
}
