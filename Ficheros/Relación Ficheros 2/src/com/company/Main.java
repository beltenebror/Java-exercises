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
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");

        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 11:
            {
                //Escribe una función escribeFichero1_100 que te escriba en un fichero binario cuyo nombre le pasas por parámetro
                // (p.ej.: “datos01.bin”) los valores enteros desde 1 hasta 100.
                escribeFichero1_100("datos01.bin");

            }
            break;

            case 12:
            {
                //Escribe una función leeFicheroInt100 que te lea del fichero que le pasas por parámetro los 100 primeros valores enteros.
                leeFicheroInt100("datos01.bin");

            }
            break;

            case 13:
            {
                //Escribe una función escribeFicheroIntAleatorio a la que le pasas el nombre del fichero y cuántos números aleatorios queremos
                // escribir en el mismo. Los números aleatorios serán entre 1 y 100 y serán de tipo int.
                int num;
                String name;
                System.out.println("dime el nombre del fichero a crear");
                name=sc.nextLine();
                System.out.println("cuantos valores aleatorios quieres añadir?");
                num=sc.nextInt();
                escribeFicheroIntAleatorio(name,num);

            }
            break;

            case 14:
            {
                //Escribe una función escribeFicheroIntAleatorioPro a la que le pasas lo siguiente: el nombre del fichero, número de
                // valores que se van a generar, el valor mínimo y el valor máximo. Así, escribeFicheroIntAleatorioPro(“datos.bin”
                int num, nummin, nummax;
                System.out.println("valor minimo del aleatorio?");
                nummin=sc.nextInt();
                System.out.println("valor maximo del aleatorio?");
                nummax=sc.nextInt();
                System.out.println("cuantos valores aleatorios quieres añadir?");
                num=sc.nextInt();
                escribeFicheroIntAleatorioPro("datos.bin", num, nummin,nummax);
            }
            break;

            case 15:
            {
                //Escribe una función leeFicheroInt que te lea del fichero que le pasas por parámetro todos los valores enteros que haya en él.
                String nombre;
                System.out.println("dime el nombre del fichero de enteros que quieres leer");
                nombre=sc.nextLine();
                leeFicheroInt(nombre);

            }
            break;

            case 16:
            {
                //Escribe una función sumaFicheroInt que te lea de un fichero todos los valores enteros, los sume y te devuelva el resultado.
                String nombre;
                System.out.println("dime el nombre del fichero de enteros que quieres sumar");
                nombre=sc.nextLine();
                int suma;
                suma=sumaFicheroInt(nombre);
                System.out.println(suma);

            }
            break;

            case 17:
            {
                //Escribe una función leeFicheroIntLista que te lea de un fichero todos los valores enteros. Los valores los irá almacenando
                // en una lista de enteros que devolverá. El prototipo de la función será: List<Integer> LeeFicheroIntLista(String nombre_fichero).
                //Escribe una función sumaFicheroInt que te lea de un fichero todos los valores enteros, los sume y te devuelva el resultado.
                String nombre;
                System.out.println("dime el nombre del fichero de enteros que quieres abrir");
                nombre=sc.nextLine();
                List<Integer> listita= LeeFicheroIntLista(nombre);
                System.out.println(listita);


            }
            break;

            case 18:
            {
                //Escribe una función escribeFicheroIntLista que te escriba en un fichero todos los valores enteros de la lista que le pasamos por parámetro
                // . El prototipo de la función será: void LeeFicheroIntLista(String nombre_fichero, List<Integer> lista).
                List<Integer> list = new LinkedList<>(Arrays.asList(1,-1,2,-2,3,-3,4,-4));
                String nombre= "numerosdelalista.bin";
                escribeFicheroIntLista(nombre,list);

            }
            break;

            case 19:
            {
                //Escribe una función ordenaFicheroInt que te lea de un fichero los valores enteros que haya, los ordene y vuelva a escribir
                //en el mismo fichero los valores ya ordenados.
                String nombre;
                System.out.println("dime el nombre del fichero de enteros que quieres ordenar");
                nombre=sc.nextLine();
                ordenaFicheroInt(nombre);
            }
            break;

            case 20:
            {
                //Escribe una función separaFicheroInt a la que le pasaremos el nombre del fichero que queremos separar. La función
                // nos creará dos ficheros que tendrán el mismo nombre que el de origen pero añadiéndole “positivos” o “negativos”
                // detrás (ej.: “datos.bin” -> “datos.binpositivos”, “datos.binnegativos”). En un fichero guardaremos todos los
                // números positivos que haya en el primer fichero y en el otro los negativos.
                String nombre;
                System.out.println("dime el nombre del fichero de enteros que quieres separar en positivos y negaticos");
                nombre=sc.nextLine();
                separaFicheroInt(nombre);

            }
            break;

            case 21:
            {
                //Escribe una función invierteFicheroInt a la que le pasaremos un fichero que contiene enteros e invertirá
                // la posición de los valores dentro del fichero, es decir, lo escribirá de atrás para delante.


            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }
    }
    public static void invierteFicheroInt (String nombre)
    {
        try
        {

            List<Integer> temporallist=LeeFicheroIntLista(nombre);
            Collections.reverse(temporallist);
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i=0;i<temporallist.size();i++)
            {
                dos.writeInt(temporallist.get(i));
            }

            dos.close();
            fos.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void separaFicheroInt(String nombre)
    {
        try
        {
            List<Integer> temporallist= LeeFicheroIntLista(nombre);
            FileOutputStream fosNegativo = new FileOutputStream("negativos.bin");
            DataOutputStream dosNegativo = new DataOutputStream(fosNegativo);

            FileOutputStream fosPositivos = new FileOutputStream("positivos.bin");
            DataOutputStream dosPositivos = new DataOutputStream(fosPositivos);

            for(int i=0;i<temporallist.size();i++)
            {
                if(temporallist.get(i)>=0)
                {
                    dosPositivos.writeInt(temporallist.get(i));
                }
                else
                {
                    dosNegativo.writeInt(temporallist.get(i));
                }
            }


            dosPositivos.close();
            fosPositivos.close();

            dosNegativo.close();
            fosNegativo.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void ordenaFicheroInt(String nombre)
    {
        try
        {

            List<Integer> temporallist=LeeFicheroIntLista(nombre);
            Collections.sort(temporallist);
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i=0;i<temporallist.size();i++)
            {
                dos.writeInt(temporallist.get(i));
            }

            dos.close();
            fos.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntLista(String nombre, List<Integer> list)
    {
        try
        {

            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i=0;i<list.size();i++)
            {
                dos.writeInt(list.get(i));
            }

            dos.close();
            fos.close();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static List<Integer> LeeFicheroIntLista(String nombre)
    {
        List<Integer> listita =new LinkedList<>();

        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            int n;
            while(dis.available() > 0)
            {
                n=dis.readInt();
                listita.add(n);
            }

            dis.close();
            fis.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        return listita;
    }

    public static int sumaFicheroInt(String nombre)
    {
        int suma=0;
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            int n;
            while(dis.available() > 0)
            {
                n=dis.readInt();
               suma=suma+n;
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return suma;
    }

    public static void leeFicheroInt(String nombre)
    {
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            int n;
            while(dis.available() > 0)
            {
                n=dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorioPro(String s, int num, int nummin, int nummax)
    {
        int cantidadnumeros= (nummax-nummin)+1;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            Random r= new Random();
            int randonnum;
            for(int i=0;i<num;i++)
            {
                randonnum=(r.nextInt(cantidadnumeros))+nummin;
                dos.writeInt(randonnum);
            }

            dos.close();
            fos.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorio(String name, int num)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(name);
            DataOutputStream dos = new DataOutputStream(fos);

            Random r= new Random();
            int randonnum;
            for(int i=0;i<num;i++)
            {
               randonnum=r.nextInt(100)+1;
               dos.writeInt(randonnum);
            }

            dos.close();
            fos.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt100(String s)
    {
        try
        {
            FileInputStream fis= new FileInputStream(s);
            DataInputStream dis= new DataInputStream(fis);

            int n;
            for(int i=0;i<100;i++)
            {
                n=dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void escribeFichero1_100(String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i=1;i<101;i++)
            {
                dos.writeInt(i);
            }

            dos.close();
            fos.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }










}
