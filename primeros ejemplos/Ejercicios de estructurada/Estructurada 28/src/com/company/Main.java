package com.company;

import java.util.Scanner;

public class Main
{
             //Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
             //escribe todos los números comprendidos entre ambos en orden ascendente. Si el
             //primero es mayor que el segundo, escribe todos los números comprendidos entre
             //ambos en orden descendente.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, i;
        System.out.println("dime el primer numero");
        numero1 = sc.nextInt();
        System.out.println("dime el segundo numero");
        numero2 = sc.nextInt();
        if (numero1 < numero2) //en orden ascendente del 1 al 2
        {
            for(i = numero1; i <= numero2; i++)
            {
                System.out.println(i);
            }
        }
        else // 1>2 en ordend escendente
        {
            for(i = numero1; i >= numero2; i--)
            {
                System.out.println(i);
            }
        }
    }
}
