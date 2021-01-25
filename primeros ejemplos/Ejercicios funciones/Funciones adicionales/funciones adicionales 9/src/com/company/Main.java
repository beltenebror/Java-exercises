package com.company;

import javax.management.openmbean.CompositeType;

public class Main
{
//Escribe una función bisiestosXXI que nos escriba por pantalla todos los años bisiestos
//del siglo XXI.
    public static void main(String[] args)
    {
        bisiestosXXI();

    }
    public static void bisiestosXXI()
    {
        for(int i=2001; i<=2100;i++)
        {
            if(bisiesto(i))
            {
                System.out.println(i);
            }
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
