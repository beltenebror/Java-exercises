package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    //atributos
    private String nombre;
    private int edad;
    private double calificacion;

    public Alumno()
    {
    }


    //propiedades

    public void setNombre(String nombre)
    {
        if(!nombre.equals(""))
        {
            this.nombre = nombre;
        }
        else
        {
            throw new InvalidParameterException("Nombre incorrecto");
        }
    }

    public void setEdad(int edad)
    {
        if((edad>=17)&&(edad<=100))
        {
            this.edad = edad;
        }
        else
        {
            throw new InvalidParameterException("Edad incorrecta");
        }
    }

    public void setCalificacion(Double calificacion)
    {
        if((calificacion>=0)&&(calificacion<=10))
        {
            this.calificacion = calificacion;
        }
        else
        {
            throw new InvalidParameterException("Calificación incorrecta");
        }
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public double getCalificacion()
    {
        return this.calificacion;
    }

    //constructor
    public Alumno(String nombre, int edad, double calificacion)
    {

        setNombre(nombre);
        setEdad(edad);
        setCalificacion(calificacion);


    }





}
