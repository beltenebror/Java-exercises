package com.company;

import java.sql.Struct;
import java.util.Scanner;

public class Main
{
    //Escribe una función que te diga si un número es par o no. La función se llamará “par” y nos
    // devolverá un valor booleano que será “verdadero” si el número es par y “falso” si es impar.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("dime un numero");
        numero = sc.nextInt();
        if(par(numero))
        {
            System.out.println("par");
        }
        else
        {
            System.out.println("impar");
        }
    }
    public static boolean par(int n)
    {
        if( n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
