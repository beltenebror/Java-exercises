package com.company;

public class Videojuego
{
    //Atributos:
    private String nombre;
    private int anno;
    private Plataforma plataforma;
    private TipoJuego tipoJuego;
    private int valoracion;

    //Constructor

    public Videojuego(String nombre, int anno, Plataforma plataforma, TipoJuego tipoJuego, int valoracion)
    {
        this.nombre = nombre;
        this.anno = anno;
        this.plataforma = plataforma;
        this.tipoJuego = tipoJuego;
        this.valoracion = valoracion;
    }


    //propiedades

    public String getNombre()
    {
        return nombre;
    }

    public int getAnno()
    {
        return anno;
    }

    public Plataforma getPlataforma()
    {
        return plataforma;
    }

    public TipoJuego getTipoJuego()
    {
        return tipoJuego;
    }

    public int getValoracion()
    {
        return valoracion;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setAnno(int anno)
    {
        this.anno = anno;
    }

    public void setPlataforma(Plataforma plataforma)
    {
        this.plataforma = plataforma;
    }

    public void setTipoJuego(TipoJuego tipoJuego)
    {
        this.tipoJuego = tipoJuego;
    }

    public void setValoracion(int valoracion)
    {
        this.valoracion = valoracion;
    }


    //toString

    @Override
    public String toString()
    {
        String nombreR= this.nombre.trim();
        nombreR = padRight(nombreR,30);

        String annoR = String.valueOf(this.anno);
        annoR = padRight(annoR,8);

        String plataformaR = String.valueOf(this.plataforma);
        plataformaR = padRight(plataformaR,17);

        String tipojuegoR = String.valueOf(this.tipoJuego);
        tipojuegoR = padRight(tipojuegoR,16);

        String valoracionR = String.valueOf(this.valoracion);
        valoracionR = padRight(valoracionR,5);

        return nombreR+annoR+plataformaR+tipojuegoR+valoracionR;
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
