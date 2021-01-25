package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum RazaGato
{
    Comun, Siames, Persa, Angora, ScottishFold
}

public class Gato extends Animal
{
    //Atributos
    private RazaGato raza;
    private String microchip;


    //propiedades
    public RazaGato getRaza()
    {
        return raza;
    }

    public String getMicrochip()
    {
        return microchip;
    }


    //Costructor
    public Gato(String Nombre, LocalDate fechaNacimiento, double Peso, String Comentario, RazaGato raza, String microchip)
    {
        this.nombre=Nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.peso=Peso;
        this.comentario=Comentario;
        this.raza = raza;
        this.microchip = microchip;
    }


    @Override
    public String toString()
    {
        return "Ficha de Gato" + "\n"+
                "---------------------" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Raza: " + this.raza + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + "\n" +
                "Peso: " + this.peso + " kg "+ "\n" +
                "Microchip: " + this.microchip + "\n" +
                "Comentarios: " + this.comentario;

    }



}
