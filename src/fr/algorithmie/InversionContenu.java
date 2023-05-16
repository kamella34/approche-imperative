package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];
        for (int f = 0; f <= array.length -1; f++) {
            System.out.println(array[f]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            arrayCopy[array.length - 1 - i] = array[i];
            System.out.println(arrayCopy[array.length - 1 - i]);
        }
    }
}
