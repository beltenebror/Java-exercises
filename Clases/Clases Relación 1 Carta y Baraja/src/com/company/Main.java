package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //Para terminar, haremos un programita para jugar a las 7 y media. Será muy sencillo: creamos
        //una baraja, la barajamos y le vamos ofreciendo al usuario si quiere más cartas o quiere plantarse.
        //Con cada carta que robemos nos irá diciendo nuestra puntuación total o si ya nos hemos pasado.

        Baraja barajita = new Baraja(1,true);
        Carta micarta;
        double puntiacion=0;
        boolean seguir=true;
        String continuar;
        System.out.println("TE TOCA");
        while(seguir)
        {
            System.out.println();
            micarta=barajita.robar();
            puntiacion=puntiacion+micarta.valor7ymedia();
            System.out.println("Tu carta es " +micarta.nombreCarta());
            System.out.println("Tu puntuacion actual es " +puntiacion);
            if(puntiacion<7.5)
            {
                System.out.println("Aún no has llegado ¿quieres contuniar? s=sí, todo lo demás no ");
                continuar=sc.nextLine();
                if(!continuar.equals("s"))
                {
                    seguir=false;
                }
            }
            else
            {
                if(puntiacion==7.5)
                {
                    System.out.println("Justo!");
                    seguir=false;
                }
                else
                {
                    System.out.println("Te pasaste");
                    seguir=false;
                }
            }
        }

        //ahora el ordenador intenta ganarme
        double puntuacionOrdenador=0;
        seguir=true;
        Carta cartaPc;
        System.out.println("AHORA LA MAQUINA");
        if(puntiacion>7.5)
        {
            System.out.println();
            cartaPc=barajita.robar();
            puntuacionOrdenador=puntuacionOrdenador+cartaPc.valor7ymedia();
            System.out.println("La carta del pc " +cartaPc.nombreCarta());
            System.out.println("La puntuacion actual del pc es " +puntuacionOrdenador);
        }
        else
        {
            while(seguir)
            {
                System.out.println();
                cartaPc=barajita.robar();
                puntuacionOrdenador=puntuacionOrdenador+cartaPc.valor7ymedia();
                System.out.println("La carta del pc " +cartaPc.nombreCarta());
                System.out.println("La puntuacion actual del pc es " +puntuacionOrdenador);
                if(puntuacionOrdenador<puntiacion)
                {
                    if(puntuacionOrdenador>=7)
                    {
                        seguir=false;
                    }
                }
                else
                {
                    if(puntuacionOrdenador==puntiacion)
                    {
                        if(puntuacionOrdenador>=6)
                        {
                            seguir=false;
                        }

                    }
                    else
                    {
                        seguir=false;
                    }
                }
            }
        }


        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        if(puntiacion>7.5)
        {
            System.out.println("Has perdido, gana la máquina");
        }
        else
        {
            if (puntuacionOrdenador>7.5)
            {
                System.out.println("Has ganado a la máquina");
            }
            else
            {
                if(puntuacionOrdenador==puntiacion)
                {
                    System.out.println("Empate");
                }
                else
                {
                    if(puntiacion>puntuacionOrdenador)
                    {
                        System.out.println("Has ganado");
                    }
                    else
                    {
                        System.out.println("Gana la máquina");
                    }
                }

            }
        }

    }
}
