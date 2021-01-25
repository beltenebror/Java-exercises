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
        int aprobados, suspensos, contador;
        double nota;
        contador = 1;
        aprobados = 0;
        suspensos = 0;
        while(contador <= 30)
        {
            System.out.println("introduce la nota");
            nota = sc.nextDouble();
            if(nota >= 5)
            {
                aprobados = aprobados + 1;
                contador = contador + 1;

            }
            else
            {
                suspensos = suspensos + 1;
                contador = contador + 1;
            }

        }
        System.out.println("el numero de aprobados es" + aprobados);
        System.out.println("el numero de suspensos es" + suspensos);


    }
}
