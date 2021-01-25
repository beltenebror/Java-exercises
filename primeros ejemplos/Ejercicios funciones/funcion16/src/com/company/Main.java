package com.company;

import java.util.Scanner;

public class Main
{
         //Escribe una función “elevado” a la que le pasas dos números enteros (a y b) y te devuelve el valor
         // de “a” elevado a “b” (sin usar la función Math.pow) (o sea, multiplicando un número muchas veces).
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.println("Número que deseas elevar");
        a = sc.nextInt();
        System.out.println("A cuanto deseas elevarlo");
        b = sc.nextInt();
        result = elevado(a,b);
        System.out.println("el resultado es " + result);
    }
    public static int elevado(int numero, int exponente)
    {
        int i = 1; // contador
        int resultado = 1;
        while (i <= exponente)
        {
            resultado = resultado * numero;
            i = i + 1;
        }
        return resultado;
    }
}
