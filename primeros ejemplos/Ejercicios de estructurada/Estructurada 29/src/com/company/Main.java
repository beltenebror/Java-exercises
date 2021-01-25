package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main
{
          //Escribir todos los números impares entre dos números A y B introducidos por teclado.
          //Antes habrá que comprobar cuál de los dos números A y B es mayor.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        System.out.println("dime el primer numero");
        a = sc.nextInt();
        System.out.println("dime el segundo numero");
        b = sc.nextInt();
        if(a > b)
        {
            if (b % 2 == 0 )
            {
                for( i = b + 1; i <= a; i = i + 2)
                {
                    System.out.println(i);
                }
            }
            else
            {
                for( i = b; i <= a; i = i + 2)
                {
                    System.out.println(i);
                }
            }

        }
        else //a<b
        {
            if (b % 2 == 0 )
            {
                for( i = a + 1; i <= b; i = i + 2)
                {
                    System.out.println(i);
                }
            }
            else
            {
                for( i = a; i <= b; i = i + 2)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
