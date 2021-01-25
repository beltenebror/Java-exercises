package com.company;

import java.util.Scanner;

public class Main
{
              //Escribe un programa que nos presente un menú con 3 opciones. Eligiendo la opción “a”
              //nos escribirá todos los múltiplos de 11 comprendidos entre 1 y 100. Eligiendo la opción
              //“b” lo mismo, pero con los múltiplos de 17. Eligiendo la opción “c” lo mismo, pero con
              //los múltiplos de 23.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String x;
        int n;
        System.out.println("Si quiere los números múltiplos de 11 entre 1 y 100 escribe a. " +
                "Si quieres lo mismo pero con múltiplos de 17 escriba b. " +
                "Si quieres lo mismo pero con 23 escriba c.");
        x = sc.nextLine();
        while(( !x.equals("a") ) && ( !x.equals("b") ) && ( !x.equals("c") ))
        {
            System.out.println("elegiste mal la opción, vuelve a elegir");
            x = sc.nextLine();
        }
        if(x .equals("a"))
        {
            n = 0;
            while(n <= 89)
            {
                n = n + 11;
                System.out.println(n);
            }
        }
        else
        {
            if(x .equals("b"))
            {
                n = 0;
                while(n <= 83)
                {
                    n = n +17;
                    System.out.println(n);
                }
            }
            else
            {
                if(x .equals("c"))
                {
                    n = 0;
                    while(n <= 77 )
                    {
                        n = n + 23;
                        System.out.println(n);
                    }
                }
            }
        }

    }
}
