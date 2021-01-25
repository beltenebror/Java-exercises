package com.company;

import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class Main
{
               //Escribe un programa que calcule el máximo común divisor de 2 números.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2, d1, dt, i;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("dime el segundo numero");
        n2 = sc.nextInt();
        i = n1;
        dt = 0;
        while (i >= 1)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                dt = i;
                i = 0;
            }

            i = i - 1;
        }
        System.out.println(" el máximo común divisor es " + dt);

    }
}
