package com.company;

import java.util.Scanner;

public class Main
{
         //Escribe una función “pulgadasACentimetros” a la que le pases un valor en pulgadas (de tipo double)
         // y te devuelva el valor en centímetros. Haz también la función “centímetrosAPulgadas”.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pulgadas, centimetros;
        System.out.println("Dime el núero de pulgadas que queires pasar a centimetros");
        pulgadas = sc.nextDouble();
        centimetros = pulgadasACentimetros(pulgadas);
        System.out.println("son "+ centimetros + " centimetros");

    }
    public static double pulgadasACentimetros(double a)
    {
        double b;
        b = a * 2.54;
        return b;
    }
    public static double centímetrosAPulgadas(double a)
    {
        double b;
        b = a / 2.54;
        return b;
    }
}
