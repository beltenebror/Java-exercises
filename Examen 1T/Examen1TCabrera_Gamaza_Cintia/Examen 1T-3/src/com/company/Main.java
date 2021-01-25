package com.company;

public class Main {

    public static void main(String[] args)
    {
        String a=" el perro de san Roque 12121212 333 1 22 333 4444 55555 666666";
        System.out.println(palabrasImpares(a));

    }


    public static String palabrasImpares(String a)
    {
        String temporal;
        a=quitaEspaciosSobrantes(a);
        String[]palabras=a.split(" ");
        for(int i=0;i<palabras.length;i++)
        {
            temporal = palabras[i];
            if(temporal.length()%2==0)
            {
                palabras=borraDeArrayString(palabras,i);
            }

        }
        a=String.join(" ", palabras);
        return a;


    }


    public static String[] borraDeArrayString(String [] palabras, int posicion)
    {
        String[] array2 = new String[palabras.length - 1];
        int i;
        for (i = 0; i < posicion; i++)
        {
            array2[i] = palabras[i];
        }
        for (i = palabras.length-1; i > posicion; i--)
        {
            array2[i - 1] = palabras[i];
        }
        return array2;
    }
    public static String quitaEspaciosSobrantes(String a)
    {
        String b="";
        if(a.length()>0)
        {
            a=a.trim();
            for(int i=0;i<a.length();i++)
            {
                if((a.charAt(i)!=' ')||(a.charAt(i+1)!=' '))
                {
                    b=b+ a.charAt(i);
                }
            }
        }

        return b;
    }
}
