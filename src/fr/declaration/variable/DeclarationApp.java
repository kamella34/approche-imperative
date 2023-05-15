package fr.declaration.variable;

import java.sql.SQLOutput;

public class DeclarationApp {
    public static void main (String[] args){
       byte by = 1;
       short sh = -12;
       int in = 123;
       long lo = 1234L;
       float fl = 1.3F;
       double dbl = 111.99D;
       char cc = 'a';
       boolean bool = true;
       String strg = "HelloWorld, donne moi des \u20ac";
       String randomString = "Voici le résultat d’un calcul :\n 1+5=6";

       System.out.println(by);
       System.out.println(sh);
       System.out.println(lo);
       System.out.println(fl);
       System.out.println(dbl);
       System.out.println(cc);
       System.out.println(bool);
       System.out.println(strg);
       System.out.println(randomString);
    };
}
