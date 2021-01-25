package com.company;

import java.util.Scanner;

public class Main
{
      // Escribe una función que nos calcule el “mcd” de dos números.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dime el segundo numero");
        n2 = sc.nextInt();
        System.out.println(" el máximo común divisor es " + mcd(n1, n2));
    }
    public static int mcd(int a, int b)
    {
        int i = a;
        while(!((a % i == 0) && (b % i == 0)))
        {
            i--;
        }
        return i;
    }
}
