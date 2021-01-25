package com.company;

import java.util.Scanner;

public class Main
{
           //Escribe una función “notaEnTexto” a la que le pasamos la nota de un alumno como un double
           // y nos devolverá la calificación en formato texto (“aprobado”, “suficiente”, etc.).
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        String respuesta;
        System.out.println("cual es nota del 1 al 10");
        nota = sc.nextDouble();
        respuesta = notaEnTexto(nota);
        System.out.println(respuesta);

    }
    public static String notaEnTexto(double n)
    {
        String string;
        if(n < 5)
        {
            string = "suspenso";
        }
        else
        {
            if(n < 6)
            {
                string = "suficiente";
            }
            else
            {
                if(n < 7)
                {
                    string = "bien";
                }
                else
                {
                    if(n < 9)
                    {
                        string = "notable";
                    }
                    else
                    {
                        string = "SOBRESAlIENTE!!";
                    }
                }
            }
        }
        return string;
    }

}
