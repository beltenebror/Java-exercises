package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        boolean seguir= true;
        String leer;
        while (seguir)
        {


            Grupo listaAlumnos = new Grupo();
            listaAlumnos.leeFicheroCSV("fichero.csv");


            String misAlumnos = listaAlumnos.toStringi();
            System.out.println(misAlumnos);
            leer=sc.nextLine();




            if(!leer.equals("s"))
            {
                seguir=false;
            }
        }

    }
}
