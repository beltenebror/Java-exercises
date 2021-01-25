package com.company;

import java.util.Scanner;

public class Main
{
               //primeros 10 pares
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, contador;
        i = 1;
        contador = 1;
        while(contador <= 10 )
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                i = i + 1;
                contador = contador + 1;
            }
            else
            {
                i = i + 1;
            }
        }
    }
}
