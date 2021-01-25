package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Grupo
{
    //atributo
    private List<Alumno> listaAlumnos= new LinkedList();

    //metodos
    public void insertaAlumnoLista(Alumno a)
    {
        listaAlumnos.add(a);
    }

    public void insertaAlumnoLista(String nombre, int edad, double calificacion)
    {
        Alumno alumno = new Alumno(nombre,edad,calificacion);
        listaAlumnos.add(alumno);
    }

    public String toStringi()
    {
        String aDevolver="";
        for(int i=0;i<listaAlumnos.size();i++)
        {
            aDevolver=aDevolver + "Alumno " + (i+1)+ " -->"+ "\n";
            aDevolver=aDevolver + "------------------------------------------" + "\n";
            aDevolver=aDevolver + "Nombre: " + listaAlumnos.get(i).getNombre() + "\n";
            aDevolver=aDevolver + "Edad: " + listaAlumnos.get(i).getEdad( )+ "\n";
            aDevolver=aDevolver + "Calificación: " + listaAlumnos.get(i).getCalificacion() + "\n";
            aDevolver=aDevolver + "\n";
        }
        return aDevolver;
    }

    public void escribeFicheroABinario(String fichero)
    {
        int numeroAlumnos = listaAlumnos.size();
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(numeroAlumnos);

            for(int i=0;i<numeroAlumnos;i++)
            {
                dos.writeUTF(listaAlumnos.get(i).getNombre());
                dos.writeInt(listaAlumnos.get(i).getEdad());
                dos.writeDouble(listaAlumnos.get(i).getCalificacion());
            }


            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroBinario(String s)
    {
        listaAlumnos.clear();
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);


            int numeroAlumnos=dis.readInt();

            for(int i=0;i<numeroAlumnos;i++)
            {
                Alumno alumno= new Alumno(dis.readUTF(),dis.readInt(),dis.readDouble());

                listaAlumnos.add(alumno);

            }


            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public  void escribeFicheroTexto(String nombre)
    {
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(listaAlumnos.size() + System.lineSeparator());
            for(int i=0;i<listaAlumnos.size();i++)
            {
                bw.write(listaAlumnos.get(i).getNombre() + System.lineSeparator());
                bw.write(listaAlumnos.get(i).getEdad() + System.lineSeparator());
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion())+ System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("está dando error");
        }

    }

    public void leeFicheroTexto(String s)
    {
        listaAlumnos.clear();
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);


            int numeroAlumnos=Integer.valueOf(br.readLine());

            for(int i=0;i<numeroAlumnos;i++)
            {
                Alumno alumno = new Alumno();
                alumno.setNombre(br.readLine());
                alumno.setEdad(Integer.valueOf(br.readLine()));
                alumno.setCalificacion(Double.valueOf(br.readLine()));
                listaAlumnos.add(alumno);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public  void escribeFicheroCSV(String nombre)
    {
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0;i<listaAlumnos.size();i++)
            {
                bw.write(listaAlumnos.get(i).getNombre() +";");
                bw.write(listaAlumnos.get(i).getEdad() + ";");
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion())+ System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public void leeFicheroCSV(String s)
    {
        listaAlumnos.clear();
        String linea;
        String [] lineaAlumno;


        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            linea=br.readLine();
            while(linea!=null)
            {
                lineaAlumno=linea.split(";");
                Alumno alumno = new Alumno();
                alumno.setNombre(lineaAlumno[0]);
                alumno.setEdad(Integer.valueOf(lineaAlumno[1]));
                alumno.setCalificacion(Double.valueOf(lineaAlumno[2]));
                listaAlumnos.add(alumno);

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



}
