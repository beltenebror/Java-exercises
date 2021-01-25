package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
                      //Juego del número secreto. El ordenador elegirá un número al azar entre 1 y 100. El
                      //usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas: "mi
                      //número es mayor" o "mi número es menor", hasta que el usuario acierte. Entonces el
                      //ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar
                      //el número secreto.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int random, numero;
        Random r = new Random();
        random = r.nextInt(100);
        System.out.println("intenta adivianar el número");
        numero = sc.nextInt();
        while(numero != random)
        {
            if(numero > random)
            {
                System.out.println("es un número más pequeño, vuelve a intentarlo");
                numero = sc.nextInt();
            }
            else
            {
                System.out.println("es un número más grande, vuelve a intentarlo");
                numero = sc.nextInt();
            }
        }
        System.out.println("ACERTASTE!!!");
    }
}
