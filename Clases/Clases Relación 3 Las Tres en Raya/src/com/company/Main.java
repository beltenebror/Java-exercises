package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main
{

    public static void main(String[] args) throws InterruptedException
    {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menú");
        System.out.println();
        System.out.println("1. jugador vs jugador");
        System.out.println("2. jugador vs ordenador medio - fácil");
        System.out.println("3. ordenador vs jugador medio - más complicaito");
        System.out.println("4. ordenador vs ordenador");

        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                TresEnRaya partida = new TresEnRaya();
                partida.dibujaTablero();
                int pos;
                boolean seguir=true;
                while(partida.quedanMovimientos() && seguir)
                {
                    System.out.println("Jugador uno introduce la posición ");
                    pos=sc.nextInt();
                    while(!partida.movimientoValido(pos))
                    {
                        System.out.println("Jugador uno tu posición es incorrecta vuelve a intentarlo ");
                        pos=sc.nextInt();
                    }
                    partida.mueveJugador1(pos);
                    partida.dibujaTablero();

                    if(partida.ganaJugador1())
                    {
                        System.out.println("Gana el jugador uno");
                        seguir=false;

                    }

                    if(partida.quedanMovimientos()&& seguir)
                    {
                        System.out.println("Jugador dos introduce la posición ");
                        pos=sc.nextInt();
                        while(!partida.movimientoValido(pos))
                        {
                            System.out.println("Jugador dos tu posición es incorrecta vuelve a intentarlo ");
                            pos=sc.nextInt();
                        }
                        partida.mueveJugador2(pos);
                        partida.dibujaTablero();
                    }
                    if(partida.ganaJugador2())
                    {
                        System.out.println("Gana el jugador dos");
                        seguir=false;

                    }

                }
                if(!partida.ganaJugador1()&& !partida.ganaJugador2())
                {
                    System.out.println("Nadie gana");
                }

            }
            break;

            case 2:
            {
                TresEnRaya partida = new TresEnRaya();
                partida.dibujaTablero();
                int pos;
                boolean seguir=true;
                while(partida.quedanMovimientos() && seguir)
                {
                    System.out.println("Jugador uno introduce la posición ");
                    pos=sc.nextInt();
                    while(!partida.movimientoValido(pos))
                    {
                        System.out.println("Jugador uno tu posición es incorrecta vuelve a intentarlo ");
                        pos=sc.nextInt();
                    }
                    partida.mueveJugador1(pos);
                    partida.dibujaTablero();

                    if(partida.ganaJugador1())
                    {
                        System.out.println("Gana el jugador uno");
                        seguir=false;

                    }

                    if(partida.quedanMovimientos() && seguir)
                    {

                        partida.mueveOrdenador2();
                        partida.dibujaTablero();
                    }
                    if(partida.ganaJugador2())
                    {
                        System.out.println("Gana el jugador dos");
                        seguir=false;

                    }

                }
                if(!partida.ganaJugador1()&& !partida.ganaJugador2())
                {
                    System.out.println("Nadie gana");
                }


            }
            break;

            case 3:
            {
                TresEnRaya partida = new TresEnRaya();
                partida.dibujaTablero();
                int pos;
                boolean seguir=true;
                while(partida.quedanMovimientos() && seguir)
                {
                    TimeUnit.SECONDS.sleep(1);
                    partida.mueveOrdenador1();
                    partida.dibujaTablero();

                    if(partida.ganaJugador1())
                    {
                        System.out.println("Gana el jugador uno");
                        seguir=false;

                    }

                    if(partida.quedanMovimientos()&& seguir)
                    {
                        System.out.println("Jugador dos introduce la posición ");
                        pos=sc.nextInt();
                        while(!partida.movimientoValido(pos))
                        {
                            System.out.println("Jugador dos tu posición es incorrecta vuelve a intentarlo ");
                            pos=sc.nextInt();
                        }
                        partida.mueveJugador2(pos);
                        partida.dibujaTablero();
                    }
                    if(partida.ganaJugador2())
                    {
                        System.out.println("Gana el jugador dos");
                        seguir=false;

                    }

                }
                if(!partida.ganaJugador1()&& !partida.ganaJugador2())
                {
                    System.out.println("Nadie gana");
                }
            }
            break;

            case 4:
            {

                TresEnRaya partida = new TresEnRaya();
                partida.dibujaTablero();
                int pos;
                boolean seguir=true;
                while(partida.quedanMovimientos() && seguir)
                {
                    partida.mueveOrdenador1();
                    partida.dibujaTablero();

                    if(partida.ganaJugador1())
                    {
                        System.out.println("Gana el jugador uno");
                        seguir=false;

                    }

                    if(partida.quedanMovimientos()&& seguir)
                    {
                       partida.mueveOrdenador2();
                        partida.dibujaTablero();
                    }
                    if(partida.ganaJugador2())
                    {
                        System.out.println("Gana el jugador dos");
                        seguir=false;

                    }

                }
                if(!partida.ganaJugador1()&& !partida.ganaJugador2())
                {
                    System.out.println("Nadie gana");
                }

            }
            break;

            default:
                System.out.println("Ese modo de juego no está disponible");
        }


    }
}
