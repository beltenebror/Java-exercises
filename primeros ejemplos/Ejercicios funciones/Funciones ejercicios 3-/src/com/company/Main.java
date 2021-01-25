package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “segundosTranscurridos1980” a la que le pasas 6 parámetros: día,
    //mes, año, hora, minutos y segundos y te dice cuántos segundos han transcurrido
    //desde el 1 de enero de 1980.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int horas1, minutos1, segundos1, año, mes, dia, segundostranscurridos;
        System.out.println("hora 1");
        horas1 = sc.nextInt();
        System.out.println("minutos1");
        minutos1 = sc.nextInt();
        System.out.printf("segundos 1");
        segundos1 = sc.nextInt();
        System.out.println(" dia");
        dia = sc.nextInt();
        System.out.printf("mes");
        mes = sc.nextInt();
        System.out.printf("año");
        año = sc.nextInt();
        segundostranscurridos = 0;
        segundostranscurridos = segundosTranscurridos1980(año,mes,dia,horas1,minutos1,segundos1);
        System.out.println(segundostranscurridos);
    }
    public static int segundosTranscurridos1980 (int año, int mes, int dia, int horas, int minutos, int segundos)
    {
        int diastras = diasTranscurridos1980(dia,mes,año);
        int horastotales = horas + (diastras*24);
        int segundosentre = horaASegundos(horastotales,minutos,segundos);
        return segundosentre;

    }

    public static int segundosTranscurridos(int horas1, int minutos1, int segundos1, int horas2, int minutos2, int segundos2)
    {
        int segundosprimerahora = horaASegundos(horas1,minutos1,segundos1);
        int segundossegundahora = horaASegundos(horas2, minutos2, segundos2);
        int segundosentre = Math.abs(segundosprimerahora - segundossegundahora);
        return segundosentre;
    }

    public static void escribeSegundosBonito(int seg) //decirle al profe que esto se puede hacer con la anterior o que
    {
        escribeHoraBonita(0,0,seg);
    }

    public static void escribeHoraBonita(int hora, int minutos, int segundos)
    {
        int segundost=horaASegundos(hora,minutos,segundos);
        int horass = (segundost/3600);
        segundost = (segundost % 3600);
        int minutoss = (segundost / 60);
        segundost = (segundost % 60);
        int segundoss = segundost;
        if(horass < 10 )
        {
            if(minutoss < 10 && segundoss < 10)
            {
                System.out.println("0" + horass + ":" + "0" + minutoss + ":" + "0" + segundoss );
            }
            else
            {
                if(minutoss < 10 && segundoss >= 10)
                {
                    System.out.println("0" + horass + ":" + "0" + minutoss + ":" + segundoss );
                }
                else
                {
                    if(minutoss >= 10 && segundoss < 10)
                    {
                        System.out.println("0" + horass + ":" + minutoss + ":" + "0" + segundoss );
                    }
                    else // minutoss >= 10 segundos >=10
                    {
                        System.out.println( "0" + horass + ":" + minutoss + ":" + segundoss );
                    }
                }

            }
        }
        else // horas mayor o igual a 10
        {
            if(minutoss < 10 && segundoss < 10)
            {
                System.out.println(horass + ":" + "0" + minutoss + ":" + "0" + segundoss );
            }
            else
            {
                if(minutoss < 10 && segundoss >= 10)
                {
                    System.out.println(horass + ":" + "0" + minutoss + ":" + segundoss );
                }
                else
                {
                    if(minutoss >= 10 && segundoss < 10)
                    {
                        System.out.println(horass + ":" + minutoss + ":" + "0" + segundoss );
                    }
                    else // minutoss >= 10 segundos >=10
                    {
                        System.out.println( horass + ":" + minutoss + ":" + segundoss );
                    }
                }

            }
        }
        // hora pero sin 0 delante System.out.println(horass + ":" + minutoss + ":" + segundoss );
    }

    public static int horaASegundos(int hora, int minuto, int segundos)
    {
        int segundost = 0;
        segundost = (hora * 3600);
        segundost = segundost + (minuto * 60);
        segundost = segundost + segundos;
        return segundost;
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

    public static int diasEntreFechas( int dia1, int mes1, int año1, int dia2, int mes2, int año2)
    {
        //dias fecha 2 menos dias fecha 1 asi saco la dias ebtre las dos fechas
        int fecha1 = diasTranscurridos1980(dia1, mes1, año1);
        int fecha2 = diasTranscurridos1980(dia2, mes2, año2);
        int diasentre = Math.abs(fecha1 - fecha2);
        return diasentre;

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