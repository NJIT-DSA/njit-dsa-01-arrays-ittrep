package oy.tol.tra;

public class Algorithms {

    private Algorithms() {

    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int j = 0;
        while (j < array.length - 1) {
            int i = array.length - 1;
            while (i > 0) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    T tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
                i--;
            }
            j++;
        }
    }

    public static <T> void reverse(T[] array) {
        int i = 0;
        while (i < array.length / 2) {
            T temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            i++;
        }
    }
}
