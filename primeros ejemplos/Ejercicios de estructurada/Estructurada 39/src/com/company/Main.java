package com.company;

import java.util.Scanner;

public class Main
{
                //Escribe un programa que calcule el mínimo común múltiplo de 2 números.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i, mul;
        System.out.println("dime un número");
        n1 = sc.nextInt();
        System.out.println("dime otro número");
        n2 = sc.nextInt();
        i = n1;
        mul = 0;
        while(i <= n1*n2)
        {
            if( (i % n1 == 0) && (i % n2 == 0) )
            {
                mul = i;
                i = ((n1*n2)+1);
            }
            i = i + 1;
        }
        System.out.println(mul + " es el mínimo común multiplo");

    }
}
