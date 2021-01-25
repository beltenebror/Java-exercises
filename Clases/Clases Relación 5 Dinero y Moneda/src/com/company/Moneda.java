package com.company;

import java.security.InvalidParameterException;

enum TipoMoneda
{
    euro, yen, dolar, libra
}
public class Moneda
{
    //Atributos
    TipoMoneda tipoMoneda;
    int decimales;
    String Simbolo;
    double cambioEuro;
    String codigo;

    //constructor
    public Moneda(TipoMoneda tipoMoneda, String codigo, int decimales, String simbolo, double cambioEuro)
    {
        this.tipoMoneda = tipoMoneda;
        this.codigo = codigo;
        this.decimales = decimales;
        this.Simbolo = simbolo;
        this.cambioEuro = cambioEuro;
    }
    //propiedades
    public double getCambioEuro()
    {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro)
    {
        if(cambioEuro>0)
        {
            this.cambioEuro = cambioEuro;
        }
        else
        {
            throw new InvalidParameterException("Cambio Negativo");
        }

    }

    public TipoMoneda getTipoMoneda()
    {
        return tipoMoneda;
    }

    public int getDecimales()
    {
        return decimales;
    }

    public String getSimbolo()
    {
        return Simbolo;
    }




}
