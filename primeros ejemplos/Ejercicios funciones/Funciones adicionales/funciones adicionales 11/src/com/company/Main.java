package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe tres funciones que se llamarán maximo, medio y minimo. A cada una de las funciones le pasaremos tres valores
    // enteros (a, b, c). La función maximo nos devolverá el mayor de los tres, la función minimo el menor de los tres y
    // la función medio el del medio.
    //Ej.: maximo(7, 1, 4) nos devolverá 7.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(medio(a, b, c));
    }

    public static int maximo(int a, int b, int c)
    {
        if ((a > b) && (a > c))
        {
            return a; //a es el mayor
        }
        else
        {
            if ((b > a) && (b > c))
            {
                return b;//b es el mayor
            }
            else
            {
                return c;
            }
        }

    }

    public static int minimo(int a, int b, int c)
    {
        if ((a < b) && (a < c))
        {
            return a; //a es el menor
        }
        else
        {
            if ((b < a) && (b < c))
            {
                return b;//b es el menor
            }
            else
            {
                return c;
            }
        }

    }

    public static int medio(int a, int b, int c)
    {
        if ((a > b) && (a > c))
        {
            if (b > c)
            {
                return b;
            }
            else
            {
                return c;
            }

        }
        else
        {
            if ((b > a) && (b > c))
            {
                if (a > c)
                {
                    return a;
                }
                else
                {
                    return c;
                }
            }
            else
            {
                if (a > b)
                {
                    return a;
                }
                else
                {
                    return b;
                }

            }

        }
    }
}
