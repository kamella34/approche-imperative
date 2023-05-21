package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number between 1 and 10");
        int nb = scan.nextInt();


        while (nb < 1 || nb > 10) {
            System.out.print("enter a number between 1 and 10");
            nb = scan.nextInt();
        }
        System.out.println(nb);
    }
}