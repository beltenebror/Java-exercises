package com.company;

import java.util.Scanner;

public class Main
{
                //El usuario de este programa será un profesor, que introducirá las notas de sus 30
                //alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
                //aprobados hay.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nota, i, aprobados, suspensos;
        suspensos = 0;
        aprobados = 0;
        for( i = 1; i <= 30; i++)
        {
            System.out.println("Introduce la nota");
            nota = sc.nextInt();
            if(nota < 5)
            {
                suspensos = suspensos + 1;
            }
            else
            {
                aprobados = aprobados + 1;
            }
        }
        System.out.println("son " + aprobados + " aprobados y " + suspensos + " suspensos");
    }
}
