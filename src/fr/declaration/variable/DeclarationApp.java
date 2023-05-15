package fr.declaration.variable;


public class DeclarationApp {
    public static void main(String[] args) {
        byte by = 1;
        short sh = -12;
        int in = 123;
        long lng = 1234L;
        float flt = 1.3F;
        double dbl = 111.99D;
        char cc = 'a';
        boolean bool = true;
        String strg = "HelloWorld, donne moi des \u20ac";
        String randomString = "Voici le résultat d’un calcul :\n 1+5=6";
        final int MA_CONSTANTE = 20;
        int a = 2 ;

        System.out.println(by);
        System.out.println(sh);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(cc);
        System.out.println(bool);
        System.out.println(strg);
        System.out.println(randomString);
        System.out.println(MA_CONSTANTE);
        System.out.println(5/2);
        System.out.println(5.0/2.0);
        System.out.println(a++ +"-"+a+"-"+ ++a);
    };
}
