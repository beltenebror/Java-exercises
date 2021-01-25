package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum EspeciePajaro
{
    Canario, Periquito, Agapornis
}
public class Pajaro extends  Animal
{
    //Atributos
    private EspeciePajaro especie;
    private boolean cantor;

    //propiedades
    public EspeciePajaro getEspecie()
    {
        return especie;
    }

    public boolean isCantor()
    {
        return cantor;
    }

    //Constructor

    public Pajaro(String Nombre, LocalDate fechaNacimiento, double Peso, String Comentario, EspeciePajaro especie, Boolean cantor)
    {
        this.nombre=Nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.peso=Peso;
        this.comentario=Comentario;
        this.especie = especie;
        this.cantor = cantor;
    }



    @Override
    public String toString()
    {
        return "Ficha de pajaro" + "\n"+
                "---------------------" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Especie: " + this.especie + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + "\n" +
                "Peso: " + this.peso + " kg "+ "\n" +
                "Cantor: " + this.cantor + "\n" +
                "Comentarios: " + this.comentario;

    }




}
