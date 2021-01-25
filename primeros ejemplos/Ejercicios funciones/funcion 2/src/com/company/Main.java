package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función que nos diga si un año es bisiesto o no. La función se llamará “bisiesto”
    // y nos devolverá “verdadero” si es bisiesto y “falso” si no lo es.

    // un año es bisieso si es múltiplo de 4, pero si es múltiplo de 100 solo cuando sea múltiplo de 100
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("dime un año");
        año = sc.nextInt();
        if(bisiesto(año))
        {
            System.out.println("es bisiesto");
        }
        else
        {
            System.out.println("no es bisiesto");
        }
    }

    public static boolean bisiesto(int año)
    {
        if(año % 4 == 0)
        {
            if(año % 100 == 0)
            {
                if(año % 400 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }



}
