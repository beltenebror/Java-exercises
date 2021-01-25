package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
 //Escribe una función primosRelativos a la que le pasas dos números enteros y te dice si son primos relativos,
 // es decir, si no tienen ningún divisor común además del 1.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("n1");
        n1 = sc.nextInt();
        System.out.println("n2");
        n2 = sc.nextInt();
        if(primosRelativos(n1,n2))
        {
            System.out.println("son primos relativos");
        }
        else
        {
            System.out.println("no son primos relativos");
        }


    }
    public static boolean primosRelativos(int n1, int n2)
    {
        int i = n1;
        while(!((n1 % i == 0) && (n2 % i == 0)))
        {
            i--;
        }
        if (i==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
