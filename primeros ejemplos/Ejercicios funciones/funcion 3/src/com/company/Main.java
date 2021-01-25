package com.company;

import java.util.Scanner;

public class Main
{
   //Escribe una función “tablaMultiplicar” a la que le pases un entero y nos escriba la tabla de
   // multiplicar de ese número.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("de que numero quieres la tabla");
        n = sc.nextInt();
        tablaMultiplicar(n);
    }
    public static void tablaMultiplicar(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println( n + " * " + i + " = " + (n*i));
        }
    }
}
