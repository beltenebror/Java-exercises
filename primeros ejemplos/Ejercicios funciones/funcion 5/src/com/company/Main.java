package com.company;

import java.util.Scanner;

public class Main
{
      //Escribe una función “signo” a la que le pasemos un número y nos devuelva “1” si es positivo,
      // “0” si es cero y “-1” si es negativo.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, signonumero;
        System.out.println("dime el número a comprobar el signo");
        n = sc.nextInt();
        signonumero = signo(n);
        System.out.println(signonumero);

    }
    public static int signo(int n)
    {
        if( n < 0)
        {
            int result = -1;
            return result;
        }
        else
        {
            if(n == 0)
            {
                int result = 0;
                return result;
            }
            else
            {
                int result = 1;
                return result;
            }
        }
    }
}
