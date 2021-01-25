package com.company;

import java.util.LinkedList;
import java.util.List;

public class Coleccion
{
    //Atributos
    List<Videojuego> lista;

    //Constructor
    public Coleccion()
    {
        lista = new LinkedList<>();
    }

    //Metodos
    public void insertaVideojuego(Videojuego v)
    {
        lista.add(v);
    }
    public void eliminaVideojuego(int posicion)
    {
        lista.remove(posicion);
    }
    public Videojuego getVideojuego(int posicion)
    {
        return lista.get(posicion);
    }

    //toString


    @Override
    public String toString()
    {
        String devolver="";
        String nombre = padRight("Videojuego",30);
        String anno = padRight("Año",8);
        String platadorma = padRight("Plataforma",17);
        String tipo = padRight("Tipo de juego",16);
        String val = padRight("Val.",5);
        devolver=devolver+nombre;
        devolver=devolver+anno;
        devolver=devolver+platadorma;
        devolver=devolver+tipo;
        devolver=devolver+val;
        devolver=devolver+"\n";
        devolver= devolver+"----------------------------------------------------------------------------------";
        devolver=devolver+"\n";
        for (int i=0;i<lista.size();i++)
        {
            devolver=devolver+lista.get(i).toString();
            devolver=devolver+"\n";
        }

        return devolver;
    }

    public String toStringNum()
    {
        String devolver="";

        for (int i=0;i<lista.size();i++)
        {
            devolver=devolver+i+1;
            devolver=devolver+lista.get(i).getNombre();
            devolver=devolver+"\n";
        }

        return devolver;
    }

    //usado por mi
    private static String padRight(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a=  a + ' ';
        }
        return a;
    }
}
