package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creemos la fracción con la que vamos a trabajar introduzca el numerador");
        int numerador = sc.nextInt();
        System.out.println("Ahora el denominador");
        int denominador = sc.nextInt();
        Fracción miFraccion = new Fracción(numerador,denominador);

        int opcion;

        System.out.println("Menú");
        System.out.println();
        System.out.println("1. Negativo de nuesta fracción");
        System.out.println("2. Suma");
        System.out.println("3. Resta");
        System.out.println("4. Multiplicación");
        System.out.println("5. División");
        System.out.println("6. Igual?");
        System.out.println("7. Comparación");


        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.println(miFraccion.negate().toString());
            }
            break;

            case 2:
            {
                System.out.println("Creemos la fracción con la que le sumaremos: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                System.out.println((miFraccion.add(miFraccion2)).toString());

            }
            break;

            case 3:
            {
                System.out.println("Creemos la fracción con la que le restaremos: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                System.out.println((miFraccion.substract(miFraccion2)).toString());
            }
            break;

            case 4:
            {
                System.out.println("Creemos la fracción con la que le multiplicaremos: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                System.out.println((miFraccion.multiply(miFraccion2)).toString());
            }
            break;

            case 5:
            {
                System.out.println("Creemos la fracción con la que le dividiremos: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                System.out.println((miFraccion.divide(miFraccion2)).toString());
            }
            break;

            case 6:
            {
                System.out.println("Creemos la fracción con la que le miraras si es igual: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                System.out.println((miFraccion.compareTo(miFraccion2)));
            }
            break;

            case 7:
            {
                System.out.println("Creemos la fracción con la que le compareremos: introduzca el numerador");
                int numerador2 = sc.nextInt();
                System.out.println("Ahora el denominador");
                int denominador2 = sc.nextInt();
                Fracción miFraccion2 = new Fracción(numerador2,denominador2);
                int provisional = miFraccion.compareTo(miFraccion2);
                switch (provisional)
                {
                    case -1: {System.out.println("La segunda fracción es mayor");}
                    break;

                    case 0:  {System.out.println("Ambas fraciones son iguales");}
                    break;

                    case 1:  {System.out.println("La primera fracción es mayor");}
                    break;
                }
            }
            break;


            default:
                System.out.println("Ese ejercicio no existe");
        }
    }
}