package com.company;

import java.util.Scanner;

public class Main
{
 //Escribe una función “min” que nos devuelva el menor de los dos números que le pasemos por parámetro.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dime el segundo numero");
        n2 = sc.nextInt();
        System.out.println("el mínimo es " + min(n1, n2));

    }
    public static int min(int a, int b)
    {
        int min = a;
        if(min > b)
        {
            min = b;
        }
        return min;
    }
}
