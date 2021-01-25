package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("dime el numero del que quieres conocer las cifras");
        numero = sc.nextInt();

        int cifras =numeroCifras(numero);
        System.out.println(cifras);
    }
    public static int numeroCifras(int numero)
    {
        int i = Math.abs(numero);
        int cifras = 0;
        while(i > 0)
        {
           i = i /10;
           cifras = cifras +1;
        }
        if(numero == 0)
        {
            return 1;
        }
        else
        {
            return cifras;
        }

    }
}
