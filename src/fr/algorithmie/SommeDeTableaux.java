package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[][] array = {
                {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4},
                {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1}
        };

        int[] sommeArrayBidimentionnel = new int[array[0].length];

        for (int i = 0; i < array[0].length; i++) {
            sommeArrayBidimentionnel[i] = array[0][i] + array[1][i];
        }

        for (int value : sommeArrayBidimentionnel) {
            System.out.print(value + " ");
        }
    }
}


