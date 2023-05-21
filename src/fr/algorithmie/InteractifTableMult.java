package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("entrez un nombre");
        int nb = scan.nextInt();
        int a = 0;

        if (nb >= 1 && nb <= 10) {
            for (int i = 1; i < 11; i++) {
                a = nb * i;
                System.out.println(nb + " * " + i + " = " + a);
            }
        } else {
            System.out.print("Vous devez entrer un nombre entre un et dix");
        }
    }
}
