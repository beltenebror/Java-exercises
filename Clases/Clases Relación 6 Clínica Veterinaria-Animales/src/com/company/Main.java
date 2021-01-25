package com.company;

import java.lang.invoke.VarHandle;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        ClinicaVeterinaria miClinica = new ClinicaVeterinaria();
        System.out.println(miClinica.toString());
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir)
        {

            int opcion;

            System.out.println();
            System.out.println("¿Qué desea hacer?");
            System.out.println();
            System.out.println(" 1.- Añadir nuevo animal ");
            System.out.println(" 2.- Modificar comentario");
            System.out.println(" 3.- Datos de un Animal  ");
            System.out.println(" 4.- Datos de toda la clínica");
            System.out.println(" 5.- Salir");



            System.out.println();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {

                    System.out.println("¿Qué animal desea añadir?");
                    System.out.println();
                    System.out.print(" 1.- Perro  ");
                    System.out.print(" 2.- Gato   ");
                    System.out.print(" 3.- Pajaro ");
                    System.out.print(" 4.- Reptil ");
                    System.out.println();
                    opcion = sc.nextInt();
                    sc.nextLine();


                    switch (opcion)
                    {
                        case 1:
                        {
                            System.out.println("Introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce comentario");
                            String comentario = sc.nextLine();
                            System.out.println("Introduce el microchip");
                            String microchip = sc.nextLine();
                            System.out.println("Dia de nacimiento");
                            int dia = sc.nextInt();
                            System.out.println("Mes de nacimieno");
                            int mes = sc.nextInt();
                            System.out.println("Año de nacimiento");
                            int año = sc.nextInt();
                            System.out.println("Peso");
                            double peso = sc.nextDouble();
                            System.out.println("Cual es la raza?");
                            System.out.println("1.-PastorAleman, 2.-Husky, 3.-FoxTerrier, 4.-Dalmata, 5.-SanBernardo");
                            System.out.println(" (si no indicas cualquier otro valor se añadirá como pastor alemán, en esta clínica tenemos favoritismo)");
                            int numRaza=sc.nextInt();
                            RazaPerro raza;
                            switch (numRaza)
                            {
                                case 1:
                                    raza=RazaPerro.PastorAleman;
                                    break;

                                case 2:
                                    raza=RazaPerro.Husky;
                                    break;

                                case 3:
                                    raza=RazaPerro.FoxTerrier;
                                    break;

                                case 4:
                                    raza=RazaPerro.Dalmata;
                                    break;

                                case 5:
                                    raza=RazaPerro.SanBernardo;
                                    break;

                                default:
                                    raza=RazaPerro.PastorAleman; //si no me dices nada es pastor aleman
                            }
                            Perro perrito = new Perro(nombre,LocalDate.of(año,mes,dia),peso,comentario,raza,microchip);
                            miClinica.insertaAnimal(perrito);
                            sc.nextLine();
                        }
                        break;

                        case 2:
                        {

                            System.out.println("Introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce comentario");
                            String comentario = sc.nextLine();
                            System.out.println("Introduce el microchip");
                            String microchip = sc.nextLine();
                            System.out.println("Dia de nacimiento");
                            int dia = sc.nextInt();
                            System.out.println("Mes de nacimieno");
                            int mes = sc.nextInt();
                            System.out.println("Año de nacimiento");
                            int año = sc.nextInt();
                            System.out.println("Peso");
                            double peso = sc.nextDouble();
                            System.out.println("Cual es la raza?");
                            System.out.println("1.-Comun, 2.-Siames, 3.-Persa, 4.-Angora, 5.-ScottishFold");
                            System.out.println(" (si no indicas cualquier otro valor se añadirá como común)");
                            int numRaza=sc.nextInt();
                            RazaGato raza;
                            switch (numRaza)
                            {
                                case 1:
                                    raza=RazaGato.Comun;
                                    break;

                                case 2:
                                    raza=RazaGato.Siames;
                                    break;

                                case 3:
                                    raza=RazaGato.Persa;
                                    break;

                                case 4:
                                    raza=RazaGato.Angora;
                                    break;

                                case 5:
                                    raza=RazaGato.ScottishFold;
                                    break;

                                default:
                                    raza=RazaGato.Comun; //si no me dices nada es comun
                            }
                            Gato gatito = new Gato(nombre,LocalDate.of(año,mes,dia),peso,comentario,raza,microchip);
                            miClinica.insertaAnimal(gatito);
                            sc.nextLine();
                        }
                        break;

                        case 3:
                        {
                            System.out.println("Introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce comentario");
                            String comentario = sc.nextLine();
                            System.out.println("Canta? s-sí n-no");
                            String valorTemporal = sc.nextLine();
                            boolean cantor=false;
                            if(valorTemporal.equals("s"))
                            {
                                cantor=true;
                            }
                            System.out.println("Dia de nacimiento");
                            int dia = sc.nextInt();
                            System.out.println("Mes de nacimieno");
                            int mes = sc.nextInt();
                            System.out.println("Año de nacimiento");
                            int año = sc.nextInt();
                            System.out.println("Peso");
                            double peso = sc.nextDouble();
                            System.out.println("Cual es la especie?");
                            System.out.println("1.-Canario, 2.-Periquito, 3.-Agapornis");
                            System.out.println(" (si no indicas cualquier otro valor se añadirá como periquito)");
                            int numEspecie=sc.nextInt();
                            EspeciePajaro especie;
                            switch (numEspecie)
                            {
                                case 1:
                                    especie=EspeciePajaro.Canario;
                                    break;

                                case 2:
                                    especie=EspeciePajaro.Periquito;
                                    break;

                                case 3:
                                    especie=EspeciePajaro.Agapornis;
                                    break;


                                default:
                                    especie=EspeciePajaro.Periquito;; //si no me dices nada es periquio
                            }
                            Pajaro pajarito = new Pajaro(nombre,LocalDate.of(año,mes,dia),peso,comentario,especie,cantor);
                            miClinica.insertaAnimal(pajarito);
                            sc.nextLine();

                        }
                        break;

                        case 4:
                        {
                            System.out.println("Introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce comentario");
                            String comentario = sc.nextLine();
                            System.out.println("Venenoso? s-sí n-no");
                            String valorTemporal = sc.nextLine();
                            boolean venenoso=false;
                            if(valorTemporal.equals("s"))
                            {
                                venenoso=true;
                            }
                            System.out.println("Dia de nacimiento");
                            int dia = sc.nextInt();
                            System.out.println("Mes de nacimieno");
                            int mes = sc.nextInt();
                            System.out.println("Año de nacimiento");
                            int año = sc.nextInt();
                            System.out.println("Peso");
                            double peso = sc.nextDouble();
                            System.out.println("Cual es la especie?");
                            System.out.println("1.-Tortuga, 2.-Iguana, 3.-DragonDeComodo");
                            System.out.println(" (si no indicas cualquier otro valor se añadirá como Iguana)");
                            int numEspecie=sc.nextInt();
                            EspecieReptil especie;
                            switch (numEspecie)
                            {
                                case 1:
                                    especie=EspecieReptil.Tortuga;
                                    break;

                                case 2:
                                    especie=EspecieReptil.Iguana;
                                    break;

                                case 3:
                                    especie=EspecieReptil.DragonDeComodo;
                                    break;


                                default:
                                    especie=EspecieReptil.Iguana;; //si no me dices nada es iguana
                            }
                            Reptil bichito = new Reptil(nombre,LocalDate.of(año,mes,dia),peso,comentario,especie,venenoso);
                            miClinica.insertaAnimal(bichito);
                            sc.nextLine();

                        }
                        break;


                        default:
                            System.out.println("Operación invalida");
                    }


                }
                break;

                case 2:
                {
                    System.out.println("Nombre del animal");
                    String nombre = sc.nextLine();
                    System.out.println("Nuevo comentario");
                    String comentario = sc.nextLine();
                    miClinica.modificaComentarioAnimal(nombre,comentario);
                }
                break;

                case 3:
                {
                    System.out.println("Nombre del animal");
                    String nombre = sc.nextLine();
                    System.out.println(miClinica.buscaAnimal(nombre).toString());
                }
                break;

                case 4:
                {
                    System.out.println(miClinica.toString());
                }
                break;

                case 5:
                {
                    seguir=false;
                }
                break;


                default:
                    System.out.println("Operación invalida");
            }
        }



    }


}
