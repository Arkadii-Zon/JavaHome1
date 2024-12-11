package org.asd;

import java.util.Arrays;

public class H1 {

    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        int ind = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        System.out.println(ind);
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        int ind = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                ind = i;
            }
        }
        System.out.println(ind);
    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println();
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("target");
            }
        }
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (avg < array[i]) {
                System.out.println(array[i]);
            }
        }
    }


    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13() {
        int[] array = {1, 2, 3, 4};

    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, 2, 3, 4};
        int min = array[0];
        int min2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > min) {
                min2 = min;
                min = array[i];
            }
            if (array[i] < min2 && array[i] > min) {
                min2 = array[i];
            }
        }
        System.out.println(min2);
    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void task15() {

        int[] array = {1, 2, 3, 4};
        int leftIndex = 0;
        int rigthIndex = array.length - 1;
        while (leftIndex < rigthIndex) {
            int a = array[leftIndex];
            array[leftIndex] = array[rigthIndex];
            array[rigthIndex] = a;
            leftIndex++;
            rigthIndex--;

        }
        System.out.println(Arrays.toString(array));
    }

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }


    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2, 4};
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    hasDuplicates = true;
                    break;

                }
            }

        }
        System.out.println(hasDuplicates);
    }

    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        int[] newarray = new int[array.length - count];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newarray[a++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newarray));
    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30};
        int divisor = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        int multiply = array[0];
        for (int i = 1; i < array.length; i++) {
            multiply = multiply * array[i];
        }
        System.out.println(multiply);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    break;
                }
                if (j == array.length - 1) {
                    count++;

                }
            }
        }
        System.out.println(count);
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        if (min != 0) {
            int a = array[min];
            array[min] = array[0];
            array[0] = a;
        }
        System.out.println(Arrays.toString(array));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
        int count = 1;
        int maxl = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                if (count > maxl) {
                    maxl = count;
                    count = 1;
                }
                if (count > maxl) {
                    maxl = count;
                }
            }
        }
        System.out.println(maxl);
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        int sum = 0;
        boolean a = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                a = true;
                continue;
            }
            if (a && array[i] > 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] ar2 = new int[array.length];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            boolean dubl = false;
            for (int j = 0; j < a; j++) {
                if (array[i] == ar2[j]) {
                    dubl = true;
                    break;
                }
            }
            if (!dubl) {
                ar2[a++] = array[i];
            }

        }
        int[] ar3 = Arrays.copyOf(ar2, a);
        System.out.println(Arrays.toString(ar3));
    }

    public static void main(String[] args) {

    }


}



