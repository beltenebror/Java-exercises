package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum EspecieReptil
{
    Tortuga, Iguana, DragonDeComodo
}
public class Reptil extends Animal
{

    //Atributos
    private EspecieReptil especie;
    private boolean venenoso;

    //propiedades
    public EspecieReptil getEspecie()
    {
        return especie;
    }

    public boolean isVenenoso()
    {
        return venenoso;
    }

    //Constructor

    public Reptil(String Nombre, LocalDate fechaNacimiento, double Peso, String Comentario, EspecieReptil especie, Boolean venenoso)
    {
        this.nombre=Nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.peso=Peso;
        this.comentario=Comentario;
        this.especie = especie;
        this.venenoso = venenoso;
    }



    @Override
    public String toString()
    {
        return "Ficha de reptil" + "\n"+
                "---------------------" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Especie: " + this.especie + "\n" +
                "Fecha de Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + "\n" +
                "Peso: " + this.peso + " kg "+ "\n" +
                "Venenoso: " + this.venenoso + "\n" +
                "Comentarios: " + this.comentario;

    }



}
