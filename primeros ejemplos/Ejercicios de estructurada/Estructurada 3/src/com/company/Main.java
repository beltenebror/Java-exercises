package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cantidad, cantidadeuros, cantidadpesetas;
        String moneda;

        System.out.println("dime la cantidad");
        cantidad = sc.nextDouble();
        sc.nextLine();     //para limpiar el salto de linea de haber leído antes el entero

        System.out.println("la cantidad está en euros o en pesetas?");
        moneda = sc.nextLine();

        if (moneda.equals("euros"))
        {
            cantidadeuros = cantidad;
            cantidadpesetas = cantidadeuros * 166;
            System.out.println(cantidadeuros + " euros es igual a " + cantidadpesetas + " pesetas");
        }
        else
        {
            if (moneda.equals("pesetas"))
            {
                cantidadpesetas = cantidad;
                cantidadeuros = cantidadpesetas / 166;
                System.out.println(cantidadpesetas + " pesetas es igual a " + cantidadeuros + " euros");
            }
            else
            {
                System.out.println("la moneda es incorrecta");
            }

        }

    }
}
