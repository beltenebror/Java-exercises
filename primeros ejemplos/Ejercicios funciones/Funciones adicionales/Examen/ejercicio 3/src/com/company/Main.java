package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(leeHoraSegundos());
    }
    public static int leeHoraSegundos()
    {
        return horaASegundos(leeHora(),leeMinutos(),leeSegundos());
    }

    public static int horaASegundos(int hora, int minutos, int segundos)
    {
        int segundostotales = 0;
        segundostotales = (hora * 3600);
        segundostotales = segundostotales + (minutos * 60);
        segundostotales = segundostotales + segundos;
        return segundostotales;
    }
    public static int leeHora()
    {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("dime la hora");
        hora = sc.nextInt();
        while((hora<0)||(hora>23))
        {
            System.out.println("valor erroneo, vuelve a introducir la hora");
            hora = sc.nextInt();
        }
        return hora;
    }
    public static int leeMinutos()
    {
        Scanner sc = new Scanner(System.in);
        int minutos;
        System.out.println("dime los minutos");
        minutos = sc.nextInt();
        while((minutos<0)||(minutos>59))
        {
            System.out.println("valor erroneo, vuelve a introducir los minutos");
            minutos = sc.nextInt();
        }
        return minutos;
    }
    public static int leeSegundos()
    {
        Scanner sc = new Scanner(System.in);
        int segundos;
        System.out.println("dime los segundos");
        segundos = sc.nextInt();
        while((segundos<0)||(segundos>59))
        {
            System.out.println("valor erroneo, vuelve a introducir los segundos");
            segundos = sc.nextInt();
        }
        return segundos;
    }
}
