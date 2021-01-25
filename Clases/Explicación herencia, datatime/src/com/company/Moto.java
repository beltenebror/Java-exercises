package com.company;

public class Moto extends Vehiculo
{
    @Override
    public String toString()
    {
        return "Moto{" +
                "tieneSidecar=" + tieneSidecar +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    //Atributos
    public boolean tieneSidecar;
}
