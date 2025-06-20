package lab11;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex2 {
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        // Преобразуем второй массив в Set для быстрого поиска
        Set<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        // Фильтруем первый массив, оставляя только элементы, присутствующие в Set
        return Arrays.stream(arr1)
                .filter(set::contains)
                .distinct()  // Убираем дубликаты
                .toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 4};
        int[] array2 = {4, 5, 6, 7, 8, 5};

        int[] result = findCommonElements(array1, array2);

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        System.out.println("Общие элементы: " + Arrays.toString(result));
    }
}
