package org.asd;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
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
}



