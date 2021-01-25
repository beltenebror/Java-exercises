package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cuantosnumeros, numero, sumadenumeros, media;
        sumadenumeros = 0;
        cuantosnumeros = 0;

        System.out.println(" ve diciendome números, cuando quieras parar itroduce un valor negativo");
        numero = sc.nextDouble();

        while(numero >= 0)
        {
            cuantosnumeros = cuantosnumeros + 1;
            sumadenumeros = sumadenumeros + numero;
            System.out.println("otro numero");
            numero = sc.nextDouble();


        }
        media = sumadenumeros / cuantosnumeros;
        System.out.println(media);

    }
}
