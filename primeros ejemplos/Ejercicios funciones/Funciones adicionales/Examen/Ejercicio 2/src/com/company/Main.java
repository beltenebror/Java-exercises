package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, resultado;
        System.out.println("dime el numero del que quieres la raiz");
        n= sc.nextInt();
        int i = 0;
        resultado=0;
        while(resultado<n)
        {
            resultado = i*i;
            i = i + 1;
        }
        if(resultado>n)
        {
            System.out.println((i-2) + " y pico");
        }
        else
        {
            System.out.println((i-1));
        }
    }
}
