package com.company;

import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baraja
{
    //atributos

    private List<Carta> listaCartas;

    //Construsctores

    public Baraja()
    {
        listaCartas = new LinkedList<>();
    }

    public Baraja(int tipoBaraja)
    {
        listaCartas=new LinkedList<>();
        int i;
        Carta miCartaTemporal;
        if(tipoBaraja==1)
        {
            for(i=1;i<=40;i++)
            {
                miCartaTemporal= new Carta(i);
                listaCartas.add(miCartaTemporal);
            }
        }
        else
        {
            if(tipoBaraja==2)
            {
                for(i=0;i<40;i++)
                {
                    miCartaTemporal= new Carta(i);
                    listaCartas.add(miCartaTemporal);
                    listaCartas.add(miCartaTemporal);
                }
            }
            else
            {
                throw new InvalidParameterException("Tipo de baraja no valido");
            }
        }
    }

    public Baraja(int tipoBaraja, boolean barajar)
    {
        this(tipoBaraja);
        if(barajar)
        {
            Collections.shuffle(listaCartas);
        }
    }

    //Metodos

    public void barajar()
    {
        Collections.shuffle(listaCartas);
    }

    public void cortar(int numeroCartas)
    {
        int i;
        List<Carta> cartasTemporal= new LinkedList<>();
        for(i=0;i<numeroCartas;i++)
        {
            cartasTemporal.add(listaCartas.get(0));
            listaCartas.remove(0);
        }
        listaCartas.addAll(cartasTemporal);
    }

    public Carta robar()
    {
        Carta cartaAdevolver;
        cartaAdevolver=listaCartas.get(0);
        listaCartas.remove(0);
        return cartaAdevolver;
    }

    public void insertaCartaFinal(int idCarta)
    {
        Carta cartaTemporal = new Carta(idCarta);
        listaCartas.add(cartaTemporal);
    }

    public void insertaCartaPrincipio(int idCarta)
    {
        Carta cartaTemporal = new Carta(idCarta);
        listaCartas.add(0,cartaTemporal);
    }

    public void insertaCartaFinal(Carta c)
    {
        listaCartas.add(c);
    }

    public void insertaCartaPrincipio(Carta c)
    {
        listaCartas.add(0,c);
    }

    public int numeroCartas()
    {
        int numeroCartas = listaCartas.size();
        return numeroCartas;
    }

    public boolean vacia()
    {
        boolean vacia = false;
        if(listaCartas.size()==0)
        {
            vacia=true;
        }
        return vacia;
    }



}
