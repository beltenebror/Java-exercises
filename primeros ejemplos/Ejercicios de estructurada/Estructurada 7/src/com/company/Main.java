package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, solucion1, solucion2; // numeros de la ecuación

        System.out.println("dime el A de la ecuación");
        a = sc.nextDouble();
        System.out.println("dime el B de la ecuación");
        b = sc.nextDouble();
        System.out.println("dime el C de la ecuación");
        c = sc.nextDouble();

        delta = ( (b * b) - (4 * a * c));
        if ( a == 0 )
        {
            System.out.println("no es una ecuacuón de segundo grado");
        }
        else
            if (delta < 0)
            {
                System.out.println("la ecuación no tiene solución");
            }
            else
                if (delta == 0)
                {
                    solucion1 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("la solucion es " + solucion1);
                }
                else
                {
                    solucion1 = (-b + Math.sqrt(delta)) / (2 * a);
                    solucion2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("las soluciones son " + solucion1 + " y " + solucion2);
                }



    }
}
