package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double anno;
        System.out.println("dime el año");
        anno = sc.nextDouble();
        if ((anno % 4) == 0)
        {
            System.out.println("el año es bisiesto");
        }
        else
        {
            System.out.println("el año no es bisiesto");
        }
	// write your code here
    }
}
