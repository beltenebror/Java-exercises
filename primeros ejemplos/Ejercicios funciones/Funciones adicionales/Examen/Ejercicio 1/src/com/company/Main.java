package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("dime el primer numero");
        n1 = sc.nextInt();
        while(n1 % 2 == 0)
        {
            System.out.println("el numero es erroneo vielve a escribirlo");
            n1 = sc.nextInt();
        }

        System.out.println("dime el segundo numero");
        n2 = sc.nextInt();
        while((n2 % 2 == 0)||(n2<=n1))
        {
            System.out.println("el numero es erroneo vielve a escribirlo");
            n2 = sc.nextInt();
        }
        for(int i=n1; i<=n2; i= i + 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=n2 ;i>= n1;i= i - 2)
        {
            System.out.print(i + " ");
        }

    }
}
