package com.company;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int opcion = -1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Menú");
        System.out.println();
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");

        System.out.println();
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                //Escribe la función cuantosFicheros a la que le pasas una extensión de archivo y te devuelve un entero que nos
                // dice cuántos ficheros con esa extensión hay en el directorio actual.
                //Ej.: CuantosFicheros(“txt”) nos dirá cuántos ficheros .txt hay.
                String extension=".txt";
                int num=cuantosFicheros(extension);
                System.out.println(num);
            }
            break;

            case 2:
            {
                //Escribe la función cuantosFicherosPro a la que le pasas una extensión de archivo y una carpeta y te dice cuántos
                // archivos con esa extensión hay en esa carpeta.
                //Ej.: CuantosFicherosPro(“txt”, “C:\\Windows”) nos dirá cuántos ficheros .txt hay en la carpeta C:\Windows.
                String extension=".txt";
                String localizacion="C:\\borrame";
                int num=cuantosFicherosPro(extension, localizacion);
                System.out.println(num);
            }
            break;

            case 3:
            {
                //Escribe la función creaBackup a la que le pasas un nombre de fichero. La función copiará ese fichero en otro al que le añadiremos la
                // extensión “.bak” (para tener una copia de seguridad). Si el nuevo fichero existe, le añadiremos otra vez “.bak” hasta que encontremos
                // un nombre de fichero disponible.
                //Ej.: CreaBackup(“texto.txt”) copiará el fichero texto.txt a texto.txt.bak. Si este nombre existe, lo copiará a texto.txt.bak.bak, etc.

                creaBackup("text.txt");

            }
            break;

            case 4:
            {
                //Escribe la función renombraMasivo a la que le pasas dos extensiones de fichero. La función te renombrará todos los ficheros
                // que haya en el directorio actual con la primera extensión y les pondrá la segunda extensión.
                //Ej.: RenombraMasivo(“txt”, “texto”) renombrará todos los ficheros *.txt a *.texto.
                String oldExtension="txt";
                String newExtension="cintiamola";
                renombraMasivo(oldExtension,newExtension);

            }
            break;

            case 5:
            {
                //Escribe la función cuentaLineasFicheros a la que le pasas una extensión y te cuenta el total de líneas que hay entre
                // todos los ficheros con esa extensión que hay en la carpeta actual (esos ficheros deberían ser de texto, que si no va a
                // contar poco). El resultado te lo devolverá en un entero.
                //Ej.: CuentaLineasFicheros(“txt”) te suma las líneas que tienen todos los ficheros .txt de la carpeta actual.
                String extension="txt";
                int linesnum=cuentaLineasFicheros(extension);
                System.out.println(linesnum);

            }
            break;

            case 6:
            {
                //Escribe la función ficheroMasGrande que nos devuelve una cadena con el nombre del fichero de mayor tamaño que haya en la carpeta actual
                System.out.println(ficheroMasGrande());
            }
            break;

            case 7:
            {
                //Escribe la función clasificaFicheros que te clasifica todos los ficheros que hay en la carpeta actual de acuerdo a su extensión.
                //Ej.: Si en la carpeta actual están los ficheros: uno.txt, dos.txt, tres.exe, la función nos escribirá: txt => 2, exe => 1.
                //La función no devolverá nada, sino que lo escribirá por pantalla con println directamente.
                clasificaFicheros();

            }
            break;


            default:
                System.out.println("Ese ejercicio no existe");

        }


    }

    public static void clasificaFicheros()
    {
        File dir = new File(".");
        File[] arrayarchivos = dir.listFiles();
        List<String> extensionesmal = new LinkedList<>();
        List<Extensiones> extensiones = new LinkedList<>();
        String[] arraytemporal;
        String cadenatemporal;
        int i;
        int j;
        int yaAñadido;
        //crear un array con todos los archivos


        for (i = 0; i < arrayarchivos.length; i++)
        {
            if (arrayarchivos[i].isFile())
            {
                cadenatemporal = arrayarchivos[i].getName();
                arraytemporal = cadenatemporal.split("\\.");
                extensionesmal.add(arraytemporal[arraytemporal.length - 1]);
            }
        }
        //crea una lista con el nombre de cada una de las extensiones(repitiendose=


        for (i = 0; i < extensionesmal.size(); i++)
        {
            yaAñadido = 0;
            if (extensiones.size() == 0)
            {
                Extensiones ext = new Extensiones();
                ext.nombreExtension = extensionesmal.get(i);
                ext.ocurrenciasExtension = 1;
                extensiones.add(ext);
                yaAñadido = 1;
            }
            else
            {
                for(j=0;j<extensiones.size();j++)
                {
                    if(extensiones.get(j).nombreExtension.equals(extensionesmal.get(i)))
                    {
                        extensiones.get(j).ocurrenciasExtension=extensiones.get(j).ocurrenciasExtension+1;
                        yaAñadido=yaAñadido+1;
                    }

                }
            }
            if(yaAñadido==0)
            {
                Extensiones ext = new Extensiones();
                ext.nombreExtension = extensionesmal.get(i);
                ext.ocurrenciasExtension = 1;
                extensiones.add(ext);
            }
        }
        //extensiones = esta dentro el nombre de la extension sin repetir, y el numero de veces que aparece

        for(i=0;i<extensiones.size();i++)
        {
            System.out.print(extensiones.get(i).nombreExtension+":  ");
            System.out.println(extensiones.get(i).ocurrenciasExtension);
        }

    }

    public static String ficheroMasGrande()
    {

        File dir = new File(".");
        File[] arrayarchivos = dir.listFiles();
        String mayor="valor por defecto para que java me deje en paz";
        int posicionmayor=-1;
        int contadorarchivos=0;

        for(int i=1;i<arrayarchivos.length;i++)
        {
            if(arrayarchivos[i].isFile())
            {
                contadorarchivos=contadorarchivos+1;
                if(contadorarchivos==1)
                {
                    mayor=arrayarchivos[i].getName();
                    posicionmayor=i;
                }
                else
                {
                    if(arrayarchivos[i].length()>arrayarchivos[posicionmayor].length())
                    {
                        mayor=arrayarchivos[i].getName();
                        posicionmayor=i;
                    }
                }
            }
        }


        return mayor;

    }

    public static int cuentaLineasFicheros(String extension)
    {
        File dir = new File(".");
        File[] arrayFicheros = dir.listFiles();
        int numerolineas=0;
        String nombre;
        String linea;

        for(int i=0;i<arrayFicheros.length;i++)
        {
            if(arrayFicheros[i].isFile())
            {
                if(arrayFicheros[i].getName().endsWith(extension))
                {
                    nombre = arrayFicheros[i].getName();

                    try
                    {
                        FileReader fr = new FileReader(nombre);
                        BufferedReader br = new BufferedReader(fr);

                        linea=br.readLine();

                        while(linea!=null)
                        {
                            numerolineas=numerolineas+1;
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
        }


        return numerolineas;
    }

    public static void renombraMasivo(String oldExtension, String newExtension)
    {
        File dir = new File(".");
        File[] arrayficheros = dir.listFiles();
        int letrasold = oldExtension.length();
        String nombre;
        String nuevonombre;
        for (int i = 0; i < arrayficheros.length; i++)
        {
            if (arrayficheros[i].isFile())
            {
                if (arrayficheros[i].getName().endsWith(oldExtension))
                {
                    nombre = arrayficheros[i].getName();
                    nuevonombre = nombre.substring(0, nombre.length() - letrasold);
                    nuevonombre = nuevonombre + newExtension;
                    try
                    {
                        Files.move(Path.of(nombre), Path.of(nuevonombre));
                    } catch (IOException e)
                    {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

    public static void creaBackup(String s)
    {
        String newname=s+".bak";
        while(Files.exists(Path.of(newname)))
        {
            newname=newname+".bak";
        }
        try
        {
            Files.copy(Path.of(s), Path.of(newname));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    private static int cuantosFicherosPro(String extension, String localizacion)
    {
        File dir = new File(localizacion);
        File[] arrayficheros = dir.listFiles();
        int numeroficheros=0;

        for(int i=0;i<arrayficheros.length;i++)
        {
            if(arrayficheros[i].isFile())
            {
                if(arrayficheros[i].getName().endsWith(extension))
                {
                    numeroficheros=numeroficheros+1;
                }
            }
        }
        return numeroficheros;

    }

    public static int cuantosFicheros(String extension)
    {
        File dir = new File(".");
        File[] arrayFicheros = dir.listFiles();
        int numeroficheros=0;

        for(int i=0;i<arrayFicheros.length;i++)
        {
            if(arrayFicheros[i].isFile())
            {
                if(arrayFicheros[i].getName().endsWith(extension))
                {
                    numeroficheros=numeroficheros+1;
                }
            }
        }

        return  numeroficheros;
    }



}
