package com.company;

import java.security.InvalidParameterException;

public class Carta
{
    //atributos:
    private int numero; //Valores 1 al 10
    private int palo;   //Valores 0,1,2,3 oro, copa, espada, basto

    //Constructores:
    public Carta(int numero, int palo)
    {
        if ((numero > 0) && (numero < 11))
        {
            this.numero = numero;
        }
        else
        {
            throw new InvalidParameterException("Numero no valido");
        }
        if ((palo > -1) && (palo < 4))
        {
            this.palo = palo;
        }
        else
        {
            throw new InvalidParameterException("Palo no valido");
        }

    }

    public Carta(int id)
    {
        if((id>0)&&(id<41))
        {
            this.palo = (id / 10);
            if (id % 10 == 0)
            {
                this.palo = this.getPalo() - 1;
            }
            this.numero = id % 10;
            if (numero == 0)
            {
                numero = 10;
            }
        }
        else
        {
            throw new InvalidParameterException("id de carta incorrecto");
        }

    }
    //Propiedades:

    public int getNumero()
    {
        return numero;
    }

    public int getPalo()
    {
        return palo;
    }

    //Metodos:

    public String nombreNumero()
    {
        String[] numeros = {"uno", "dos", "tres", "cuatro", "cinco", "seis",
                "siete", "sota", "caballo", "rey"};

        return numeros[numero - 1];
    }

    public String nombrePalo()
    {
        String nombrePalo="valor por defecto para que java me deje en paz";
        switch (this.palo)
        {
            case 0:
                nombrePalo = "oros";
                break;
            case 1:
                nombrePalo = "copas";
                break;
            case 2:
                nombrePalo = "espadas";
                break;
            case 3:
                nombrePalo = "bastos";
                break;

        }
        return nombrePalo;
    }

    public String nombreCarta()
    {
        String nombreCarta;
        String nombrePalo;
        nombreCarta = nombreNumero();
        nombrePalo = nombrePalo();
        nombreCarta = nombreCarta + " de " + nombrePalo;
        return nombreCarta;
    }

    public int ValorTute()
    {
        int valor;

        int[] valores={11,0,10,0,0,0,0,2,3,4};
        valor=valores[this.numero-1];

        return valor;
    }

    public int ValorMus()
    {
        int valor;

        int[] valores={1,1,10,0,0,0,0,10,10,10};
        valor=valores[this.numero-1];

        return valor;
    }

    public double valor7ymedia()
    {
        double valor;

        double[] valores={1,2,3,4,5,6,7,0.5,0.5,0.5};
        valor=valores[this.numero-1];

        return valor;
    }







}
