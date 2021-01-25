package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        int[] miArray={1,2,3,3,3,1,2,4,4,4,4,4,1,2,3,3,3,3,3,2,1,1,1,4};
        int[] consecuitivos=detectaConsecutivos(miArray);
        escribeArray(consecuitivos);

    }

    private static int[] detectaConsecutivos(int[] miArray)
    {
        LinkedList<Integer> consecutivos = new LinkedList<>();
        int i;
        int numAnterior=miArray[0],numeroRepeticiones=1;
        for(i=1;i<miArray.length;i++)
        {
            if(numAnterior==miArray[i])
            {
                numeroRepeticiones=numeroRepeticiones+1;
            }
            else
            {
                if(numeroRepeticiones>=3)
                {
                    consecutivos.add(numAnterior);
                }
                numAnterior=miArray[i];
                numeroRepeticiones=1;
            }
            if(i==miArray.length-1)//como estoy haciendo la comprobación cuando cambia de numero, el último no cambia, lo hago a parte
            {
                if(numeroRepeticiones>=3)
                {
                    consecutivos.add(numAnterior);
                }
            }
        }
        int[] arrayConsecutivos = new int[consecutivos.size()];
        for(i=0;i<consecutivos.size();i++)
        {
            arrayConsecutivos[i]=consecutivos.get(i);
        }
        return arrayConsecutivos;
    }

    public static void escribeArray(int[] a)
    {
        if(a.length==0)
        {
            System.out.println("[]");
        }
        else
        {
            System.out.print("[");

            for(int i=0;i<(a.length-1);i++)
            {
                System.out.print(a[i]+", ");
            }

            System.out.print(a[a.length-1]+"]");
        }

    }
}
