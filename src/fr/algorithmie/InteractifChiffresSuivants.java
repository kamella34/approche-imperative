package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number");
        int nb = scan.nextInt();
        int count = 0;

        for (int i = 0; i <= 10; i++) {
            count = nb + i;
            System.out.println(count);
        }


    }
}

