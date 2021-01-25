package com.company;

import java.util.Scanner;

public class Main
{
  //Escribe una función “max” que nos devuelva el mayor de los dos números que le pasemos por parámetro.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dame el segundo numero");
        n2 = sc.nextInt();
        System.out.println(max(n1, n2));
    }
    public static int max( int a, int b)
    {
        int max = a;
        if(max < b)
        {
            max = b;
        }
        return max;
    }
}
