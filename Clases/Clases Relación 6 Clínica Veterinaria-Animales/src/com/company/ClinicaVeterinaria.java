package com.company;

import java.util.LinkedList;
import java.util.List;

public class ClinicaVeterinaria
{
    //atributos
    private List<Animal>  listaAnimales;

    //constructor
    public ClinicaVeterinaria()
    {
        listaAnimales = new LinkedList<>();
    }


    //Metods
    public void insertaAnimal(Animal animal)
    {
        this.listaAnimales.add(animal);
    }

    public Animal buscaAnimal(String nombre)
    {
        int x=-1;
        for(int i = 0; i<listaAnimales.size();i++)
        {
            if(listaAnimales.get(i).nombre.equals(nombre))
            {
                x=i;
                i=listaAnimales.size();
            }
        }
        Animal animalito = listaAnimales.get(x);
        return animalito;
    }


    public void modificaComentarioAnimal(String nombre, String comentario)
    {
        Animal animal = buscaAnimal(nombre);
        animal.setComentario(comentario);
    }

    @Override
    public String toString()
    {
        String devolver="Clínica veterinaria :" + "\n"+
                "==================================================================" + "\n";
        for(int i=0;i<listaAnimales.size();i++)
        {
            devolver=devolver+listaAnimales.get(i).toString();
            devolver=devolver+"\n";
        }
        return devolver;
    }
}

