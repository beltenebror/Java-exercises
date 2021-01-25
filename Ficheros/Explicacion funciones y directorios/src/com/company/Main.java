package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args)
    {
//	    //comprobar si existe un fichero
//
//        //metodo antigui: file;
//        //file nos permite obbtenet informacion de un fichero que le digamos, no tiene ni que existir
//        File fich = new File("fichero.txt");
//
//        if(fich.exists())
//        {
//            if(fich.isFile())
//            {
//                System.out.println("el fichero existe");
//            }
//            else
//            {
//                System.out.println("es un directorio realmetne" );
//            }
//
//        }
//        else
//        {
//            System.out.println("el fichero no existe" );
//        }
//
//        //metodo modernos:files
//        if(Files.exists(Path.of("fichero.txt")));
//        {
//            System.out.println("metodo nuevo");
//            if(Files.isRegularFile(Path.of("fichero.txt")))
//            {
//
//            }
//            if(Files.isDirectory(Path.of("fichero.txt")))
//            {
//
//            }
//
//        }
//
//        //operaciones con ficheros;borrar, copiar,mover/renombrar
//
//        fich.delete();//borra
//
//        File fich2 = new File("fichero2.txt");
//        fich.renameTo(fich2);
//
//        //Version moderta
//        try
//        {
//            Files.delete(Path.of("fichero.txt")); //borra
//            Files.copy(Path.of("fichero.txt"), Path.of("C:\\fichero2.txt"));//copiar allí con tal nombre
//            Files.move(Path.of("fichero.txt"), Path.of("fichero2.txt")); // mover o renombrar moviendo al mismo sitio con otro nombre
//
//            Files.createDirectories(Path.of("carpeta"));
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }


        //como obtener el lsitado de un directorio
        File dir = new File(".");
        File[] arrayFicheros = dir.listFiles();

        for(int i=0;i<arrayFicheros.length;i++)
        {
            if(arrayFicheros[i].isFile())
            {
                if(arrayFicheros[i].getName().endsWith(".txt"))
                {
                    System.out.println(arrayFicheros[i].getName());
                    System.out.println(arrayFicheros[i].getAbsolutePath());
                }
            }
        }








    }
}
