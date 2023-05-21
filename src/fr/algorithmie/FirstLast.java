package fr.algorithmie;

import org.w3c.dom.ls.LSOutput;

public class FirstLast {



   public static boolean firstLastShort(int[] array) {
        boolean result = (array.length >= 1 && array[0] == array[array.length - 1]) ? true : false;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 1};
        int[] array2 = {6, 15, -3, 6};
        int[] array3 = {1, 15, -3, 6};

        firstLastShort(array1);
        firstLastShort(array2);
        firstLastShort(array3);

    }
}
