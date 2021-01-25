package com.company;

import java.util.Scanner;

public class Main
{
           //Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
           //por teclado.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, numero;
        System.out.println("dime el numero");
        numero = sc.nextInt();
        for(i = 1; i <= 10; i++)
        {
            System.out.println(numero + " * " + i + " = "+ numero*i);
        }
    }
}
