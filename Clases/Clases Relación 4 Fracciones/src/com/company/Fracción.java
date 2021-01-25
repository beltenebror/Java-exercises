package com.company;

import java.security.InvalidParameterException;

public class Fracción
{
    //Atributos
    private int numerador;
    private int denominador;



    //Constructores

    public Fracción(int numerador, int denominador)
    {
        this.numerador = numerador;
        if(denominador!=0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new InvalidParameterException("El denominador no puede ser 0");
        }

    }

    public Fracción(int numerador)
    {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fracción(double resultado)
    {
        int vecesMultiplico=0;
        int redondeado= (int) Math.round(resultado);
        while(redondeado!=resultado)
        {
            vecesMultiplico=vecesMultiplico+1;
            resultado=resultado*10;
            redondeado= (int) Math.round(resultado);
        }
        this.numerador= (int) resultado;
        this.denominador=1;
        for(int i=0;i<vecesMultiplico;i++)
        {
            this.denominador = this.denominador *10;
        }

    }




    //propiedades
    public int getNumerador()
    {
        return this.numerador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador=numerador;
    }

    public int getDenominador()
    {
        return this.denominador;
    }

    public void setDenominador(int denominador)
    {
        if(denominador!=0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new InvalidParameterException("No se puede dividir entre o");
        }

    }

    //Métodos privados

    private int mcm(int numero1, int numero2)
    {
        int i = numero1;
        while(!((i % numero1 == 0 )&&(i % numero2 == 0)))
        {
            i++;
        }
        return i;

    }

    private int MCD (int numero1, int numero2)
    {
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);
        int i = numero1;

        while(!((numero1 % i == 0) && (numero2 % i == 0)))
        {
            i--;
        }

        return i;

    }

    //• Métodos:

    public void simplificar()
    {
        if((this.numerador<0)&&(this.denominador<0))
        {
            this.numerador=this.numerador*-1;
            this.denominador=this.denominador*-1;
        }
        int minComDiv = MCD(this.numerador, this.denominador);
        this.numerador=this.numerador/minComDiv;
        this.denominador=this.denominador/minComDiv;
    }


    @Override
    public String toString()
    {
        return  this.numerador + "/" + this.denominador ;
    }


    //• Métodos (Operadores):

    public Fracción negate()
    {
        int numerador2=this.numerador*-1;
        int denominador2=this.denominador;
        if((numerador2<0)&&(denominador2<0))
        {
            numerador2=numerador2*-1;
            denominador2=denominador2*-1;
        }

        Fracción fracconTemopral = new Fracción(numerador2,denominador2);
        return fracconTemopral;

    }

    public Fracción add(Fracción f)
    {
        int numerador2;
        int denominador2;
        if (this.denominador == f.denominador)
        {
            denominador2=this.denominador;
            numerador2=this.numerador+f.numerador;
        }
        else
        {
            denominador2 = this.denominador*f.denominador;
            numerador2 = (this.numerador*f.denominador)+(f.numerador*this.denominador);
        }

        Fracción fracionTemporal = new Fracción(numerador2,denominador2);
        fracionTemporal.simplificar();
        return fracionTemporal;
    }

    public Fracción substract(Fracción f)
    {
       Fracción fraccionNegatica = f.negate();
       Fracción resta = this.add(fraccionNegatica);
       resta.simplificar();
       return resta;
    }

    public Fracción multiply(Fracción f)
    {
        int numerador2=this.numerador*f.numerador;
        int denominador2=this.denominador*f.denominador;
        Fracción multiplicacion = new Fracción(numerador2,denominador2);
        multiplicacion.simplificar();
        return multiplicacion;
    }


    public Fracción divide(Fracción f)
    {
        Fracción fracionInvertida = new Fracción(f.denominador,f.numerador);
        Fracción division = this.multiply(fracionInvertida);
        division.simplificar();
        return division;
    }

    public boolean equals(Fracción f)
    {
        boolean iguales=false;
        if((this.numerador*f.denominador)==(f.numerador*this.denominador))
        {
            iguales=true;
        }
        return iguales;
    }

    public int compareTo(Fracción f)
    {
        int devolver;
        int primero = this.numerador*f.denominador;
        int segundo = f.numerador*this.denominador;
        if(primero==segundo)
        {
            devolver =0;
        }
        else
        {
            if(primero>segundo)
            {
                devolver=1;
            }
            else
            {
                devolver=-1;
            }
        }
        return devolver;
    }






}

