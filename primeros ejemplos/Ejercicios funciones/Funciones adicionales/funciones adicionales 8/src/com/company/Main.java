package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{
    //Escribe la función cuadradoEstrellitas que te pinta un cuadrado realizado con
    //estrellitas. El tamaño máximo será 20. Si escribes más de 20 o menos de 1, dará
    //un mensaje de error en lugar de pintar el cuadrado
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        tamaño = sc.nextInt();
        cuadradoEstrellitas(tamaño);

    }

    public static void cuadradoEstrellitas(int tamaño)
    {
        if ((tamaño >= 1) && (tamaño <= 20))
        {
            System.out.println();

            for (int i = 1; i <= tamaño ; i++)
            {
                if ((i == 1) || (i == tamaño))
                {
                    for (int j = 1; j <= tamaño; j++)//linea final
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else
                {
                    System.out.print("*");

                    for (int j = 1; j <= tamaño - 2; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }

        }
        else
        {
            System.out.println("ERROR");
        }
    }
}