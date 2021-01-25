package com.company;

import java.util.Scanner;

public class Main
{
     //Escribe la función calendarioGrafico a la que le pasas dos parámetros: el mes y el año.
     //La función nos escribirá por pantalla un calendario del mes indicado.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mes, año;
        mes = sc.nextInt();
        año = sc.nextInt();
        calendarioGrafico(mes, año);

    }
    public static void calendarioGrafico(int mes, int año)
    {
        int diasdelmes = diasMes2(año,mes);
        int diaSemana = diaSemanaFecha(1,mes,año);
        System.out.println(" L  M  X  J  V  S  D");
        System.out.println();
        for(int i = 1; i < diaSemana; i++)
        {
            System.out.print("   ");
        }
        for(int i = 1; i<= diasdelmes; i++)
        {
            if(i < 10)
            {
                System.out.print( " " + i + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
            diaSemana++;
            if(diaSemana == 8)
            {
                System.out.println();
                diaSemana = 1;
            }


        }



    }

    public static int diaSemanaFecha(int dia, int mes, int año)
    {
        int dias = (diasTranscurridos1980(dia, mes, año) + 1);
        int dividido = (dias % 7);
        if(dividido == 0)
        {
            return 7;
        }
        else
        {
            return dividido;
        }
    }

    public static int diasTranscurridos1980(int dia, int mes, int año)
    {
        //calcular los dias de todos los años mientras < que el año que me den
        int diass = 0;


        for (int a = 1980; a < año; a++)
        {
            if(bisiesto(a))
            {
                diass = diass+366;
            }
            else
            {
                diass = diass+365;
            }
        }
        diass = diass +diasTranscurridos(dia, mes, año);
        return diass;
    }

    public static int diasTranscurridos(int dia, int mes, int año)
    {
        int dias = 0;
        for(int i = (mes - 1); i >= 1; i = i - 1)
        {
            dias = dias + diasMes2(año, i);
        }
        dias = dias + dia;
        return dias;


    }

    public static int diasMes2(int año, int mes)
    {
        int dias = 0;
        if(bisiesto(año))
        {
            switch (mes)
            {
                case 1: dias = 31; break;
                case 2: dias = 29; break;
                case 3: dias = 31; break;
                case 4: dias = 30; break;
                case 5: dias = 31; break;
                case 6: dias = 30; break;
                case 7: dias = 31; break;
                case 8: dias = 31; break;
                case 9: dias = 30; break;
                case 10: dias = 31; break;
                case 11: dias = 30; break;
                case 12: dias = 31; break;
            }

        }
        else
        {
            dias = diasMes(mes);

        }
        return dias;

    }

    public static int diasMes(int a)
    {
        int  dias = 0;
        switch (a)
        {
            case 1: dias = 31; break;
            case 2: dias = 28; break;
            case 3: dias = 31; break;
            case 4: dias = 30; break;
            case 5: dias = 31; break;
            case 6: dias = 30; break;
            case 7: dias = 31; break;
            case 8: dias = 31; break;
            case 9: dias = 30; break;
            case 10: dias = 31; break;
            case 11: dias = 30; break;
            case 12: dias = 31; break;
        }
        return dias;
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
