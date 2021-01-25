package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("dime el numero");
        numero = sc.nextInt();

        if ((numero >= -9) && (numero <= 9))
        {
            System.out.println("el numero tiene una cifra");
        }
        else
            if ((numero >= -99) && (numero <= 99))
            {
                System.out.println("el numero tiene dos cifras");
            }
            else
                if ((numero >= -999 ) && (numero <= 999))
                {
                    System.out.println("el numero tiene tres cifras");
                }
                else
                    if ((numero >= -9999 ) && (numero <= 9999))
                    {
                        System.out.println("el numero tiene cuatro cifras");
                    }
                    else
                        if ((numero >= -99999 ) && (numero <= 99999))
                        {
                            System.out.println("el numero tiene cinco cifras");
                        }
                        else
                        {
                            System.out.println("el numero tiene mas de 5 cifras");
                        }








    }
}
