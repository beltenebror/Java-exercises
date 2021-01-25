package com.company;

import java.util.Scanner;

public class Main
{
                    //
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, i;

        System.out.println("dame un numero");
        numero1 = sc.nextInt();
        System.out.println("dame otro numero");
        numero2 = sc.nextInt();

       if(numero1 < numero2)
       {
           i = numero1;
           while (i <= numero2)
           {
               System.out.println(i);
               i = i + 1;
           }
       }
       else //numero 1>numero2
       {
           i = numero1;
           while(i >= numero2)
           {
               System.out.println(i);
               i = i - 1;
           }
       }
    }
}
