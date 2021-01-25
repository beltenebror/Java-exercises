package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n, max, contador;
        contador = 1;
        System.out.println("dime un número");
        n = sc.nextInt();
        max = n;
        while(contador < 10)
        {
            System.out.println("dime otro número ");
            n = sc.nextInt();
            if(n > max)
            {
                max = n;
            }
            contador = contador + 1;
        }
        System.out.println(" el número mayor es "+ max);
    }
}
