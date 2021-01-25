package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Coche
{
    //Atributos
    private String matricula;
    private LocalDate fechaMatriculación;
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String matricula, LocalDate fechaMatriculación, String marca, String modelo, double precio)
    {
        if (matriculaOk(matricula))
        {
            this.matricula = matricula;
        }
        else
        {
            throw new InvalidParameterException("Matrícula no valida");
        }

        if (fechaMatriculacionOk(fechaMatriculación))
        {
            this.fechaMatriculación = fechaMatriculación;
        }
        else
        {
            throw new InvalidParameterException("Fecha de matriculación no válida");
        }

        if (!marca.equals(""))
        {
            this.marca = marca;
        }
        else
        {
            throw new InvalidParameterException("Marca vacía");
        }

        if (!modelo.equals(""))
        {
            this.modelo = modelo;
        }
        else
        {
            throw new InvalidParameterException("modelo vacío");
        }

        if (precio>=500)
        {
            this.precio = precio;
        }
        else
        {
            throw new InvalidParameterException("Precio demasiado bajo");
        }


    }

    public String getMatricula()
    {
        return matricula;
    }

    public LocalDate getFechaMatriculación()
    {
        return fechaMatriculación;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()

    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = this.fechaMatriculación.format(formatter);
        String precioFormateado = String.format("%.2f", precio);
        return padRight(this.matricula, 12) + padRight(marca,15) + padRight(modelo,12)+ padRight(fechaFormateada,20) + padRight(precioFormateado,12);
    }

    private boolean fechaMatriculacionOk(LocalDate fechaMatriculación)
    {
        boolean fechaOk =false;
        LocalDate ahora = LocalDate.now().minusYears(1);
        if (fechaMatriculación.compareTo(ahora)<=0)
        {
            fechaOk=true;
        }
        return fechaOk;
    }


    private boolean matriculaOk(String matricula)
    {
        boolean matriculaOk = true;
        if (matricula.length()!=7)
        {
            matriculaOk=false;
        }
        if (matriculaOk)
        {
            int numeroletras=0;
            int numeroNumeros=0;
            String numeros="0123456789";
            for (int i=0;i < matricula.length(); i++)
            {
                if (Character.isLetter(matricula.charAt(i)))
                {
                    numeroletras=numeroletras+1;
                }
                else
                {
                    if (numeros.indexOf(matricula.charAt(i))!=-1)
                    {
                        numeroNumeros=numeroNumeros+1;
                    }
                }
            }
            if (!(numeroletras==3 && numeroNumeros==4))
            {
                matriculaOk=false;
            }
        }
        return matriculaOk;

    }

    private static String padRight(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a=  a + ' ';
        }
        return a;
    }

}
