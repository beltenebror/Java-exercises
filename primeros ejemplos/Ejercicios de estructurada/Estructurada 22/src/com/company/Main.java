package com.company;

import java.util.Scanner;

public class Main {
   ////hacer el factorial del número que me den
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, factorial, i;
        System.out.println("De qué número quieres el factorial?");
        numero = sc.nextInt();
        i = numero;
        factorial = 1;
        while(i >= 1)
        {
            factorial = factorial * i;
            i = i -1;
        }
        System.out.println("el factorial de " + numero + " es igual a " + factorial);

    }
}
