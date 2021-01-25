package com.company;

import java.util.Scanner;

public class Main
{
         //Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
         //una serie de 10 números introducidos por teclado.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, max, min, suma, media, i;
        System.out.println("dame un numero");
        n = sc.nextInt();
        max = n;
        min = n;
        suma = n;
        for( i = 2; i <= 10; i++)
        {
            System.out.println("dame un numero");
            n = sc.nextInt();
            suma = suma + n;
            if(n > max)
            {
                max = n;
            }
            if(n < min)
            {
                min = n;
            }

        }
        media = suma / 10;
        System.out.println("el número mayor es " + max);
        System.out.println("el número menor es " + min);
        System.out.println("la meda de los números es " + media);
    }
}
