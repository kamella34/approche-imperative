package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);
        int nb;


        do {
            System.out.print("Entrez un nombre entre 0 et 100 : ");
            nb= scan.nextInt();
            if (nb < randomNumber) {
                System.out.print("TROP PETIT ! -> ");
            } else if (nb > randomNumber) {
                System.out.print("TROP GRAND! -> ");
            } else {
                System.out.print("You Win");
            }
        }
        while (nb != randomNumber);

    }
}
