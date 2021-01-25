package com.company;

import java.security.InvalidParameterException;

public class Coche
{
    //Atributos
    private String matricula;
    String marca;
    String modelo;
    private int cilindrada;
    private double precio;
    boolean nuevo;

    //Constructores

    public Coche(String matricula, String marca, String modelo, int cilindrada, double precio, boolean nuevo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        if(cilindrada>=50)
        {
            this.cilindrada = cilindrada;
        }
        else
        {
            throw new InvalidParameterException("Cilindrada no válida");
        }
//        this.precio = precio;
        setPrecio(precio);
        this.nuevo = nuevo;
    }

    public Coche() //vacío es caca
    {
    }

    public Coche(String matricula, String marca, String modelo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = 0;//Valores por defecto si no me dan todos los datos
        this.precio = 0.0;
        this.nuevo = true;
    }


    //Métodos --funciones dentro de una clase
    public double rebaja(double procentaje)
    {
        double descuento = (this.precio*procentaje)/100.0;
        double preciofinal = this.precio-descuento;
        return preciofinal;
    }

    //Propiedades (en java son como los reyes magos = mentira) las haces a mano
    public double getPrecio()
    {
        return this.precio;
    }

    public void setPrecio(double nuevoValor) //le mete nuevo valor
    {
        if(nuevoValor>0)
        {
            this.precio = nuevoValor;
        }
        else
        {
            throw new InvalidParameterException("El precio no puede ser negativo");
        }

    }
    public double getCilindrada() //propiedad de solo lectura, como no ecsite la creamos nosotros
    {
        return this.cilindrada;
    }


    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    @Override
    public String toString()
    {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", precio=" + precio +
                ", nuevo=" + nuevo +
                '}';
    }


}
