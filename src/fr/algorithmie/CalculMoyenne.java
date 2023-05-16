package fr.algorithmie;

import java.sql.SQLOutput;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        double somme = 0;
        for (int value : array) {
            somme += value;
        }
        System.out.println(somme);
        System.out.println(somme/array.length);

    }
}
