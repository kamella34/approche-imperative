package fr.algorithmie;

public class FirstLast6 {



    public static boolean firstLast(int[] array) {
        boolean result;
        if (array != null && array[0] == 6 || array[array.length - 1] == 6) {
            result = true;
            System.out.println("true");
        } else {
            result = false;
            System.out.println("false");
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8};
        int[] array2 = {1, 15, -3, 6};
        int[] array3 = {6, 15, -3, 2};
        firstLast(array1);
        firstLast(array2);
        firstLast(array3);

    }

}
