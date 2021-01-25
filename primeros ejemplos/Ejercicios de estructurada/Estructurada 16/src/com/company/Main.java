package com.company;

import java.util.Scanner;

public class Main
{
           //Escribir todos los números impares entre dos números A y B introducidos por teclado.
             //Antes habrá que comprobar cuál de los dos números A y B es mayor.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, contador;
        System.out.println("dame el primer numero");
        a = sc.nextInt();
        System.out.println("dame el segundo numero");
        b = sc.nextInt();

        if(a < b)
        {
           contador = a;
           while(contador <= b )
           {
               if (contador % 2 == 0)
               {
                   contador = contador + 1;
               }
               else
               {
                   System.out.println(contador);
                   contador = contador +1;
               }
           }
        }
        else // a > b
        {
            contador = b;
            while(contador <= a)
            {
                if (contador % 2 == 0)
                {
                    contador = contador + 1;
                }
                else
                {
                    System.out.println(contador);
                    contador = contador +1;
                }

            }

        }
    }
}
