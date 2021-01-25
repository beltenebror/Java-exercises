package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
	// definicion de arrat bidimensional
        int [][] array;  //si quisiera que fuera de 3 dimensiones porngo un [] más
        array = new int[2][3];
        array [0] [0]=5;
        array [0] [1]=7;
        array [0] [2]=9;
        array [1] [0]=-5;
        array [1] [1]=-7;
        array [1] [2]=-9;

        System.out.println(Arrays.toString(array[0])); //imprime la primera fila
        System.out.println(Arrays.toString(array[1]));

        //Recorriendo un array bidimensional
        int i, j;

        for(i=0;i<2;i++) //Recorriendo filas
        {
            for(j=0;j<3;j++)//Recorriendo columnas
            {
                System.out.println(array[i][j]);
            }
        }

        //inicializando el array con valores
        int[][]b= {{1,2,3},{4,5,6}};//dos filas tres columnas
        int[][]c={{1,2},{3,4},{5,6}};//tres filas dos columnas

        int[][]MAL={{1,2,3},{4,5}};//caca


    }
    public static int cuentaPositivos(int[][] a)
    {
        int cont=0;
        int i,j;
        for(i=0;i<a.length;i++)//numero filas
        {
            for(j=0;j<a[i].length;j++)//numero columnas
            {
                if(a[i][j])
                {
                    cont=cont+1;
                }

            }
        }
    }
}
