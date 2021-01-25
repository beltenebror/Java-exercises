package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String a="ahijado";
        System.out.println(cuentaDiptongos(a));
    }

    public static int cuentaDiptongos(String a)
    {
        int pos1;
        int pos2;
        int diptongos=0;
        a=a.toLowerCase();
        String posiblediptongo="";
        String vocalesparadiptongos="aeiouáéóyü";
        for( int i=0;i<a.length()-1;i++)
        {
            posiblediptongo="";
            if(a.charAt(i)=='h')
            {
                pos1 = vocalesparadiptongos.indexOf(a.charAt(i-1));
            }
            else
            {
                pos1 = vocalesparadiptongos.indexOf(a.charAt(i));
            }
            pos2 = vocalesparadiptongos.indexOf(a.charAt(i+1));


            if((pos1 != -1)&&(pos2 != -1))
            {
                if(a.charAt(i)=='h')
                {
                    posiblediptongo=posiblediptongo + a.charAt(i-1)+ a.charAt(i+1);
                }
                else
                {
                    posiblediptongo=posiblediptongo + a.charAt(i)+ a.charAt(i+1);
                }

                if ((!posiblediptongo.equals("ae")) && (!posiblediptongo.equals("ea")) && (!posiblediptongo.equals("ao")) && (!posiblediptongo.equals("oa")) && (!posiblediptongo.equals("eo")) && (!posiblediptongo.equals("oe")) && (!posiblediptongo.equals("ya")) && (!posiblediptongo.equals("ye")) && (!posiblediptongo.equals("yi")) && (!posiblediptongo.equals("yo")) && (!posiblediptongo.equals("yu")))
                {
                    if(a.charAt(i)=='u')
                    {
                        if(a.charAt(i-1)!='q')
                        {
                            if(a.charAt(i-1)!='g')
                            {
                                diptongos = diptongos + 1;
                            }
                        }
                    }
                    else
                    {
                        diptongos = diptongos + 1;
                    }

                }
            }

        }
        return diptongos;
    }

}
