package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a; //definicion de la variable del array
        a = new int[5]; //inicializacion del array

        int[] b = new int[5];  //definicion e inicializacion del tiron

        a[0]=1; //escribimos 1 ern la posicion 0 del array
        a[1]=5;
        a[2]=9;
        a[3]=2;
        a[4]=7;

        System.out.println(a[0]); //Escribimos lo que haya el la posicion 0 del array
        int i;
        for(i=0;i<5;i++)   //o se le puede poner (i=0;i<a.length;i++) a.length= a longitudad del array
        {
            System.out.println(a[i]);
        }
        int[] x = {1,2,3,4,5}

    }
    public static void escribeArray(int[] a)
    {
        int i;
        for(i=0;i<a.length;i++);
    }
    public static void leeArray(int[] a)
    {

    }
}
