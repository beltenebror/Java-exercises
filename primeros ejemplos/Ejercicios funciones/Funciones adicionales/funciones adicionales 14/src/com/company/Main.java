package com.company;

import java.util.Scanner;

public class Main
{
//Escribe dos funciones:
//• Escribe la función mesEnTexto a la que le pasaremos un entero correspondiente a un mes y nos devolverá un string
// con ese mes escrito en texto. Por ejemplo: si le pasamos un 10 nos devolverá “octubre”.
//• Escribe la función escribeFechaBonita. La función recibirá tres enteros por parámetro: el día, el mes y el año
// y nos escribirá la fecha por pantalla en el formato siguiente: “dia de mes de año” (ej.: 31/11/1980 = “31 de noviembre
// de 1980”). La función no devuelve nada porque escribe el resultado por pantalla. En esta función tendremos que usar la
// función anterior.
//Si la fecha que introducimos no es válida, nos escribirá “Fecha no válida” por pantalla en lugar de la fecha.
    public static void main(String[] args)
    {
        escribeFechaBonita(1,1,2019);
    }
    public static void escribeFechaBonita(int dia, int mes, int año)
    {
        int diasdeesemes = diasMes2(año,mes);
        if((año<1000)||año>3000)
        {
            System.out.println("illo la fecha no vale");
        }
        else
        {
            if((mes <1|| mes >12))
            {
                System.out.println("illo la fecha no vale");
            }
            else
            {
                if(dia<=diasdeesemes)
                {
                    System.out.println(dia +" de " + mesEnTexto(mes) + " de " + año);
                }
                else
                {
                    System.out.println("illo la fecha no vale");
                }
            }
        }



    }
    public static String mesEnTexto(int mes)
    {
        String devolveresto;
        switch (mes)
        {
            case 1: devolveresto = "enero";break;
            case 2: devolveresto = "febrero";break;
            case 3: devolveresto = "marzo";break;
            case 4: devolveresto = "abril";break;
            case 5: devolveresto = "mayo";break;
            case 6: devolveresto = "junio";break;
            case 7: devolveresto = "julio";break;
            case 8: devolveresto = "agosto";break;
            case 9: devolveresto = "septiembre";break;
            case 10: devolveresto = "octubre";break;
            case 11: devolveresto = "noviembre";break;
            case 12: devolveresto = "diciembre";break;
            default: devolveresto = "error"; break;

        }
        return devolveresto;
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
