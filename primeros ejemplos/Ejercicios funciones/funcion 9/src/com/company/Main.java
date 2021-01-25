package com.company;

import java.util.Scanner;

public class Main
{
   //9. Escribe una función que nos calcule el “mcm” de dos números.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dime el segundo numero");
        n2 = sc.nextInt();
        System.out.println("el mínimo común múltiplo es " + mcm(n1, n2));
    }
    public static int mcm(int a, int b)
    {
        int i = a;
        while(!((i % a == 0 )&&(i % b == 0)))
        {
            i++;
        }
        return i;
    }
}
