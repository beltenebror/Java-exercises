package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numeroa, numerob, resta;
        System.out.println("dime el primer numero");
        numeroa = sc.nextInt();
        System.out.println("dime el segundo numero");
        numerob = sc.nextInt();
        if (numeroa > numerob)
        {
            resta = numeroa - numerob;
            System.out.println(numeroa + " - " + numerob + " = " + resta);
        }
        else
        {
            resta = numerob - numeroa;
            System.out.println(numerob + " - " + numeroa + " = " + resta);
        }

    }
}
