package com.company;

import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        //Escribir en un fichero de texto
        //FileWriter y BufferedWriter

//        try
//        {
//            FileWriter fw = new FileWriter("fichero.txt"); //lo guarda en el fichero
//            BufferedWriter bw = new BufferedWriter(fw);  //lo guarda temporalmente en el buffer para luego
//
//            bw.write("Hola mundo " + System.lineSeparator()); // pa separar la linea
////            bw.write("Hola mundo \r\n "); // pa separar la linea en windows
////            bw.write("Hola mundo \n"); // pa separar la linea en linux
////            bw.write("Hola mundo \r"); // pa separar la linea en mac
//            bw.write("Adiós mundo");
//
//            bw.close();
//            fw.close();
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }


        //leer de un fichero
        //FileReader y BufferedReader
        try
        {
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br= new BufferedReader(fr);

//            fr.reset(); //creemos que esto es revovinar

            //leo linea, y luego la siguiente
//            String linea= br.readLine();
//            System.out.println(linea);
//
//            linea= br.readLine();
//            System.out.println(linea);
//
//            linea= br.readLine();
//            System.out.println(linea);
//
//            linea= br.readLine();
//            System.out.println(linea);

            //leer hasta que no queden lineas
            String linea=br.readLine();
            while(linea!=null)
            {
                System.out.println(linea);
                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
