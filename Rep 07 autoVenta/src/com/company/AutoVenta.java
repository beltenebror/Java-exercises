package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class AutoVenta
{
    //Atributos
    private List<Coche> listaCoches;

    //Constructor
    public AutoVenta()
    {
        listaCoches = new LinkedList<>();
    }


    //Metodos
    public void cargaCSV(String fichero)
    {
        String linea;
        String [] lineaCachos;
        String matricula;
        String marca;
        String modelo;
        String fecha;
        Double precio;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea=br.readLine();
            linea=br.readLine();
            while(linea!=null)
            {
                lineaCachos=linea.split(";");
                matricula=lineaCachos[0];
                marca=lineaCachos[1];
                modelo=lineaCachos[2];
                fecha=lineaCachos[3];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(fecha, formatter);
                precio= Double.valueOf(lineaCachos[4]);


                Coche cochecito = new Coche(matricula,localDate,marca,modelo,precio);
                listaCoches.add(cochecito);

                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void guardaCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Matricula;Marca;Modelo;Fecha de Matriculacion;Precio" + System.lineSeparator());

            for(int i=0;i<listaCoches.size();i++)
            {
                bw.write(listaCoches.get(i).getMatricula() + ";");
                bw.write(listaCoches.get(i).getMarca()+";");
                bw.write(listaCoches.get(i).getModelo()+";");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fechaFormateada = listaCoches.get(i).getFechaMatriculación().format(formatter);
                bw.write(fechaFormateada+";");
                bw.write(listaCoches.get(i).getPrecio()+System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void insertaCoche(Coche c)
    {
        listaCoches.add(c);
    }

    public Coche buscaCoche(String matricula)
    {
        Coche cochecito;
        int posicion=-1;
        for(int i=0;i<listaCoches.size();i++)
        {
            if (listaCoches.get(i).getMatricula().equals(matricula))
            {
                posicion=i;
                i=listaCoches.size();
            }
        }
        if (posicion>=0)
        {
             cochecito = listaCoches.get(posicion);
        }
        else
        {
             cochecito = null;
        }

        return cochecito;
    }

    public String imprimeListado()
    {
        String devolver;
        devolver= padRight("Matricula", 12) + padRight("Marca",15) +
                padRight("Modelo",12)+ padRight("Fecha Matriculación",20) +
                padRight("Precio",12) + "\n";
        devolver=devolver+"======================================================================"+"\n";
        for(int i = 0; i<listaCoches.size(); i++)
        {
            devolver=devolver+listaCoches.get(i).toString()+"\n";
        }
        return devolver;

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
