package H2;

import java.util.Arrays;

public class HomW2 {
    // 1. Найти сумму элементов массива целых чисел.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    // 2. Найти длину самой длинной строки в массиве строк.
    public static void task2() {
        String[] array = {"cat", "elephant", "dog"};
        int maxlenth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxlenth) {
                maxlenth = array[i].length();
            }
        }
        System.out.println(maxlenth);
    }

    // 3. Проверить, содержит ли массив строк заданное слово.
    public static void task3() {
        String[] array = {"apple", "banana", "cherry"};
        String target = "banana";
        boolean cher = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                cher = true;
            }

        }
        System.out.println(cher);
    }

    // 4. Подсчитать количество строк, содержащих заданный символ.
    public static void task4() {
        String[] array = {"apple", "banana", "cherry"};
        char target = 'a';
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 5. Найти строку с максимальным количеством символов 'e'.
    public static void task5() {
        String[] array = {"elephant", "eagle", "dog"};
        String maxString = "";
        char target = 'e';
        int maxCount = 0;
        int count = 0;
        String[] array1 = new String[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == target) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        maxString = array[i];
                    }
                }

            }
        }
        System.out.println("Строка с максимальным количеством 'e': " + maxString + "");
    }

    // 6. Удалить из массива строк все строки, содержащие заданное слово.
    public static void task6() {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("bread")) {
                count++;
            }
        }
    }

    // 7. Найти минимальный элемент массива целых чисел.
    public static void task7() {
        int[] array = {3, 1, 4, 1, 5};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);

    }

    // 8. Найти строку с минимальной длиной.
    public static void task8() {
        String[] array = {"cat", "elephant", "dog"};
        String min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min.length() > array[i].length() ){
                min = array[i];
            }
        }
        System.out.println(min);

    }

    // 9. Подсчитать количество четных чисел в массиве.
    public static void task9() {
        int[] array = {1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }

    // 10. Найти строку, которая встречается чаще всего.
    public static void task10() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
        String mostFrequent = "";
        int maxCount = 0;
        String max = array[0];
        for (int i = 0; i < array.length; i++) {

        }
    }

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        String min = array[0];
        String min1 = array[0];
        String min2 = array[0];
        String[] a2 = new String[3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length() < array[j].length()){
                    min = array[i];
                }
            }
            a2 [0] = min;
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].length() <= min.length()){
                min1 = array[i];
            }

            a2 [1] = min1;
        }

        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < array.length; j++) {
                if (array[i].length() > min1.length()){
                    min2 = array[i];
                }
            }
            a2 [2] = min2;
        }
        System.out.println(Arrays.toString(a2));
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        String l1 = array[0];
        String l2 = array[0];
        String l3 = array[0];
        String l4 = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i].length() > l1.length() && array[i].length() == array[j].length()){
                    l1 = array[i];
                    l2 = array[j];
                }
                if (array[i].length() < l1.length() && array[i].length() == array[j].length()) {
                    l3 = array[i];
                    l4 = array[j];
                }
            }
        }
        System.out.println("Строки одинаковой длины " + l1 + ", " + l2);
        System.out.println("Строки одинаковой длины " + l3 + ", " + l4);
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean f = Arrays.equals(array1, array2);
        System.out.println(f);
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        for (int i = 0; i < array1.length; i++) {

        }
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};

    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
    }
    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};

    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};

    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};

    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
    }

}
