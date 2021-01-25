package com.company;

import java.security.InvalidParameterException;

enum TipoGenero
 {
     Hombre, Mujer
 }

public class Profesor
{
    //Atributos
    private String nombre;
    private String dni;
    private TipoGenero genero;

    //Propiedades


    public String getNombre()
    {
        return nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public TipoGenero getGenero()
    {
        return genero;
    }

    public void setDni(String dni)
    {
        if (dni.length()==9)
        {
            this.dni = dni;
        }
        else
        {
            throw new InvalidParameterException("El dni no tiene el número de valores correcto");
        }
    }

    public void setGenero(TipoGenero genero)
    {
        this.genero = genero;
    }

    public void setNombre(String nombre)
    {
        if (nombre.length()>0)
        {
            this.nombre = nombre;
        }
        else
        {
            throw new InvalidParameterException("Nombre vacío");
        }
    }


    //Constructor

    public Profesor(String nombre, String dni, TipoGenero genero)
    {
        setDni(dni);
        setNombre(nombre);
        this.genero = genero;
    }


    //toString


    @Override
    public String toString()
    {
        return  this.nombre + "  -  " + this.dni;
    }

    public int codigoPRofesor() //quita la letra y le da la vuelta;
    {
        String dniArreglado="";

        for (int i=7;i>=0;i--)
        {
            dniArreglado = dniArreglado + dni.charAt(i);
        }

        int cod = Integer.valueOf(dniArreglado);
        return cod;
    }
}
