package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    //Escribe la función trianguloEstrellitas. La función te pedirá un número que deberá ser como mínimo el número 3
    // y como máximo el 20. Si el número no es correcto, escribirá “ERROR”. La función escribirá por pantalla una
    // pirámide a base de estrellitas como la del ejemplo. La función deberá funcionar para cualquier número entre 3 y 20
    // (o sea, nada de escribir las estrellitas a mano).
    public static void main(String[] args)
    {
        int lineas;
        Scanner sc = new Scanner(System.in);
        lineas = sc.nextInt();
        trianguloEstrellitas(lineas);

    }
    public static void trianguloEstrellitas(int tam)
    {
        if(tam >= 3 && tam <= 20)
        {
            for (int i = 1; i <= tam; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
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
