package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean seguir =true;
        Scanner sc = new Scanner(System.in);
        Longitud miLongitud;
        System.out.println("Establezcamos la longitud inicial, marca la opción");
        System.out.println("1.- Metros");
        System.out.println("2.- Pulgadas");
        System.out.println("3.- Pies");
        System.out.println("4.- Yardas");
        int tipoUnidad = sc.nextInt();
        System.out.println("Ahora introduce la canditdad");
        double cantidad = sc.nextDouble();
        switch (tipoUnidad)
        {
            case 1:
            {
                 miLongitud = new Longitud(cantidad,UnidadLongiud.metros);
            }
            break;

            case 2:
            {
                 miLongitud = new Longitud(cantidad,UnidadLongiud.pulgadas);
            }
            break;

            case 3:
            {
                 miLongitud = new Longitud(cantidad,UnidadLongiud.pies);
            }
            break;

            case 4:
            {
                 miLongitud = new Longitud(cantidad,UnidadLongiud.yardas);
            }
            break;

            default:
                miLongitud = new Longitud(0,UnidadLongiud.metros);
                System.out.println("Error en la unidad de medida");
                seguir=false;
        }
        sc.nextLine();
        while (seguir)
        {
            System.out.println("Nuestra longitud es:");
            System.out.println("                            "+miLongitud);
            System.out.println();
            System.out.println();
            System.out.println("Qué desea hacer ahora");
            System.out.println("1.- Comparar mi longitud con otra");
            System.out.println("2.- Operar con mi longitud");
            System.out.println("3.- Terminar");
            int opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    Longitud Longitud2;
                    System.out.println("Establezcamos la longitud a comparar");
                    System.out.println("1.- Metros");
                    System.out.println("2.- Pulgadas");
                    System.out.println("3.- Pies");
                    System.out.println("4.- Yardas");
                    int tipoUnidad2 = sc.nextInt();
                    System.out.println("Ahora introduce la canditdad");
                    double cantidad2 = sc.nextDouble();
                    switch (tipoUnidad2)
                    {
                        case 1:
                        {
                            Longitud2 = new Longitud(cantidad2,UnidadLongiud.metros);
                        }
                        break;

                        case 2:
                        {
                            Longitud2 = new Longitud(cantidad2,UnidadLongiud.pulgadas);
                        }
                        break;

                        case 3:
                        {
                            Longitud2 = new Longitud(cantidad2,UnidadLongiud.pies);
                        }
                        break;

                        case 4:
                        {
                            Longitud2 = new Longitud(cantidad2,UnidadLongiud.yardas);
                        }
                        break;

                        default:
                            Longitud2 = new Longitud(0,UnidadLongiud.metros);
                            System.out.println("Error en la unidad de medida");
                            seguir=false;
                    }
                    int comparacion = miLongitud.comparteTo(Longitud2);
                    switch (comparacion)
                    {
                        case -1:
                            System.out.println("Nuestra medida es menor");
                            break;
                        case 0:
                            System.out.println("Son iguales");
                            break;
                        case 1:
                            System.out.println("Nuestra canditad es mayor");
                            break;
                    }
                }
                break;

                case 2:
                {
                    System.out.println("1.- Sumar otra longitud");
                    System.out.println("2.- Restar otra longitud");
                    System.out.println("3.- Multiplicar la longitud");
                    System.out.println("3.- Dividir la longitud");
                    int noSeComoLlamarATantasVariablesParaTantosSwitch= sc.nextInt();
                    switch (noSeComoLlamarATantasVariablesParaTantosSwitch)
                    {
                        case 1:
                        {
                            Longitud Longitud2;
                            System.out.println("Establezcamos la longitud a sumar");
                            System.out.println("1.- Metros");
                            System.out.println("2.- Pulgadas");
                            System.out.println("3.- Pies");
                            System.out.println("4.- Yardas");
                            int tipoUnidad2 = sc.nextInt();
                            System.out.println("Ahora introduce la canditdad");
                            double cantidad2 = sc.nextDouble();
                            switch (tipoUnidad2)
                            {
                                case 1:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.metros);
                                }
                                break;

                                case 2:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.pulgadas);
                                }
                                break;

                                case 3:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.pies);
                                }
                                break;

                                case 4:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.yardas);
                                }
                                break;

                                default:
                                    Longitud2 = new Longitud(0,UnidadLongiud.metros);
                                    System.out.println("Error en la unidad de medida");
                                    seguir=false;
                            }
                            System.out.println("El resultado es:");
                            System.out.println("                 "+miLongitud.add(Longitud2));
                        }
                            break;
                        case 2:
                        {
                            Longitud Longitud2;
                            System.out.println("Establezcamos la longitud a sumar");
                            System.out.println("1.- Metros");
                            System.out.println("2.- Pulgadas");
                            System.out.println("3.- Pies");
                            System.out.println("4.- Yardas");
                            int tipoUnidad2 = sc.nextInt();
                            System.out.println("Ahora introduce la canditdad");
                            double cantidad2 = sc.nextDouble();
                            switch (tipoUnidad2)
                            {
                                case 1:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.metros);
                                }
                                break;

                                case 2:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.pulgadas);
                                }
                                break;

                                case 3:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.pies);
                                }
                                break;

                                case 4:
                                {
                                    Longitud2 = new Longitud(cantidad2,UnidadLongiud.yardas);
                                }
                                break;

                                default:
                                    Longitud2 = new Longitud(0,UnidadLongiud.metros);
                                    System.out.println("Error en la unidad de medida");
                                    seguir=false;
                            }
                            System.out.println("El resultado es:");
                            System.out.println("                 "+miLongitud.substract(Longitud2));
                        }
                            break;
                        case 3:
                        {
                            System.out.println("Introduce el número por el que multiplicarlo");
                            int n = sc.nextInt();
                            System.out.println("El resultado es:");
                            System.out.println("                 "+miLongitud.multiply(n));
                        }
                            break;
                        case 4:
                        {
                            System.out.println("Introduce el número por el que dividirlo");
                            int n = sc.nextInt();
                            System.out.println("El resultado es:");
                            System.out.println("                 "+miLongitud.divide(n));
                        }
                            break;

                        default:
                            System.out.println("valor erroneao");
                    }

                }
                break;

                case 3:
                {
                    seguir=false;
                }
                break;



                default:
                    miLongitud = new Longitud(0,UnidadLongiud.metros);
                    System.out.println("Error en la opcion");
                    seguir=false;
            }

            seguir=false;

        }


    }
}
