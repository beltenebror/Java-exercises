package com.company;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CineDB cine = new CineDB("jdbc:sqlite:C:\\Users\\lasup\\Google Drive\\CLASE\\asignaturas\\programación\\IdeaProjects\\Clases\\Clases Relación 7 Base de Datós de Pelí culas\\RECURSOS\\cine.db");
        System.out.println("Qué deseas hacer");
        System.out.println("Insertar película. Pulse 1");
        System.out.println("Obtener listado de todas las películas. Pulse 2");
        System.out.println("Obtener listado de todos los actores. Pulse 3");
        System.out.println("Obtener listado de todas las películas de un autor. Pulse 4");
        System.out.println("Obtener información de una película. Pulse 5");
        int opcion=sc.nextInt();
        switch (opcion)
        {
            case 1:
            {
                sc.nextLine();
                System.out.println("Introduce el título");
                String titulo = sc.nextLine();
                System.out.println("Introduce el año");
                int anno = sc.nextInt();
                boolean tieneOscar = false;
                sc.nextLine();
                System.out.println("Tiene oscar? s, n");
                String oscar = sc.nextLine();
                oscar=oscar.toLowerCase();
                if(oscar.equals("s"))
                {
                    tieneOscar = true;
                }
                System.out.println("Introduce la valoración");
                double valoracion = sc.nextDouble();

                int idPelicula = cine.insertaPelicula(titulo,anno,tieneOscar,valoracion);

                System.out.println("Ahora introduciremos los autores");
                boolean seguir = true;
                while (seguir)
                {
                    System.out.println("Que desea:");
                    System.out.println("1-Introducir nuevo autor");
                    System.out.println("2-Actor que ya tenemos en la base de datos");
                    int opcion2 = sc.nextInt();
                    switch (opcion2)
                    {
                        case 1:
                        {
                            sc.nextLine();
                            System.out.println("Introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Año de nacimiento");
                            int annoNac = sc.nextInt();
                            System.out.println("Mes de nacimiento");
                            int mesNac = sc.nextInt();
                            System.out.println("Dia de nacimiento");
                            int diaNac = sc.nextInt();
                            sc.nextLine();

                            int idAutor = cine.insertaActor(nombre,LocalDate.of(annoNac,mesNac,diaNac));
                            boolean principal = false;
                            System.out.println("Es un actor principal? s = sí, cualquier otro no");
                            String principalstring = sc.nextLine();
                            principalstring = principalstring.toLowerCase();

                            if(principalstring.equals("s"))
                            {
                                principal=true;
                            }

                            cine.asociaActorPelicula(idAutor,idPelicula,principal);

                        }
                        break;
                        case 2:
                        {
                            sc.nextLine();
                            System.out.println("Nombre del autor");
                            String nombre = sc.nextLine();

                            int idAutor = cine.buscaActor(nombre);

                            boolean principal = false;
                            System.out.println("Es un actor principal? s = sí, cualquier otro no");
                            String principalstring = sc.nextLine();
                            principalstring = principalstring.toLowerCase();

                            if(principalstring.equals("s"))
                            {
                                principal=true;
                            }

                            cine.asociaActorPelicula(idAutor,idPelicula,principal);


                        }
                        break;
                        default:
                            System.out.println("Operación invalida");
                    }
                    System.out.println("Desea parar? p para parar, sino cualquier otra letra.");
                    String continuar = sc.nextLine();
                    continuar = continuar.toLowerCase();
                    if (continuar.equals("p"))
                    {
                        seguir = false;
                    }
                }

            }
//Insertar una película: primero se pedirán los datos de la película y se introducirán en la
//base de datos y luego se añadirán los actores que participarán en la película. Para esto,
//se le podrá dar al usuario la opción de elegir un actor que ya está en la base de datos o
//insertar uno nuevo.
                break;

            case 2:
            {
                List<Pelicula> listaPeliculas = cine.listadoPeliculas();
                for(int i = 0; i<listaPeliculas.size();i++)
                {
                    System.out.println(listaPeliculas.get(i));
                    System.out.println();
                }

            }
//Listado de todas las películas
                break;

            case 3:
            {
                List<Actor> listaActores = cine.listadoActores();
                for(int i = 0; i<listaActores.size();i++)
                {
                    System.out.println(listaActores.get(i));
                    System.out.println();
                }
            }
//Listado de todos los actores.
                break;

            case 4:
            {
                sc.nextLine();
                System.out.println("Dime el nombre del actor");
                String nombre = sc.nextLine();
                int idActor = cine.buscaActor(nombre);

                List<Pelicula> listaPeliculas = cine.listadoPeliculasPorActores(idActor);

                for(int i = 0; i<listaPeliculas.size();i++)
                {
                    System.out.println(listaPeliculas.get(i));
                    System.out.println();
                }

            }
//Listado de todas las películas de un actor: se le pedirá al usuario el nombre del actor y
//se buscará su id en la base de datos. Después se sacará un listado de todas las películas
//de este actor.
                break;

            case 5:
            {
                sc.nextLine();
                System.out.println("Titulo de la pelicula");
                String titulo = sc.nextLine();
                int idPelicula = cine.buscaPelicula(titulo);
                System.out.println(cine.datosPelicula(idPelicula));
                System.out.println();
                System.out.println("Actores principales:");
                System.out.println();
                List<ActorPelicula> listaActores = cine.listadoActoresPorPelicula(idPelicula);
                List<ActorPelicula> listaActoresSecundarios = new LinkedList<>();
                for(int i = 0; i<listaActores.size();i++)
                {
                    if (listaActores.get(i).principal)
                    {
                        System.out.println(listaActores.get(i));
                        System.out.println();
                    }
                    else
                    {
                        listaActoresSecundarios.add(listaActores.get(i));
                    }
                }

                if (listaActoresSecundarios.size()>0)
                {
                    System.out.println("Actores secundarios:");
                    for(int i = 0; i<listaActoresSecundarios.size();i++)
                    {
                        System.out.println(listaActoresSecundarios.get(i));
                        System.out.println();
                    }
                }


            }
//Información de una película: se mostrarán todos los datos de una películas, incluyendo
//todos los actores que participan en ella, listando primero los actores principales.
                break;


            default:
                System.out.println("Operación inválida");
        }
    }
}
