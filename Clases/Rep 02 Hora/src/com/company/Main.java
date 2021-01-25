package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la hora con la que desea trabajar:");
        System.out.println("Hora:");
        int hora = sc.nextInt();
        System.out.println("Minutos:");
        int minutos = sc.nextInt();
        System.out.println("Segundos:");
        int segundos = sc.nextInt();
        int opcion;
        int tipoSuma;
        int tipoResta;
        Hora horita = new Hora(hora,minutos,segundos);
        boolean seguir = true;
        int horasTemporales;
        int minutosTemporales;
        int segundosTemporales;
        while(seguir)
        {
            System.out.println();
            System.out.println();
            System.out.println("¿Qué desea hacer ahora?");
            System.out.println(" 1-Ver la hora guardada");
            System.out.println(" 2-Sumar a mi hora");
            System.out.println(" 3-Restar a mi hora");
            System.out.println(" 4-Terminar");
            opcion= sc.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println(horita); break;

                case 2:
                {
                    System.out.println("¿Qué desea sumar?");
                    System.out.println(" 1-Una nueva hora(hora,minutos,segundos)");
                    System.out.println(" 2-Segundos");
                    System.out.println(" 3-Minutos");
                    System.out.println(" 4-Horas");
                    tipoSuma=sc.nextInt();
                    switch (tipoSuma)
                    {
                        case 1:
                        {
                            System.out.println("Introduzcamos la hora a sumar");
                            System.out.println("Hora:");
                            horasTemporales=sc.nextInt();
                            System.out.println("Minutos:");
                            minutosTemporales=sc.nextInt();
                            System.out.println("Segundos");
                            segundosTemporales=sc.nextInt();
                            Hora horaTemporal = new Hora(horasTemporales,minutosTemporales,segundosTemporales);
                            horita.add(horaTemporal);
                        }
                        break;
                        case 2:
                        {
                            System.out.println("¿Cuantos segundos desea sumar?");
                            segundosTemporales=sc.nextInt();
                            horita.sumaSegundos(segundosTemporales);
                        }
                        break;
                        case 3:
                        {
                            System.out.println("¿Cuantos minutos desea sumar?");
                            minutosTemporales = sc.nextInt();
                            horita.sumaMinutos(minutosTemporales);
                        }
                        break;
                        case 4:
                        {
                            System.out.println("¿Cuantas horas desea sumar?");
                            horasTemporales = sc.nextInt();
                            horita.sumaHoras(horasTemporales);
                        }
                        break;
                        default:
                            System.out.println("Operación de suma inexistente");
                    }

                }
                break;

                case 3:
                {
                    System.out.println("Tenga muy en cuenta que la hora no puede ser negativa");
                    System.out.println("¿Qué desea Restar?");
                    System.out.println(" 1-Una nueva hora(hora,minutos,segundos)");
                    System.out.println(" 2-Segundos");
                    System.out.println(" 3-Minutos");
                    System.out.println(" 4-Horas");
                    tipoSuma=sc.nextInt();
                    switch (tipoSuma)
                    {
                        case 1:
                        {
                            System.out.println("Introduzcamos la hora a restar");
                            System.out.println("Hora:");
                            horasTemporales=sc.nextInt();
                            System.out.println("Minutos:");
                            minutosTemporales=sc.nextInt();
                            System.out.println("Segundos");
                            segundosTemporales=sc.nextInt();
                            Hora horaTemporal = new Hora(horasTemporales,minutosTemporales,segundosTemporales);
                            horita.substract(horaTemporal);
                        }
                        break;
                        case 2:
                        {
                            System.out.println("¿Cuantos segundos desea restar?");
                            segundosTemporales=sc.nextInt();
                            horita.sumaSegundos(-segundosTemporales);
                        }
                        break;
                        case 3:
                        {
                            System.out.println("¿Cuantos minutos desea restar?");
                            minutosTemporales = sc.nextInt();
                            horita.sumaMinutos(-minutosTemporales);
                        }
                        break;
                        case 4:
                        {
                            System.out.println("¿Cuantas horas desea restar?");
                            horasTemporales = sc.nextInt();
                            horita.sumaHoras(-horasTemporales);
                        }
                        break;
                        default:
                            System.out.println("Operación de suma inexistente");
                    }
                }
                break;

                case 4:
                    seguir=false; break;

                default:
                    System.out.println("");
            }

        }




    }
}
