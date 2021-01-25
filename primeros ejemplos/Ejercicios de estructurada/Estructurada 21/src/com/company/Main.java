package com.company;

import java.util.Scanner;

public class Main {
         //Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
         //una serie de 10 números introducidos por teclado
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n, max, min, media, suma, contador;


        System.out.println("dime el numero 1");
        n = sc.nextInt();
        max = n;
        min = n;
        suma = n;

        contador = 1;
        while(contador < 10)
        {
            System.out.println("dime otro numero ");
            n = sc.nextInt();
            suma = suma + n;
            if(n > max)
            {
                max = n;
            }
            if(n < min)
            {
                min = n;
            }
            contador = contador + 1;
        }
        media = suma / 10;
        System.out.println(" el numero mayor es "+ max);
        System.out.println("el número menor es " + min);
        System.out.println("la media es " + media);




    }
}
