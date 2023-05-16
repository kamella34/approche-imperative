package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int sommeArray1 = 0;
        int sommeArray2 = 0;
        for (int value : array1) {
            sommeArray1 += value;
        }
        for (int value : array2) {
            sommeArray2 += value;
        }
        System.out.println(sommeArray1 + sommeArray2);

    }

}
