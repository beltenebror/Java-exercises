package com.company;

import java.util.Scanner;

public class Main
{
   //Escribe una función “imprimeSerie” a la que le pases dos enteros y te escriba por la pantalla todos los valores
   // comprendidos entre ambos. Lo hará en orden ascendente si el primero es menor que el segundo y descendente en caso
   // contrario. Usa “for”.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println(" dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dime el segundo número");
        n2 = sc.nextInt();
        imprimeSerie(n1, n2);
    }
    public static void imprimeSerie(int a, int b)
    {
        if(a < b)
        {
            for(int x = a; x <=b; x++)
            {
                System.out.println(x);
            }
        }
        else //(a > b)
        {
            for(int x = a; x >= b; x--)
            {
                System.out.println(x);
            }
        }
    }
}
