package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutoVenta autoVenta = new AutoVenta();
        autoVenta.cargaCSV("Coches.csv");
        boolean hayQueGuardar = false;
        boolean seguir = true;
        while (seguir)
        {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1.-Ver lista actual de coches");
            System.out.println("2.-Añadir coche a la lista");
            System.out.println("3.-Buscar coche por su matricula");
            System.out.println("4.-Terminar");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion)
            {
                case 1:
                    System.out.println(autoVenta.imprimeListado()); break;

                case 2:
                {
                    System.out.println("Matricula:");
                    String matricula = sc.nextLine();
                    System.out.println("Marca:");
                    String marca = sc.nextLine();
                    System.out.println("Modelo");
                    String modelo = sc.nextLine();
                    System.out.println("Precio:");
                    Double precio = sc.nextDouble();
                    System.out.println("Año de matriculación:");
                    int anio = sc.nextInt();
                    System.out.println("Mes de matriculación:");
                    int mes = sc.nextInt();
                    System.out.println("Día de matriculación:");
                    int dia = sc.nextInt();
                    Coche cochecito = new Coche(matricula,LocalDate.of(anio,mes,dia),marca,modelo,precio);
                    autoVenta.insertaCoche(cochecito);
                    hayQueGuardar=true;

                }
                break;

                case 3:
                {
                    System.out.println("Introduce la matrícula:");
                    String matricula=sc.nextLine();
                    System.out.println(autoVenta.buscaCoche(matricula));
                }
                break;

                case 4: seguir=false; break;

                default:
                    System.out.println("Opción no disponible ");


            }
        }


        if (hayQueGuardar)
        {
            autoVenta.guardaCSV("Coches.csv");
        }



    }
}
