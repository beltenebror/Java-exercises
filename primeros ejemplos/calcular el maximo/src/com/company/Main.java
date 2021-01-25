package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, n2, n3, max, contador;
        contador = 1;
        System.out.println("dime el numero 1");
        n = sc.nextInt();
        max = n;
        while(contador < 5)
        {
            System.out.println("dime otro numero ");
            n = sc.nextInt();
            if(n > max)
            {
                max = n;
            }
            contador = contador + 1;
        }
        System.out.println(" el numero mayor es "+ max);

      //  System.out.println("dime otro numero");
       // n2 = sc.nextInt();

      //  if(n2 > n)
      //  {
      //      max = n2
      //  }
      //  System.out.println("dime otro numero");
      //  n3 = sc.nextInt();
      //  if(n3 > max)
       // {
       //     max = n3

      //  }

    }
}
