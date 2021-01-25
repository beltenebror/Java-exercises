package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función escribeSerieNumeros3 que nos pide tres números. El primero
    //tendrá que ser un número entre 1 y 100; si el número no es correcto, lo vuelve a pedir.
    //El segundo tendrá que ser un número entre 1 y 100 pero con la condición de que sea
    //mayor que el primero; lo volverá a pedir mientras no sea correcto. El tercero tendrá que
    //ser un número entre 1 y 100 con la condición de que sea mayor que el primero y menor
    //que el segundo; también lo volverá a pedir hasta que sea correcto.
    //Una vez que tengamos los tres números, nos escribirá por pantalla los números
    //comprendidos entre el primero y el tercero y en otra línea los números comprendidos
    //entre el tercero y el segundo. Mejor con un ejemplo:
    //Los tres números son 5, 12 y 7. Nos tendrá que escribir:
    //5 6 7
    //7 8 9 10 11 12

    public static void main(String[] args)
    {
        escribeSerieNumeros3();
    }
    public static void escribeSerieNumeros3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("3 números entre 1 y 100 serán escritos por ti, los dos primeros serán el rango entre los que estará el tercero.");
        System.out.println("primero, rango mínimo");
        int n1= sc.nextInt();
        while((n1< 1) || (n1>100))
        {
            System.out.println("el número esta mal, repítelo");
            n1= sc.nextInt();
        }
        System.out.println("segundo, rango máximo");
        int n2= sc.nextInt();
        while((n2< 1) || (n2>100) ||(n2<=n1+1))
        {
            System.out.println("el número esta mal, repítelo");
            n2= sc.nextInt();
        }
        System.out.println("tercero, número entre los rangos");
        int n3= sc.nextInt();
        while((n3<=n1)||(n3>=n2))
        {
            System.out.println("el número esta mal, repítelo");
            n3= sc.nextInt();
        }
        int i = n1;
        while (i <= n3)
        {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        int j = n3;
        while (j <= n2)
        {
            System.out.print(j+ " ");
            j = j + 1;
        }






    }
}
