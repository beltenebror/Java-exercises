package com.company;

import java.time.LocalDate;

public class ActorPelicula
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;

    public ActorPelicula(int id, String nombre, LocalDate fechaNacimiento, boolean principal)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.principal = principal;
    }

    @Override
    public String toString()
    {
        return "ActorPelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", principal=" + principal +
                '}';
    }
}
