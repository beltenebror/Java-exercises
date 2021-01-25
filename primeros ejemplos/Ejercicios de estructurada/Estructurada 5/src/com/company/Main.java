package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double x, y, z; // numeros

        System.out.println("dime el numero x");
        x = sc.nextDouble();
        System.out.println("dime el numero y");
        y = sc.nextDouble();
        System.out.println("dime el numero z");
        z = sc.nextDouble();

        if ((x == (y - 1)) && (y == (z - 1)))
        {
            System.out.println("los numeros son consecutivos");
        }
        else
        {
            System.out.println("los numeros no son consecutivos");
        }
    }
}
