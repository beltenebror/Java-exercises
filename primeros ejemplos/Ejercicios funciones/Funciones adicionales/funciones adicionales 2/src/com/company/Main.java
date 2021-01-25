package com.company;

import java.util.Scanner;

public class Main
{
//Escribe una función centigradosAFahrenheit que nos convierta una temperatura que está en grados centígrados a
// grados Fahrenheit. La función tendrá un parámetro, que será un número real, y devolverá otro número real.
// La fórmula es: Temp.(F)=1,8*Temp.(C°)+32.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int centigrados;
        System.out.println("centigrados");
        centigrados = sc.nextInt();
        System.out.println(centigradosAFahrenheit(centigrados) + " fahrenheit");

    }
    public static double centigradosAFahrenheit(double centigrados)
    {
        double fahrenheit = (centigrados*1.8)+32;
        return fahrenheit;

    }
}
