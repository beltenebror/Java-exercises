package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BuscaTexto
{
    //Atributos:
    String texto;
    int puntero;

    //Constructores

    public BuscaTexto()
    {
        this.texto = "";
        this.puntero = 0;
    }

    public BuscaTexto(String texto)
    {
        this.texto = texto;
        this.puntero = 0;
    }

    //Metodos

    public void cargaFichero(String fichero)
    {
        try
        {
            String linea;
            FileReader fr= new FileReader(fichero);
            BufferedReader br= new BufferedReader(fr);

            linea=br.readLine();
            while (linea!=null)
            {
                texto=texto+linea;
                linea=br.readLine();
            }

            br.close();
            fr.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void reinicia()
    {
        puntero=0;
    }

    public boolean busca(String cadena)
    {
        boolean devolver = true;
        cadena=cadena.toLowerCase();
        int posicionEnTexto = texto.indexOf(cadena);
        if(posicionEnTexto > -1)
        {
            puntero = posicionEnTexto;
        }
        else
        {
            devolver=false;
        }
        return devolver;
    }

    public boolean buscaSiguiente(String cadena)
    {
        boolean devolver = true;
        cadena=cadena.toLowerCase();
        int posicionEnTexto = texto.indexOf(cadena, puntero+1);
        if(posicionEnTexto > -1)
        {
            puntero = posicionEnTexto;
        }
        else
        {
            devolver=false;
        }
        return devolver;
    }

    public String extraeCadena(String delimitador1, String delimitador2)
    {
        int posicionDelimitador1 = texto.indexOf(delimitador1, puntero+1);
        int posicionDelimitador2 = texto.indexOf(delimitador2,posicionDelimitador1+1);
        return texto.substring(posicionDelimitador1+delimitador1.length(),posicionDelimitador2);

    }

    public String extraeCadenaConDelim(String delimitador1, String delimitador2)
    {
        int posicionDelimitador1 = texto.indexOf(delimitador1, puntero+1);
        int posicionDelimitador2 = texto.indexOf(delimitador2,posicionDelimitador1+1);
        return texto.substring(posicionDelimitador1,posicionDelimitador2+delimitador2.length());

    }


    //Propiedades:

    public int getPuntero()
    {
        return puntero;
    }

    public void setPuntero(int puntero)
    {
        this.puntero = puntero;
    }

    public String getTexto()
    {
        return texto;
    }

}


