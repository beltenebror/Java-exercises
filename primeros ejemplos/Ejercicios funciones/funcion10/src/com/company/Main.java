package com.company;

import java.util.Scanner;

public class Main
{
     //Escribe una función “primo” que nos devuelva “verdadero” si el número que le
     // pasamos por parámetro es primo y “falso” en caso contrario
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("dime que numero quieres comprobar si es primo");
        n = sc.nextInt();
        if(primo(n))
        {
            System.out.println("es primo");

        }
        else
        {
            System.out.println("no es primo");
        }
    }
    public static boolean primo(int n)
    {
        int divisores;
        divisores = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                divisores = divisores + 1;
            }
        }
        if(divisores > 2)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
