package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “factorial” que nos calcule el factorial de un número entero.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, resul;
        System.out.println("dime el número");
        n = sc.nextInt();
        resul = factorial(n);
        System.out.println(resul);
    }
    public static int factorial(int n)
    {
        int result = 1;
        int i = 1; //contador y para multiplicarlo;
        while(i <= n)
        {
            result = result * i;
            i = i + 1;
        }
        return result;
    }
}
