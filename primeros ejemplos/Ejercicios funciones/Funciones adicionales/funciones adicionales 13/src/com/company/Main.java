package com.company;

import java.util.Scanner;

public class Main
{
 //Escribe el programa calculaNotaFinal. El programa nos ira pidiendo 7 doubles correspondientes a las notas de los 7
 // exámenes que se hacen en una asignatura durante el curso. La nota final que nos escribirá por pantalla será la media
 // de los 7 doubles, con una excepción: si hemos suspendido dos o más exámenes durante el curso, la nota final
 // no superará el 4 aunque la media salga más alta. Por ejemplo: si las notas son [10, 10, 10, 10, 10, 2, 3], la media
 // saldría 7’86, pero devolveríamos un 4 porque ha suspendido dos exámenes.
 //El programa tendrá que controlar que cada nota introducida esté entre 0 y 10. Si no lo está, no la dará por válida y
 // la volverá a pedir.
    public static void main(String[] args)
    {
        calculaNotaFinal();
    }
    public static void calculaNotaFinal()
    {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4,n5,n6,n7;
        double numerosuspensos=0;
        System.out.println("nota1");
        n1 = sc.nextDouble();
        if(n1<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota2");
        n2 = sc.nextDouble();
        if(n2<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota3");
        n3 = sc.nextDouble();
        if(n3<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota4");
        n4 = sc.nextDouble();
        if(n4<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota5");
        n5 = sc.nextDouble();
        if(n5<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota6");
        n6 = sc.nextDouble();
        if(n6<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        System.out.println("nota7");
        n7 = sc.nextDouble();
        if(n7<5)
        {
            numerosuspensos = numerosuspensos+1;
        }
        double notafinal =(n1+n2+n2+n4+n5+n6+n7)/7;
        if(numerosuspensos>=2)
        {
            if (notafinal >= 4)
            {
                notafinal = 4;
            }
        }
        System.out.println(notafinal);
    }
}
