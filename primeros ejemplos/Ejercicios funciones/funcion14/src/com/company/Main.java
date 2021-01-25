package com.company;

import java.util.Scanner;

public class Main {
       //Escribe una función “leeNatural” que nos lea un número natural desde el teclado. La función nos pondrá un
       // texto en el que se nos indica que introduzcamos un número y después nos leerá el número del teclado.
       // Si el número introducido es 0 o negativo, nos volverá a pedir otro número.
    public static void main(String[] args)
    {
        int a;
        a = leeNatural();
        System.out.println(a);

    }
    public static int leeNatural()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("dime un número natural");
        a = sc.nextInt();
        while (a <= 0)
        {
            System.out.println("valor erroneo introducelo de nuevo");
            a = sc.nextInt();
        }
        return a;

    }
}
