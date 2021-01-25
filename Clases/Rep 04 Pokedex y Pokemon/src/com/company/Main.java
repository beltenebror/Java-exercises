package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Pokedex misPokemons = new Pokedex("pokemon.csv");
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("¿Qué desea hacer?");
        System.out.println("1.-Obtener listado de todos los pokemons");
        System.out.println("2.-Obtener listado de todos los pokemons capturados");
        System.out.println("3.-Obtener listado de todos los pokemons de un tipo");
        System.out.println("4.-Obtener listado de todos los pokemons que tengo capturado de un tipo");
        System.out.println("5.-Obtener datos de un pokemon (nombre)");
        System.out.println("6.-Obtener datos de un pokemon (id)");
        System.out.println("7.-Obtener el porcentaje de mis capturas");
        System.out.println("8.-Capturar pokemon");
        opcion=sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
                System.out.println(misPokemons.listadoPokemon());
                break;

            case 2:
                System.out.println(misPokemons.listadoPokemonCapturados());
                break;

            case 3:
            {
                System.out.println("Cual es el tipo que quieres ver");
                String tipo = sc.nextLine();
                System.out.println(misPokemons.listadoPokemonTipo(tipo));
            }
                break;

            case 4:
            {
                System.out.println("Cual es el tipo que quieres ver");
                String tipo = sc.nextLine();
                System.out.println(misPokemons.listadoPokemonCapturadosTipo(tipo));
            }
                break;

            case 5:
            {
                System.out.println("Cual es su nombre");
                String nombre = sc.nextLine();
                System.out.println(misPokemons.buscaPokemon(nombre));
            }
                break;
            case 6:
            {
                System.out.println("Caul es su id");
                int id = sc.nextInt();
                System.out.println(misPokemons.buscaPokemon(id));
            }
                break;
            case 7:
                System.out.println("El porcentaje de capturas es del: " + misPokemons.porcentajeCapturas()+"%");
                break;

            case 8:
            {
                System.out.println("Nombre del poquemon que quieres capturar");
                String nombre = sc.nextLine();
                misPokemons.capturaPokemon(nombre);
            }
                break;
            default:
                System.out.println("La opción seleccionada no existe");

        }

        misPokemons.guardaCSV("pokemon.csv");
    }
}
