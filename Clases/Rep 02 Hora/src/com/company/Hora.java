package com.company;

import java.security.InvalidParameterException;

public class Hora
{
    //Atributo
    private int segundos;



    //constructores
    public Hora(int segundos)
    {
        if(segundos>=0)
        {
            this.segundos = segundos;
        }
        else
        {
            throw new InvalidParameterException("Los segundos no pueden negativos");
        }
    }

    public Hora(int horas, int minutos,int segundos)
    {
        if(segundos>-1 && segundos<60)
        {
            this.segundos = segundos;
        }
        else
        {
            throw new InvalidParameterException("Los segundos no pueden negativos");
        }

        if(minutos>-1 && minutos<60)
        {
            this.segundos = this.segundos + minutos*60;
        }
        else
        {
            throw new InvalidParameterException("Los minutos no pueden negativos");
        }
        if(horas>-1)
        {
            this.segundos = this.segundos + horas*60*60;
        }
        else
        {
            throw new InvalidParameterException("Las horas no pueden negativos");
        }


    }

    //propiedades

    public int getSegundosTotales()
    {
        return segundos;
    }

    public void setSegundosTotales(int segundos)
    {
        this.segundos = segundos;
    }

    public int gethoras()
    {
        return segundos/3600;
    }

    public int getMinutos()
    {
        return (segundos%3600)/60;
    }

    public int getSegundos()
    {
        return (segundos%3600)%60;
    }

    public void setHoras(int horas)
    {
        if(horas>-1)
        {
            this.segundos = this.segundos-(gethoras()*3600);
            this.segundos = this.segundos+(horas*3600);
        }
        else
        {
            throw new InvalidParameterException("Las horas no pueden ser menor de 0");
        }
    }
    public void setMinutos(int minutos)
    {
        if(minutos>-1 && minutos<60)
        {
            this.segundos = this.segundos-(getMinutos()*60);
            this.segundos = this.segundos+(minutos*60);
        }
        else
        {
            throw new InvalidParameterException("los minutos deben estar entre 1 y 59");
        }

    }

    public void setSegundos(int segundos)
    {
        if(segundos>-1 && segundos<60)
        {
            this.segundos = this.segundos-getSegundos();
            this.segundos = this.segundos+segundos;
        }
        else
        {
            throw new InvalidParameterException("Los segundos deben estar entre 1 y 59");
        }

    }

    //Metodos
    public void sumaHoras(int horas)
    {
        this.segundos=this.segundos+horas*3600;
        if(this.segundos<0)
        {
            throw new InvalidParameterException("resulta hora negativa");
        }
    }
    public void sumaMinutos(int minutos)
    {
        this.segundos=this.segundos+minutos*60;
        if(this.segundos<0)
        {
            throw new InvalidParameterException("resulta hora negativa");
        }
    }
    public void sumaSegundos(int segundos)
    {
        this.segundos=this.segundos+segundos;
        if(this.segundos<0)
        {
            throw new InvalidParameterException("resulta hora negativa");
        }
    }


    //Metodos(operadores)
    public void add(Hora h)
    {
        this.segundos=this.segundos+h.getSegundosTotales();
        if(this.segundos<0)
        {
            throw new InvalidParameterException("hora negativa");
        }
    }
    public void substract(Hora h)
    {
        this.segundos=this.segundos-h.getSegundosTotales();
        if(this.segundos<0)
        {
            throw new InvalidParameterException("hora negativa");
        }
    }

    @Override
    public String toString()
    {
        String horaCorrecta;
        if(gethoras()>9)
        {
            horaCorrecta=gethoras()+":";

        }
        else
        {
            horaCorrecta="0"+gethoras()+":";
        }

        if (getMinutos()>9)
        {
            horaCorrecta=horaCorrecta+getMinutos()+":";

        }
        else
        {
            horaCorrecta=horaCorrecta + "0" + getMinutos()+":";


        }

        if (getSegundos()>9)
        {
            horaCorrecta= horaCorrecta + getSegundos();
        }
        else
        {
            horaCorrecta = horaCorrecta + "0" + getSegundos();
        }

        return horaCorrecta;
    }
}
