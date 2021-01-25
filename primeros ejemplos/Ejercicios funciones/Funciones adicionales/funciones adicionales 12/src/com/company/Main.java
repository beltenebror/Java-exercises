package com.company;

import java.util.Scanner;

public class Main
{
 //Escribe la función romboide, que nos pintará un romboide con asteriscos. Habrá que
 //pasarle dos parámetros: la altura y la longitud. La longitud será el número de asteriscos
 //que hay en cada piso y la altura el número de pisos que tendrá.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura,longitud;
        altura=sc.nextInt();
        longitud=sc.nextInt();
        romboide(altura,longitud);
    }
    public static void romboide(int altura, int longitud)
    {
        for(int i=1;i<=altura;i++)
        {
            for(int j = altura-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=longitud;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
