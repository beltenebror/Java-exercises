package com.company;


import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

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
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");

        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                escribeFicheroNumRandom10("fichero.txt");
            }
            break;

            case 2:
            {
                System.out.println(sumaFicheroInt10("fichero.txt"));
            }
            break;

            case 3:
            {
                String nombre;
                int veces;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                System.out.println("dime cuantos números desea añadirle");
                veces= sc.nextInt();
                escribeFicheroNumRandom(nombre,veces);
            }
            break;

            case 4:
            {
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                System.out.println(sumaFicheroInt(nombre));


            }
            break;

            case 5:
            {
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                escribeFicheroTexto(nombre);

            }
            break;

            case 6:
            {
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                leeFicheroTexto(nombre);
            }
            break;

            case 7:
            {
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                String nombrecopia;
                System.out.println("dime el nombre del archivo");
                nombrecopia= sc.nextLine();
                copiaFicheroTexto(nombre,nombrecopia);

            }
            break;

            case 8:
            {
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                String nombrecopia;
                System.out.println("dime el nombre del archivo");
                nombrecopia= sc.nextLine();
                invierteLineasFichero(nombre,nombrecopia);
            }
            break;

            case 9:
            {
                //Escribe la función invierteFicheroTexto a la que le pasas un nombre de fichero y te invierte el contenido del fichero,
                // es decir, la primera línea la pone la última, la segunda la pone la penúltima, etc. Hay varias formas de hacerlo; la más
                // fácil es con una lista de cadenas.
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                invierteFicheroTexto(nombre);

            }
            break;

            case 10:
            {
                //Escribe la función separaPalabrasFichero a la que le pasas dos nombres de fichero. Te cogerá el primer fichero
                // (que contendrá frases) y te separará las palabras, que escribirá en el segundo fichero (que tendrá una palabra en cada línea).
                String nombre;
                System.out.println("dime el nombre del archivo");
                nombre= sc.nextLine();
                String nombre2;
                System.out.println("dime el nombre del segundo archivo");
                nombre2= sc.nextLine();
                separaPalabrasFichero(nombre,nombre2);

            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }
    }

    public static void separaPalabrasFichero(String nombre, String nombre2)
    {
        try
        {
            String linea;
            FileReader fr= new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);

            FileWriter fw= new FileWriter(nombre2);
            BufferedWriter bw = new BufferedWriter(fw);

            List<String> palabras = new LinkedList<>();
            String[] palabrasporliena;
            int i;
            linea=br.readLine();
            while (linea!=null)
            {
                palabrasporliena=linea.split(" ");
                for(i=0;i<palabrasporliena.length;i++)
                {
                    palabras.add(palabrasporliena[i]);
                }
                linea=br.readLine();
            }
            for(i=0;i<palabras.size();i++)
            {
                bw.write(palabras.get(i)+System.lineSeparator());
            }


            bw.close();
            fw.close();


            br.close();
            fr.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }

    public static void invierteFicheroTexto(String nombre)
    {
        try
        {
            String linea;
            FileReader fr= new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            linea=br.readLine();
            List<String> mitexto = new LinkedList<>();
            while (linea!=null)
            {
                mitexto.add(linea);
                linea=br.readLine();
            }

            br.close();
            fr.close();
            Collections.reverse(mitexto);
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<mitexto.size();i++)
            {
                bw.write(mitexto.get(i)+System.lineSeparator());
            }
            bw.close();
            fw.close();



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteLineasFichero(String nombre, String nombrecopia)
    {
        try
        {

            FileReader fr = new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);
            FileWriter fwcopia = new FileWriter(nombrecopia);
            BufferedWriter bwcopia = new BufferedWriter(fwcopia);
            String linea=br.readLine();

            while(linea!=null)
            {
                linea=invierteCadena(linea);
                bwcopia.write(linea+System.lineSeparator());
                linea=br.readLine();
            }

            bwcopia.close();
            fwcopia.close();
            br.close();
            fr.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String invierteCadena(String a)
    {
        String b="";
        int j=a.length()-1;
        for(int i=0;i<a.length();i++)
        {
            b=b+ a.charAt(j);
            j--;

        }
        return b;
    }

    public static void copiaFicheroTexto(String nombre, String nombrecopia)
    {
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);
            FileWriter fwcopia = new FileWriter(nombrecopia);
            BufferedWriter bwcopia = new BufferedWriter(fwcopia);
            String linea=br.readLine();;
            while(linea!=null)
            {
                bwcopia.write(linea+System.lineSeparator());
                linea=br.readLine();
            }

            bwcopia.close();
            fwcopia.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroTexto(String nombre)
    {
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);

            String linea=br.readLine();;
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

    public static void escribeFicheroTexto(String nombre)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            String escribir;
            System.out.println("¿Quieres escribir? Si o No");
            escribir=sc.nextLine();
            escribir=escribir.toLowerCase();
            String texto;
            while(escribir.equals("si"))
            {
                System.out.println("¿Qué quieres escribir?");
                texto=sc.nextLine();
                bw.write(texto + System.lineSeparator());
                System.out.println("¿Quieres seguir escribiendo, humano? Si o No");
                escribir=sc.nextLine();
            }


            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt(String nombre)
    {
        int suma=0;
        try
        {
            int num=0;
            FileReader fr = new FileReader(nombre);
            BufferedReader br= new BufferedReader(fr);

            String linea=br.readLine();
            suma=0;
            while(linea!=null)
            {
               num=Integer.valueOf(linea);
               suma=suma+num;
                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroNumRandom(String s, int veces)
    {
        try
        {
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            int numero;
            Random r= new Random();
            for(int i=0;i<veces;i++)
            {
                numero=r.nextInt(10);
                bw.write(numero + System.lineSeparator());
            }

            bw.close();
            fw.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt10(String s)
    {
        int suma=0;
        try
        {

            FileReader fr = new FileReader(s);
            BufferedReader br= new BufferedReader(fr);

            int num;
            for(int i=0;i<10;i++)
            {
                num= Integer.valueOf(br.readLine());
                suma=suma+num;
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroNumRandom10(String s)
    {
        try
        {
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            int numero;
            Random r= new Random();
            for(int i=0;i<10;i++)
            {
                numero=r.nextInt(10);
                bw.write(numero + System.lineSeparator());
            }

            bw.close();
            fw.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }






}
