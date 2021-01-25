package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum RazaPerro
{
    PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
}
public class Perro extends Animal
{
    //Atributos
    private RazaPerro raza;
    private String microchip;

    //propiedades
    public RazaPerro getRaza()
    {
        return raza;
    }

    public String getMicrochip()
    {
        return microchip;
    }

    //Costructor
    public Perro( String Nombre, LocalDate fechaNacimiento, double Peso, String Comentario,RazaPerro raza, String microchip)
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
        return "Ficha de Perro" + "\n"+
                "---------------------" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Raza: " + this.raza + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + "\n" +
                "Peso: " + this.peso + " kg "+ "\n" +
                "Microchip: " + this.microchip + "\n" +
                "Comentarios: " + this.comentario;

    }
}
