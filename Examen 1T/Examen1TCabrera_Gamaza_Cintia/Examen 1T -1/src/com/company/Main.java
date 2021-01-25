package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a1 = {1, 3,  5, 7,};
        int[] a2 = {2, 3, 4, 5, 6,0, 7};
        int[] a3 = {2, 7, 3, 4, 1, 5, 0};
        elementosComunes3(a1, a2, a3);

    }

    public static void elementosComunes3(int[] a1, int[] a2, int[] a3)
    {
        int coincidencia;
        //i contador a1, j contador a2
        for (int i = 0; i < a1.length; i++)
        {
            coincidencia = 0;
            for (int j = 0; j < a2.length; j++)
            {
                if (a1[i] == a2[j])
                {
                    coincidencia = coincidencia + 1;
                }
            }
            if (coincidencia == 0)
            {
                a1 = borraDeArray(a1, i);
                i = i - 1;
            }
            else
            {
                coincidencia = 0;
                for (int k = 0; k < a3.length; k++)
                {
                    if (a1[i] == a3[k])
                    {
                        coincidencia = coincidencia + 1;
                    }
                }
                if (coincidencia == 0)
                {
                    a1 = borraDeArray(a1, i);
                    i = i - 1;
                }

            }


        }
        if(a1.length>0)
        {
            for (int i = 0; i < (a1.length - 1); i++)
            {
                System.out.print(a1[i] + ", ");

            }
            System.out.print(a1[a1.length - 1]);
        }

    }

    public static int[] borraDeArray(int[] array1, int posicion)
    {
        int[] array2 = new int[array1.length - 1];
        int i;
        for (i = 0; i < posicion; i++)
        {
            array2[i] = array1[i];
        }
        for (i = array1.length - 1; i > posicion; i--)
        {
            array2[i - 1] = array1[i];
        }
        return array2;
    }

}