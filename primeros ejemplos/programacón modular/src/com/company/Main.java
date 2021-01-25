package com.company;

import javax.swing.plaf.SeparatorUI;

public class Main
{

    public static void main(String[] args)
    {
        int valor, n1, n2;
        n2 = 4;
        n1 = 5;
        valor = suma2( n1, n2);
        System.out.println(valor);
        System.out.println(resta2(10, 5));
        System.out.println(restaguay(5, 10));
        if(suspenso(4))
        {
            System.out.println("mu mal");
        }
        impriNumero(5);

    }
    //public static int funcion(int parametro) //hacer función,"public static" + nombrefuncion + (parametros.con.su.tipo)
                //este int devuelve el resultado de nuestra función
    //{}
    //vamos a hacer ahora una funciónq ue sume dos numeros
    public static int suma2(int a, int b)
    {
        int n = a + b;
        return n;
    }

    public static int resta2(int a, int b)
    {
        int n = a - b;
        return n;
    }

    public static int restaguay(int a, int b)
    {
        int n;
        if(a > b)
        {
            n = a - b;
        }
        else
        {
            n = b - a;
        }
        return n;
    }

    public static double euroADolar(double euros)
    {
        double dolar = euros * 1.1116;
        return dolar;
    }

    public static boolean suspenso(double nota)
    {
        boolean resultado;
        if(nota < 5)
        {
            resultado = true; //return true
        }
        else
        {
            resultado = false;  //return false
        }
        return resultado;
    }

    public static void impriNumero(int tope)
    {
        int i;
        for(i = 1; i <= tope; i++)
        {
            System.out.println(i);
        }

    }
    public static void holamundo()
    {
        System.out.println("hola mundo");
    }
}
