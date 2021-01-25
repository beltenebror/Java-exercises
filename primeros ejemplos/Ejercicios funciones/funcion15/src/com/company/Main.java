package com.company;

import java.util.Scanner;

public class Main
{
           //Escribe una función “leeNúmero” a la que le pasas dos parámetros (a y b) y nos lee del teclado un número
           // comprendido entre a y b (ambos incluidos). Si el número no es correcto, te vuelve a pedir
           // que lo introduzcas.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, numero;
        System.out.println("cual es el numero mínimo?");
        a = sc.nextInt();
        System.out.println("cual es el numero maximo");
        b = sc.nextInt();
        numero = leeNúmero(a, b);
        System.out.println(numero);
    }
    public static int leeNúmero(int min, int max)
    {
        Scanner sca = new Scanner(System.in);
        int n;
        System.out.println("dime el número");
        n = sca.nextInt();
        while((n < min)|| (n > max))
        {
            System.out.println("el número no entra en el rango, vuelve a escribierlo");
            n = sca.nextInt();
        }
        return n;
    }
}
