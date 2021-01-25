package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c; //números que se comprobarán

        System.out.println("dime el primer número");
        a = sc.nextInt();

        System.out.println("dime el segundo número");
        b = sc.nextInt();

        System.out.println("dime el tercer número");
        c = sc.nextInt();
        if((a == b) || (a == c) || (b == c))
        {
            System.out.println("Los números deben ser diferentes");
        }
        else
        {
            if ((a > b) && (a > c))
            {
                if (b > c)
                {
                    System.out.println(a + " es el mayor " + b + " es el segundo " + c + " es el menor");
                }
                else
                {
                    System.out.println(a + " es el mayor " + c + " es el segundo " + b + " es el menor");
                }

            }
            else
            {
                if((b > a) && (b > c))
                {
                    if (a > c)
                    {
                        System.out.println(b + " es el mayor " + a + " es el segundo " + c + " es el menor");
                    }
                    else
                    {
                        System.out.println(b + " es el mayor " + c + " es el segundo " + a + " es el menor");
                    }
                }
                else
                {
                    if (a > b)
                    {
                        System.out.println(c + " es el mayor " + a + " es el segundo " + b + " es el menor");
                    }
                    else
                    {
                        System.out.println(c + " es el mayor " + b + " es el segundo " + a + " es el menor");
                    }

                }
            }


        }



    }
}
