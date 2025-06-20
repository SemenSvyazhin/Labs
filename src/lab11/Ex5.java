package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "grape", "pineapple", "pear");
        String substring = "app";

        List<String> filtered = filterStrings(words, substring);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки содержащие '" + substring + "': " + filtered);
    }
}
