package com.company;

import java.util.Scanner;

public class Main {
        //Calcular el valor máximo de una serie de 10 números introducidos por teclado
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, max, i;
        System.out.println("dame un numero");
        n = sc.nextInt();
        max = n;
        for( i = 2; i <= 10; i++)
        {
            System.out.println("dame un numero");
            n = sc.nextInt();
            if(n > max)
            {
                max = n;
            }
        }
        System.out.println("el número mayor es " + max);
    }
}
