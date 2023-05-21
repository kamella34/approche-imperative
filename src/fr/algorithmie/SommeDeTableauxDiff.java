package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[][] array = {
                {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4},
                {-1, 12, 17, 14, 5, -9, 0, 18}
        };

        int array0 = array[0].length;
        int array1 = array[1].length;
        int diffArray = array0 - array1;


        int[] sommeArrayBidimentionnel = new int[array[0].length];


        for (int i = 0; i < array1; i++) {
            sommeArrayBidimentionnel[i] = array[0][i] + array[1][i];
        }

        if (array0 < array1) {
            for (int i = array1; i < array0; i++) {
                sommeArrayBidimentionnel[i] = array[1][i];
            }
        } else {
            for (int i = array1; i < array0; i++) {
                sommeArrayBidimentionnel[i] = array[0][i];
            }
        }

        for (int value : sommeArrayBidimentionnel) {
            System.out.print(value + " ");
        }
    }


}
