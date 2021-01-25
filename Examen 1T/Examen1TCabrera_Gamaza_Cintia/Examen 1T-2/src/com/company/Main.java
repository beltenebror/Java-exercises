package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[]a={9,-5,2,1,-1,-15};
        escribeArray(a);
        int[]b= separaNegativosPositivos(a);
        escribeArray(b);

    }
    public static int[] separaNegativosPositivos(int[]a)
    {
        int temporal;
        int i;
        for(int j=0;j<a.length-1;j++)//para las pasadas
        {
            for(i=0;i<a.length-1;i++)
            {
                if((a[i]>=0)&&(a[i+1]<0))
                {
                    temporal=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temporal;
                }
            }
        }
        return a;

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
