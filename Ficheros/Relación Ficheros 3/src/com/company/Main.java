package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int opcion=-1;
        List<FichaAlumno> listaAlumnos = new ArrayList<FichaAlumno>();

        while(opcion!=0)
        {
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
            System.out.println("8. Ejercicio 8");

            System.out.println();
            System.out.print("Elige una opción, 0 para salir: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    //Escribe una función leeAlumnoLista a la que le pasas la lista de alumnos y te pide un
                    //nuevo alumno desde el teclado, cuyos datos se añadirán a la lista.
                    leeAlumnoLista(listaAlumnos);

                }
                break;

                case 2:
                {
                    //Escribe una función imprimeListaAlumnos a la que la pasas la lista de alumnos y te la
                    //imprime por pantalla.
                    imprimeListaAlumnos(listaAlumnos);
                }
                break;

                case 3:
                {
                    //Escribe una función escribeFicheroAlumnosBinario a la que le pasas la lista y el
                    //nombre del fichero y te escribe la lista en el fichero. La estructura del fichero será la
                    //siguiente:
                    //- Al principio habrá un entero que será el número de alumnos que hay en la
                    //lista.
                    //- Después irán los registros, escribiéndose un String para el nombre, un int
                    //para la edad y un double para la nota.
                    //- Iremos escribiendo todos los registros uno a uno hasta el final

                    escribeFicheroAlumnosBinario(listaAlumnos,"alumnos.bin");

                }
                break;

                case 4:
                {
                    //Escribe una función leeFicheroAlumnosBinario a la que le pasas una lista y el nombre
                    //del fichero y leerá la lista desde el fichero. El fichero tendrá la misma estructura que el
                    //del ejercicio anterior (evidentemente). La lista que nos pasen la borraremos antes de
                    //leer los datos del fichero.
                    //Para poder meter el alumno en la lista primero tendremos que crear un registro de
                    //tipo FichaAlumno:
                    //FichaAlumno fa = new FichaAlumno();
                    //Guardaremos los tres valores que hemos leído en el registro y lo añadiremos a la lista

                    leeFicheroAlumnosBinario("alumnos.bin",listaAlumnos);


                }
                break;

                case 5:
                {
                    //Escribe la función escribeFicheroAlumnosTexto similar a la función del ejercicio 3 pero
                    //usando un fichero de texto. La estructura del fichero será similar, pero ahora
                    //guardaremos un valor en cada línea. Ejemplo:
                    //2
                    //Pedro
                    //23
                    //7,2
                    //Juan
                    //15
                    //2,1
                    escribeFicheroAlumnosTexto(listaAlumnos,"alumnos.txt");
                }
                break;

                case 6:
                {
                    //Escribe la función leeFicheroAlumnosTexto similar a la función del ejercicio 4 pero que
                    //funciona con los ficheros de texto del ejercicio anterior.
                    leeFicheroAlumnosTexto("alumnos.txt",listaAlumnos);
                }
                break;

                case 7:
                {
                    //Los ficheros CSV (Comma Separated Values) (Valores Separados por Comas) son la
                    //forma más simple de guardar una tabla de una base de datos. Cada registro va en una línea y
                    //los valores de cada registro van separados por comas u otro valor de separación (por ejemplo,
                    //punto y coma).
                    //7. Escribe la función escribeFicheroAlumnosCSV. En este caso, no vamos a guardar el
                    //número de registros en la primera línea, ya que los ficheros CSV estándar no lo hacen.
                    //Como carácter separador usaremos el punto y coma, ya que uno de los datos que
                    //usamos ya contiene comas.
                    //Un ejemplo del fichero sería:
                    //Pedro;23;7,2
                    //Juan;15;2,1
                    escribeFicheroAlumnosCSV(listaAlumnos,"alumnos.csv");

                }
                break;

                case 8:
                {
                    //Escribe la función leeFicheroAlumnosCSV que lee los datos del fichero anterior en una
                    //lista. Para separar los datos, lo más fácil es usar la función Split de las cadenas. Con
                    //esto conseguiremos un array de cadenas compuesto por tres cadenas: “Nombre”,
                    //“Edad”, “Calificación”, que tendremos que convertir al tipo de dato adecuado y meter
                    //en un registro FichaAlumno y luego en la lista.

                    leeFicheroAlumnosCSV("alumnos.csv",listaAlumnos);

                }
                break;


                default:
                    System.out.println("Ese ejercicio no existe");

            }

        }
    }

    public static void leeFicheroAlumnosCSV(String s, List<FichaAlumno> listaAlumnos)
    {
        listaAlumnos.clear();
        String linea;
        String [] lineaAlumno;
        int i;

        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            linea=br.readLine();
            while(linea!=null)
            {
                lineaAlumno=linea.split(";");
                FichaAlumno fa = new FichaAlumno();
                fa.nombre=lineaAlumno[0];
                fa.edad=Integer.valueOf(lineaAlumno[1]);
                fa.calificacion=Double.valueOf(lineaAlumno[2]);
                listaAlumnos.add(fa);

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

    public static void escribeFicheroAlumnosCSV(List<FichaAlumno> listaAlumnos, String nombre)
    {
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0;i<listaAlumnos.size();i++)
            {
                bw.write(listaAlumnos.get(i).nombre +";");
                bw.write(listaAlumnos.get(i).edad + ";");
                bw.write(String.valueOf(listaAlumnos.get(i).calificacion)+ System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public static void leeFicheroAlumnosTexto(String s, List<FichaAlumno> listaAlumnos)
    {
        listaAlumnos.clear();
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);


            int numeroAlumnos=Integer.valueOf(br.readLine());

            for(int i=0;i<numeroAlumnos;i++)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre=br.readLine();
                fa.edad=Integer.valueOf(br.readLine());
                fa.calificacion=Double.valueOf(br.readLine());
                listaAlumnos.add(fa);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosTexto(List<FichaAlumno> listaAlumnos, String nombre)
    {
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(listaAlumnos.size() + System.lineSeparator());
            for(int i=0;i<listaAlumnos.size();i++)
            {
                bw.write(listaAlumnos.get(i).nombre + System.lineSeparator());
                bw.write(listaAlumnos.get(i).edad + System.lineSeparator());
                bw.write(String.valueOf(listaAlumnos.get(i).calificacion)+ System.lineSeparator());

            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void leeFicheroAlumnosBinario(String s, List<FichaAlumno> listaAlumnos)
    {
        listaAlumnos.clear();
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);


            int numeroAlumnos=dis.readInt();

            for(int i=0;i<numeroAlumnos;i++)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre=dis.readUTF();
                fa.edad=dis.readInt();
                fa.calificacion=dis.readDouble();
                listaAlumnos.add(fa);

            }


            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> listaAlumnos, String s)
    {
        int numeroAlumnos=listaAlumnos.size();
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(numeroAlumnos);

            for(int i=0;i<numeroAlumnos;i++)
            {
                dos.writeUTF(listaAlumnos.get(i).nombre);
                dos.writeInt(listaAlumnos.get(i).edad);
                dos.writeDouble(listaAlumnos.get(i).calificacion);
            }


            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void imprimeListaAlumnos(List<FichaAlumno> listaAlumnos)
    {
        System.out.println();
        int i,j;
        for(j=0;j<82;j++)
        {
            System.out.print("-");
        }
        System.out.println();
        String nombre="Nombre:";
        String edad="Edad:";
        String calificacin="Calificación:";
        nombre=padRight(nombre,50);
        edad=padRight(edad,10);
        calificacin= padRight(calificacin,15);

        System.out.println("| " + nombre+"| " + edad + "| " + calificacin+ "|"); //la
        for(i=0;i<82;i++)                                                       //primera
        {
            System.out.print("-");                                               //linea
        }
        System.out.println();                                                    //raya separadora
        for(i=0;i<listaAlumnos.size();i++)                     //añade cada alumno
        {
            nombre=listaAlumnos.get(i).nombre;
            nombre=padRight(nombre,50);
            edad=String.valueOf(listaAlumnos.get(i).edad);
            edad=padRight(edad,10);
            calificacin=String.valueOf(listaAlumnos.get(i).calificacion);
            calificacin=padRight(calificacin,15);

            System.out.println("| " + nombre+"| " + edad + "| " + calificacin+ "|");
            for(j=0;j<82;j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void leeAlumnoLista(List<FichaAlumno> listaAlumnos)
    {
        Scanner sc = new Scanner(System.in);

        FichaAlumno fa = new FichaAlumno();

        System.out.println("Nombre:");
        fa.nombre=sc.nextLine();

        System.out.println("Edad:");
        fa.edad=sc.nextInt();

        System.out.println("Calificación:");
        fa.calificacion=sc.nextDouble();

        listaAlumnos.add(fa);
    }

    public static String padLeft(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a= ' ' + a ;
        }
        return a;
    }

    public static String padRight(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a=  a + ' ';
        }
        return a;
    }
}
