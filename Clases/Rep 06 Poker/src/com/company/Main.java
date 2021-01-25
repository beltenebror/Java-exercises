package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        int saldo=1;
        boolean jugar=true;
        while (jugar)
        {
            saldo=saldo-1;
            PokerDeck baraja = new PokerDeck();
            PokerHand mano = new PokerHand(baraja.drawCard(),baraja.drawCard(),baraja.drawCard(),baraja.drawCard(),baraja.drawCard());
            System.out.println("Esta es tu mano:");
            mano.sortHand();
            System.out.println(mano);
            System.out.println();
            System.out.println("¿Quieres descartar alguna carta? s/n");
            String descartar = sc.nextLine();
            if (descartar.equals("s"))
            {
                System.out.println("¿Cúales quieres descartar? Marca su posición. Ej: 1-3-4");
                String malasCartas = sc.nextLine();
                int malaCarta=-1;
               for(int i = 0;i<malasCartas.length();i++)
               {
                   if (malasCartas.charAt(i)=='-')
                     {
                    }
                   else
                    {
                       malaCarta = Character.getNumericValue(malasCartas.charAt(i));
                    mano.hand[malaCarta-1]=baraja.drawCard();
                  }
               }
            }
            System.out.println();
            System.out.println("Tu mano final es:");
            System.out.print(mano);
            mano.sortHand();
            System.out.println(" --> "+ mano);
            System.out.println();
            System.out.println(mano.myHand()+"! El valor de tu mano es: "+ mano.handValue());
            saldo=saldo+mano.handValue();
            System.out.println(".......................................................Saldo = "+saldo);
            if (saldo==0)
            {
                jugar=false;
            }
            else
            {
                System.out.println("¿Quieres seguir jugando? s/n");
                String seguir = sc.nextLine();
                if (!seguir.equals("s"))
                {
                    jugar=false;
                }

            }
            Thread.sleep(1000);

            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }
    }
}
