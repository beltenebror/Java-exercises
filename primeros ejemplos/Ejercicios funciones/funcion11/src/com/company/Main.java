package com.company;

import java.util.Scanner;

public class Main
               //Escribe una función “areaTriangulo” que te calcule el área de un triángulo.
        // Habrá que pasarle como parámetros la base y la altura
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, area;
        System.out.println("dime la altura");
        a = sc.nextDouble();
        System.out.println("dime la base");
        b = sc.nextDouble();
        area = areaTriangulo(a,b);
        System.out.println("el area del triangulo es " + area);
	// write your code here
    }
    public static double areaTriangulo(double a, double b)
    {
        double area;
        area = ((b * a)/2.0);
        return area;
    }
}
