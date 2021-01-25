package com.company;

public abstract class Vehiculo
{
    //Atributos
    protected String matricula;

    @Override
    public String toString()
    {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
