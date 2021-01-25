package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double numero, paradividir, resto, divisores;

        System.out.println("dime el número para comprobar si es primo");
        numero = sc.nextDouble();
        paradividir = 2;
        divisores = 0;

        while (paradividir < numero)
        {
            resto = numero % paradividir;
            if (resto == 0)
            {
                divisores = divisores + 1;
            }

            paradividir = paradividir + 1;
        }

        if(divisores < 0)
        {
            System.out.println("el numero no es primo");
        }
        else
        {
            System.out.println("el numero es primo");
        }


    }
}
