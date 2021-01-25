package com.company;

import java.time.LocalDate;

public class Actor
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;

    public Actor(int id, String nombre, LocalDate fechaNacimiento)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString()
    {
        return "Actor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
