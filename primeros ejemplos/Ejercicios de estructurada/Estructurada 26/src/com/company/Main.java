package com.company;

import java.util.Scanner;

public class Main
{
             //Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
             //pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
             //impares del 1 al 10.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String tipo;
        int i;
        System.out.println("que quieres los pares o los impares?");
        tipo = sc.nextLine();
        if (tipo.equals("pares"))
        {
            for(i = 2; i <=10; i = i + 2)
            {
                System.out.println(i);
            }
        }
        else
            if(tipo.equals("impares"))
            {
                for(i= 1; i <=10; i = i +2)
                {
                    System.out.println(i);
                }
            }
            else
            {
                System.out.println( "te has equivocado en el tipo de número");
            }
    }
}
