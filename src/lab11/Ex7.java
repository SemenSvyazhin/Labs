package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)  // Фильтруем по длине
                .collect(Collectors.toList());         // Собираем в новый список
    }

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "Programming", "Code");
        int minLength = 4;

        List<String> longWords = filterStringsByLength(words, minLength);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки длиннее " + minLength + " символов: " + longWords);
    }
}
