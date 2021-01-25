package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PokerHand
{
    //Atributos
    PokerCard[] hand;

    //constructor
    public PokerHand(PokerCard carta1, PokerCard carta2, PokerCard carta3, PokerCard carta4, PokerCard carta5)
    {
        hand = new PokerCard[5];
        hand[0] = carta1;
        hand[1] = carta2;
        hand[2] = carta3;
        hand[3] = carta4;
        hand[4] = carta5;
    }

    //toString
    @Override
    public String toString()
    {
        String devolver = "";
        for (int i = 0; i < 5; i++)
        {
            devolver = devolver + hand[i].toString() + " ";

        }
        return devolver;
    }

    //metodos

    public void sortHand()
    {
        List<PokerCard> listaTemporal = new LinkedList<>(Arrays.asList(hand));
        ordenarListaNumeros(listaTemporal);
        hand[0] = listaTemporal.get(0);
        hand[1] = listaTemporal.get(1);
        hand[2] = listaTemporal.get(2);
        hand[3] = listaTemporal.get(3);
        hand[4] = listaTemporal.get(4);
    }

    private void ordenarListaNumeros(List<PokerCard> a)
    {
        List<PokerCard> ordenada = new LinkedList<>();
        PokerCard min;
        int posicionmin;
        int i;
        while (a.size() != 0)
        {
            min = a.get(0);
            posicionmin = 0;
            for (i = 0; i < a.size(); i++)
            {

                if ((min.rank.ordinal() > a.get(i).rank.ordinal()) ||
                        ((min.rank.ordinal() == a.get(i).rank.ordinal()) && (min.suit.ordinal() > a.get(i).suit.ordinal())))
                {

                    min = a.get(i);
                    posicionmin = i;
                }
            }
            ordenada.add(min);
            a.remove(posicionmin);

        }

        a.addAll(ordenada);
    }

    public boolean isPair()
    {
        boolean devolver = false;
        for(int i=0;i<hand.length-1;i++)
        {
            if (hand[i].rank==hand[i+1].rank)
            {
                devolver=true;
                i=hand.length;
            }
        }
        return devolver;
    }

    public boolean isTwoPairs()
    {
        boolean devolver = false;
        int cont=0;
        int numeroanterior=-1;
        for(int i=0;i<hand.length-1;i++)
        {
            if (hand[i].rank==hand[i+1].rank)
            {
                if(cont==0)
                {
                    numeroanterior=hand[i].rank.ordinal();
                    cont=cont+1;
                    if (i<3)
                    {
                        i=i+1;
                    }
                }
                else
                {
                    if (numeroanterior!=hand[i].rank.ordinal())
                    {
                        cont=cont+1;
                        if (i<3)
                        {
                            i=i+1;
                        }
                        i=hand.length;
                    }
                }


            }
        }
        if(cont>1)
        {
            devolver=true;
        }
        return devolver;
    }

    public boolean isThree()
    {
        boolean devolver = false;
        for(int i=0;i<hand.length-2;i++)
        {
            if (hand[i].rank==hand[i+1].rank && hand[i+1].rank==hand[i+2].rank)
            {
                devolver=true;
                i=hand.length;
            }
        }
        return devolver;
    }

    public boolean isStraight()
    {
        boolean devolver = false;

        if (hand[0].rank.ordinal()+1==hand[1].rank.ordinal() && hand[1].rank.ordinal()+1==hand[2].rank.ordinal() && hand[2].rank.ordinal()+1==hand[3].rank.ordinal() && hand[3].rank.ordinal()+1==hand[4].rank.ordinal())
        {
            devolver=true;
        }
        return devolver;
    }

    public boolean isFlush()
    {
        boolean devolver = false;

        if (hand[0].suit==hand[1].suit && hand[1].suit==hand[2].suit && hand[2].suit==hand[3].suit && hand[3].suit==hand[4].suit)
        {
            devolver=true;
        }
        return devolver;
    }

    public boolean isFull()
    {
        boolean devolver = false;

        if ( isTwoPairs() && isThree())
        {
            devolver=true;
        }
        return devolver;
    }

    public boolean isPoker()
    {
        boolean devolver = false;
        for(int i=0;i<hand.length-3;i++)
        {
            if (hand[i].rank==hand[i+1].rank && hand[i+1].rank==hand[i+2].rank && hand[i+2].rank==hand[i+3].rank)
            {
                devolver=true;
                i=hand.length;
            }
        }
        return devolver;
    }

    public boolean isStraightFlush()
    {
        boolean devolver = false;

        if ( isStraight() && isFlush())
        {
            devolver=true;
        }
        return devolver;
    }

    public boolean isRoyalFlush()
    {
        boolean devolver = false;

        if ( isStraight() && hand[4].rank.ordinal()==12)
        {
            devolver=true;
        }
        return devolver;
    }

    public int handValue()
    {
        int devolver=0;
        if (isRoyalFlush())
        {
            devolver=800;
        }
        else
        {
            if (isStraightFlush())
            {
                devolver=50;
            }
            else
            {
                if (isPoker())
                {
                    devolver=25;
                }
                else
                {
                    if (isFull())
                    {
                        devolver=9;
                    }
                    else
                    {
                        if (isFlush())
                        {
                            devolver=6;
                        }
                        else
                        {
                            if (isStraight())
                            {
                                devolver=4;
                            }
                            else
                            {
                                if (isThree())
                                {
                                    devolver=3;
                                }
                                else
                                {
                                    if (isTwoPairs())
                                    {
                                        devolver=2;
                                    }
                                    else
                                    {
                                        if(isPair())
                                        {
                                            devolver=1;
                                        }
                                        else
                                        {
                                            devolver=0;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }

        }
        return devolver;

    }

    public String myHand()
    {
        String devolver="";
        int price = handValue();
        switch (price)
        {
            case 0: devolver="Pierdes";break;
            case 1: devolver="Pareja";break;
            case 2: devolver="Doble pareja";break;
            case 3: devolver="Trío";break;
            case 4: devolver="Escalera";break;
            case 6: devolver="Color";break;
            case 9: devolver="Full";break;
            case 25: devolver="Poker";break;
            case 50: devolver="Escalera de color";break;
            case 800: devolver="Escalera real";break;
        }
        return devolver;
    }

}
