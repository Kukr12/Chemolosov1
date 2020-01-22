package homejobe;

import java.util.Arrays;

public class BubbleSo {
    private static String[] array = {" 23", " 43", "wer"

    };

    public static void main(String[] args) {
        for (int j = 0; j < array.length; j--) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                    String t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

