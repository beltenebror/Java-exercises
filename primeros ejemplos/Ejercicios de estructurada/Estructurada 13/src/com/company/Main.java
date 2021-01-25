package com.company;

import java.util.Scanner;

public class Main
{
       //tabla del numero que les diga
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, contador, resultado;

        contador = 1;

        System.out.println("de que número quieres la tabla?");
        numero = sc.nextInt();

        while(contador <= 10)
        {
            resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado);
            contador = contador + 1;
        }



    }
}
