package com.company;

import java.util.Scanner;

public class Main
{
                  //Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
                  //+ 1000.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int suma, i;
        suma = 0;
        for(i = 0; i <= 1000; i = i + 2)
        {
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
