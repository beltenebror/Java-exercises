package com.company;

import javax.security.sasl.SaslClient;
import java.awt.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Escribe un número entre el 1 y el 10");
        n = sc.nextInt();

        //if(n<1 || n>10)
        //{
        //  System.out.println("el numero esta mal, escribelo de nuevo");
        //    n = sc.nextInt();
        //}
        // System.out.println("el numero es");
        while(n<1 || n>10)
        {
          System.out.println("el numero esta mal, escribelo de nuevo");
            n = sc.nextInt();
        }
         System.out.println("el numero es" + n);


    }
}
