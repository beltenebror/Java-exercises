package com.company;

import java.util.Scanner;

public class Main
{
                //Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
                //el producto de ese número por todos los enteros menores que él. Por ejemplo, el
                //factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, i, factorial;
        System.out.println("de qué número quieres el facorial?");
        numero = sc.nextInt();
        factorial = 1;

        for(i = numero; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("el factorial de " + numero + " es igual a " + factorial);

    }
}
