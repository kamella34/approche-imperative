package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        int count = 0;
        int tour = 11;

        System.out.println("ENTREZ 10 CHIFFRES");
        do{
            System.out.print( "Encore "+ --tour +" -> Entrez chiffre : ");
            int nb= scan.nextInt();
            array[count] = nb;
            count += 1;
            System.out.println(Arrays.toString(array));

            int maxValue = array[0];
            for (int value : array) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            System.out.println("Le plus grand chiffre est "+maxValue);

        } while(count < 10);


    }

}

