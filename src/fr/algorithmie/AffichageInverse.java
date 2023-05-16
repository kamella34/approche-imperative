package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("start1");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("start2");
        for (int i = array.length -1 ; i >=0 ; i--) {
            System.out.println(array[i]);
        }
        System.out.println("start3");
        int arrayDestination[] = new int[array.length];
        System.arraycopy(array, 0, arrayDestination, 0, array.length);
        for (int i = 0; i < arrayDestination.length; i++) {
            System.out.println(arrayDestination[i]);
        }


    }
}
