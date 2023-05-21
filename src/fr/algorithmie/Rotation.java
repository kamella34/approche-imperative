package fr.algorithmie;

import java.util.Arrays;

public class Rotation {


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int a = array[0];

        for (int i = 0; i < array.length -1; i++) {
            System.out.println(i + "tour " + Arrays.toString(array));
            array[i] = array[i + 1];
            System.out.println(Arrays.toString(array));

        }

        array[array.length-1] = a;
        System.out.println(Arrays.toString(array));
    }




}
