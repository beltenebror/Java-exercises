package com.company;

import java.util.Scanner;

public class Main
{
       //Escribe la función rombo que te escribe un rombo en pantalla a base de asteriscos (la
       //pirámide del ejercicio 6 sería la cuarta parte del rombo).
       //Opcional: Hacerlo con el número de bucles más pequeño posible (se puede hacer sin
       //bucles incluso).
    public static void main(String[] args)
    {
        int lineas;
        Scanner sc = new Scanner(System.in);
        System.out.println("largo del rombo");
        lineas = sc.nextInt();
        trianguloEstrellitas(lineas);

    }
    public static void trianguloEstrellitas(int lar)
    {
        if(lar >= 3 && lar <= 20)
        {
            for (int i = 1; i <= lar; i++)
            {
                for(int k = 1; k <= lar-i; k++)
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("**");
                }
                System.out.println();
            }
            for(int i=(lar - 1); i >= 1; i--)
            {
                for(int k = lar-i; k >= 1; k--)
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("**");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
