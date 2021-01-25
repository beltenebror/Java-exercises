package com.company;

enum Suit
{
    Hearts, Diamonds, Spades, Clubs
}
enum Rank
{
    N2, N3, N4, N5, N6, N7, N8, N9, N10, Jack, Queen, King, Ace
}

public class PokerCard
{
    //Atributos
    Suit suit;
    Rank rank;

    //Constructor
    public PokerCard(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    //Propiedades
    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    //toString
    @Override
    public String toString()
    {
        return carta()+palo();
    }

    private String carta()
    {
        String devolver="";
        int opcion = this.rank.ordinal();
        switch (opcion)
        {
            case 0: devolver="2"; break;
            case 1: devolver="3"; break;
            case 2: devolver="4"; break;
            case 3: devolver="5"; break;
            case 4: devolver="6"; break;
            case 5: devolver="7"; break;
            case 6: devolver="8"; break;
            case 7: devolver="9"; break;
            case 8: devolver="10"; break;
            case 9: devolver="J"; break;
            case 10: devolver="Q"; break;
            case 11: devolver="K"; break;
            case 12: devolver="A"; break;
        }
        return devolver;

    }
    private String palo ()
    {
        String devolver="";
        int opcion = this.suit.ordinal();
        switch (opcion)
        {
            case 0: devolver="\u001B[31m♥\u001B[0m"; break;
            case 1: devolver="\u001B[31m♦\u001B[0m"; break;
            case 2: devolver="\u001B[30m♠\u001B[0m"; break;
            case 3: devolver="\u001B[30m♣\u001B[0m"; break;
        }
        return devolver;

    }


}
