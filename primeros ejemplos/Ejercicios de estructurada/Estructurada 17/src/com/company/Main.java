package com.company;

import java.util.Scanner;

public class Main
{
          // Calcular la suma de todos los números pares entre 1 y 1000.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int suma, contador;

        contador = 1;
        suma = 0;
        while(contador <= 1000)
        {
            if(contador % 2 == 0)
            {
                suma = suma + contador;
                contador = contador + 1;
            }
            else
            {
                contador = contador +1;
            }
        }
        System.out.println(suma);
    }
}
