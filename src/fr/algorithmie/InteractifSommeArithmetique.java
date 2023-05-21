package fr.algorithmie;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number");
        int nb = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= nb; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
