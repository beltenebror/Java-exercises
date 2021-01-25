package com.company;

import java.util.Scanner;

public class Main
{
                  // impares o pares, entre 1 y 10
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String tipo;

        i = 1;
        System.out.println("Que quieres los números pares o impares");
        tipo = sc.nextLine();
        if(tipo.equals("impares"))
        {
            while(i <= 10)
            {
                if(i % 2 == 0)
                {
                    i = i + 1;
                }
                else
                {
                    System.out.println(i);
                    i = i + 1;
                }
            }

        }
        else
        {
            if (tipo.equals("pares"))
            {
                while(i <= 10)
                {
                    if(i % 2 == 0)
                    {
                        System.out.println(i);
                        i = i + 1;

                    }
                    else
                    {
                        i = i + 1;
                    }

                }
            }
            else
            {
                System.out.println("Escribiste mal el tipo de número que querias");
            }

        }
    }
}
