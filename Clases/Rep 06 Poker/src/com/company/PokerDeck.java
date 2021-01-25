package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PokerDeck
{
    //Atributos
    List<PokerCard> deck;

    public PokerDeck()
    {
        deck = new LinkedList<>();
        for(int i = 0; i<4 ; i++)
        {
            for(int j=0; j<13; j++)
            {
                PokerCard cartaTemporal = new PokerCard(Suit.values()[i],Rank.values()[j]);
                deck.add(cartaTemporal);
            }
        }
        Collections.shuffle(deck);
    }

    @Override
    public String toString()
    {
       String devolver="";
       for(int i=0;i<deck.size();i++)
       {
           devolver=devolver + deck.get(i).toString();
           devolver=devolver+ "\n";
       }
       return devolver;
    }

    //Metodo-Robar carta(coge la primera carta)
    public PokerCard drawCard()
    {
        PokerCard devolver = deck.get(0);
        deck.remove(0);
        return devolver;
    }
}
