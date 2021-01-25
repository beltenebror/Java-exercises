package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tribunal
{
    //Atributo
    List<Profesor> listaProfesores;

    //Constructor

    public Tribunal(String fichero)
    {
        listaProfesores = new LinkedList<>();
        String nombreTemp;
        String dniTemp;
        int generoTemp;
        TipoGenero generoTemporal;

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);


            while(dis.available()>0)
            {
                nombreTemp = dis.readUTF();
                dniTemp = dis.readUTF();
                generoTemp = dis.readInt();
                if (generoTemp==0)
                {
                     generoTemporal=TipoGenero.Hombre;
                }
                else
                {
                    generoTemporal=TipoGenero.Mujer;
                }
                Profesor profe = new Profesor(nombreTemp,dniTemp,generoTemporal);
                listaProfesores.add(profe);

            }


            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    //Métodos

    public void EligeTribunal()
    {
        int mujeresElectas=0;
        int hombresElectos=0;
        for(int i=0; i<listaProfesores.size(); i++)
        {
            System.out.println(listaProfesores.get(i).toString());
        }
        Random r = new Random();
        int posición = r.nextInt(listaProfesores.size()+1);
        System.out.println();
        System.out.println("En el sorteo ha salido la posición: " + posición);
        System.out.println();
        System.out.println("Vocales elegidos en el sorteo:");
        int contador=0;
        while ((hombresElectos+mujeresElectas)<4)
        {
            if (posición==listaProfesores.size())
            {
                posición = 0;
            }
            if (listaProfesores.get(posición).getGenero()==TipoGenero.Hombre)
            {
                if (hombresElectos<2)
                {
                    System.out.println(listaProfesores.get(posición));
                    hombresElectos=hombresElectos+1;
                }
            }
            else
            {
                if (mujeresElectas<2)
                {
                    System.out.println(listaProfesores.get(posición));
                    mujeresElectas=mujeresElectas+1;
                }
            }
            posición=posición+1;
        }
    }

    public void EligeTribunalPro()
    {

        ordenaLista(this.listaProfesores);
        EligeTribunal();
    }

    private static void ordenaLista(List<Profesor> a)
    {
        List<Profesor> ordenada = new LinkedList<>();
        Profesor min;
        int posicionmin;
        int i;
        while(a.size()!=0)
        {
            min = a.get(0);
            posicionmin=0;
            for (i = 0; i < a.size(); i++)
            {

                if (min.codigoPRofesor() > a.get(i).codigoPRofesor())
                {
                    min = a.get(i);
                    posicionmin=i;
                }
            }
            ordenada.add(min);
            a.remove(posicionmin);

        }

        a.addAll(ordenada);


    }









}
