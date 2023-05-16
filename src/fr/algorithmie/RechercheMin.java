package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int minValue = array[0];

        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println(minValue);
    }
}
