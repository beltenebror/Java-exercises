package com.company;

import java.util.Scanner;

public class Main
{
                       //Escribe un programa que nos escriba los 10 primeros números que no sean múltiplos ni
                       //de 2 ni de 3.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n;
        i = 1;
        for(n = 1; i <= 10; n++)
        {
          if( (n % 2 != 0) && (n % 3 != 0))
          {
              System.out.println(n);
              i = i + 1;
          }
        }
    }
}
