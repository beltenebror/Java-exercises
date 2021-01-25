package com.company;

import java.time.LocalDate;

public abstract class Animal
{
    //Atributos
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String comentario;


    //propiedades
    public String getNombre()
    {
        return nombre;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public String getComentario()
    {
        return comentario;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }

    public abstract String toString();

}
