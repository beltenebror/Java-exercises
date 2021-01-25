package com.company;

import java.util.Scanner;

public class Main {
    //Escribe la función rombo que te escribe un rombo en pantalla a base de asteriscos (la
    //pirámide del ejercicio 6 sería la cuarta parte del rombo).
    //Opcional: Hacerlo con el número de bucles más pequeño posible (se puede hacer sin
    //bucles incluso).
    public static void main(String[] args)
    {
        int largo;
        Scanner sc = new Scanner(System.in);
        System.out.println("largo del rombo");
        largo = sc.nextInt();
        trianguloEstrellitas(largo);
    }
    public static void trianguloEstrellitas(int largo)
    {
        if((largo >= 3)&&(largo<=20))
        {
            for(int i=1; i <= largo; i++)
            {
                for(int j = 1; j <=(largo-i); j++)
                {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++)
                {
                    System.out.print("**");
                }
                System.out.println();
            }
            for(int i = largo-1; i>= 1; i--)
            {
                for(int j = 1; j <=(largo-i); j++)
                {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++)
                {
                    System.out.print("**");
                }
                System.out.println();
            }
        }
    }
}
