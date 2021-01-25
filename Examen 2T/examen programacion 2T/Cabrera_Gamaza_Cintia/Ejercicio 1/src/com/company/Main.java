package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        char[][]sopa=leeSopaLetras("sopa1.txt");
        escribeArrayBi(sopa);
    }

    public static char[][] leeSopaLetras(String nombre)
    {
        int tamañoActual, tamañoAnterior=0; //valor por defecto porque java no me deja en pa
        char[] arrayLinea;
        int i,j;
        boolean bien=true;
        char[][] sopa;
        List<String> lineas = new LinkedList<>();
        try//meto todas las lineas a una lista
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);

            String linea=br.readLine();
            while(linea!=null)
            {
                lineas.add(linea);
                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        for(i=0;i<lineas.size();i++)//compruebo si los tamaños son iguales
        {

            if(i==0)
            {
                tamañoActual=lineas.get(i).length();
                tamañoAnterior=tamañoActual;
            }
            else
            {
                tamañoActual=lineas.get(i).length();
            }
            if(tamañoActual!=tamañoAnterior)
            {
                bien=false;
            }

        }
        if(bien)//si los tamaños son iguales voy añadiento al array
        {
            sopa= new char[lineas.size()][tamañoAnterior];
            for(i=0;i<lineas.size();i++)
            {
                arrayLinea=lineas.get(i).toCharArray();
                for(j=0;j<arrayLinea.length;j++)
                {
                    sopa[i][j]=arrayLinea[j];
                }
            }
        }
        else
        {
            sopa= new char [0][0];
        }

        return sopa;

    }


    public static void escribeArrayBi(char[][] abi)
    {
        int i, j;
        String temporal;
        for (i = 0; i < abi.length; i++)
        {
            System.out.print("[");
            for (j = 0; j < abi[i].length; j++)
            {
                temporal = String.valueOf(abi[i][j]);
                temporal = padLeft(temporal, 5);
                System.out.print(temporal);

                if (j < abi[i].length-1)
                {
                    System.out.print(",");
                }

            }
            System.out.print("]");
            System.out.println();

        }
    }
    public static String padLeft(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a= ' ' + a ;
        }
        return a;
    }

}
