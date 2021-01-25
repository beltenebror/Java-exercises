package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a={4,8,9,1,5};
        graficaBarras(a);

    }
    public static void graficaBarras(int[] a)
    {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        int i;
        int datoerror=0;
        for(i=0;i<a.length;i++)
        {
            if((a[i]<0)||(a[i])>9)
            {
                datoerror=datoerror+1;
                i=a.length;
            }
        }
        if(datoerror==0)
        {
            for(i=9;i>0;i--)//alto
            {
                for(int j=0;j<a.length;j++) //ancho
                {
                    if(a[j]>=i)
                    {
                        if(a[j] >= 5)
                        {
                            System.out.print(ANSI_GREEN);
                            System.out.print("█");
                        }
                        else
                        {
                            System.out.print(ANSI_RED);
                            System.out.print("█");
                        }
                        System.out.print(ANSI_RESET);
                        System.out.print("  ");    //Le he puesto 2 espacios porque creo que con dos espacio es más bonito
                    }
                    else
                    {
                        System.out.print("   ");
                    }
                }
                System.out.println();

            }
            for(i=0;i<a.length;i++) //linea final
            {

                System.out.print(a[i]);
                System.out.print("  ");

            }


        }
        else
        {
            System.out.println("Error, datos incorrectos");
        }
    }



}
