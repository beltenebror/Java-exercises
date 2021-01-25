package com.company;

import java.util.Scanner;

public class Main
{
                        //dos números con la condición de que el segundo sea
                        //mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que sea
                        //correcto y Si los números son correctos, escribe todos los números comprendidos entre
                        //el primer y el segundo número (ambos inclusive).
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, i;

        System.out.println("dame un numero");
        numero1 = sc.nextInt();
        System.out.println("dame un numero mayor que el anterior");
        numero2 = sc.nextInt();

        while(numero1 >= numero2)
        {
            System.out.println("el segundo número no es mayor que el primero, vuelve a darme el primer numero");
            numero1 = sc.nextInt();
            System.out.println("dame un numero mayor que el anterior");
            numero2 = sc.nextInt();
        }

        i = numero1;
        while (i <= numero2)
        {
            System.out.println(i);
            i = i + 1;
        }
    }
}
