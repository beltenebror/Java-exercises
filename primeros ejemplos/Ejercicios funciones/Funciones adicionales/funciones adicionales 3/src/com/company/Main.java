package com.company;

import java.util.Scanner;

public class Main
{
   //Escribe la función calderilla a la que le pasamos una cantidad de dinero (menor de 5€, puede tener decimales)
   // y nos muestra por pantalla qué monedas debemos usar para dar el cambio (con el menor número posible de monedas).
   // En esta función sí que podéis poner println dentro.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cantidad;
        System.out.println("dime la cantidad");
        cantidad = sc.nextDouble();
        calderilla(cantidad);

    }
    public static void calderilla(double dinero)
    {
        int centimos;
        if(dinero < 5 && dinero > 0)
        {
            centimos = (int) Math.floor(dinero * 100);
            //int centimos =  Double.valueOf(dinero*100).intValue();

            int m2euros = centimos / 200;
            centimos = centimos % 200;

            int m1euros = centimos /100;
            centimos = centimos % 100;


            int m50cent = centimos / 50;
            centimos = centimos - (m50cent * 50);

            int m20cent = centimos / 20;
            centimos = centimos - (m20cent * 20);

            int m10cent = centimos / 10;
            centimos = centimos - (m10cent * 10);

            int m5cent = centimos / 5;
            centimos = centimos - (m5cent * 5);

            int m2cent = centimos / 2;
            centimos = centimos - (m2cent * 2);

            int m1cent = centimos;
            System.out.println(m2euros + " moneda 2€, " + m1euros + " moneda 1€, " + m50cent + " moneda 50cent, " + m20cent + " monedas 20cent, "
                    + m10cent + " monedas 10cent, " + m5cent + " monedas 5cent, " + m2cent + " monedas 2cent, " + m1cent + " monedas 1cent, ");
        }
        else
        {
            System.out.println("Dinero no válido");
        }
    }
}
