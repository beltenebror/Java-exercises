package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Pokedex
{
    //Atributo
    List<Pokemon> listaPokemon;

    //Constructor
    public Pokedex(String fichero)
    {
        listaPokemon = new LinkedList<>();
        String linea;
        String [] lineaCachos;
        int id;
        String nombre;
        String tipo;
        int ataque;
        int defensa;
        int vida;
        int ataqueEspecial;
        int ddefensaEspecial;
        int velovidad;
        String habilidad;
        boolean capturado;

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea=br.readLine();
            while(linea!=null)
            {
                lineaCachos=linea.split(";");
                id = Integer.valueOf(lineaCachos[0]);
                nombre = lineaCachos[1];
                tipo = lineaCachos[2];
                ataque = Integer.valueOf(lineaCachos[3]);
                defensa = Integer.valueOf(lineaCachos[4]);
                vida = Integer.valueOf(lineaCachos[5]);
                ataqueEspecial = Integer.valueOf(lineaCachos[6]);
                ddefensaEspecial = Integer.valueOf(lineaCachos[7]);
                velovidad = Integer.valueOf(lineaCachos[8]);
                habilidad = lineaCachos[9];
                capturado = Boolean.valueOf(lineaCachos[10]);

                Pokemon pokemon = new Pokemon(id,nombre,tipo,ataque,defensa,vida,ataqueEspecial,ddefensaEspecial,velovidad,habilidad,capturado);
                listaPokemon.add(pokemon);

                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public Pokedex()
    {
        listaPokemon = new LinkedList<>();
    }


    //Metodos
    public void leeCSV(String fichero)
    {
        String linea;
        String [] lineaCachos;
        int id;
        String nombre;
        String tipo;
        int ataque;
        int defensa;
        int vida;
        int ataqueEspecial;
        int ddefensaEspecial;
        int velovidad;
        String habilidad;
        boolean capturado;

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            linea=br.readLine();
            while(linea!=null)
            {
                lineaCachos=linea.split(";");
                id = Integer.valueOf(lineaCachos[0]);
                nombre = lineaCachos[1];
                tipo = lineaCachos[2];
                ataque = Integer.valueOf(lineaCachos[3]);
                defensa = Integer.valueOf(lineaCachos[4]);
                vida = Integer.valueOf(lineaCachos[5]);
                ataqueEspecial = Integer.valueOf(lineaCachos[6]);
                ddefensaEspecial = Integer.valueOf(lineaCachos[7]);
                velovidad = Integer.valueOf(lineaCachos[8]);
                habilidad = lineaCachos[9];
                capturado = Boolean.valueOf(lineaCachos[10]);

                Pokemon pokemon = new Pokemon(id,nombre,tipo,ataque,defensa,vida,ataqueEspecial,ddefensaEspecial,velovidad,habilidad,capturado);
                listaPokemon.add(pokemon);

                linea=br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void guardaCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);


            for(int i=0;i<listaPokemon.size();i++)
            {
                bw.write(listaPokemon.get(i).getId() + ";");
                bw.write(listaPokemon.get(i).getNombre()+";");
                bw.write(listaPokemon.get(i).getTipo()+";");
                bw.write(listaPokemon.get(i).getAtaque()+";");
                bw.write(listaPokemon.get(i).getDefensa()+";");
                bw.write(listaPokemon.get(i).getVida()+";");
                bw.write(listaPokemon.get(i).getAtaqueEspecial()+";");
                bw.write(listaPokemon.get(i).getDefensaEspecial()+";");
                bw.write(listaPokemon.get(i).getVelovidad()+";");
                bw.write(listaPokemon.get(i).getHabilidad()+";");
                bw.write(String.valueOf(Boolean.valueOf(listaPokemon.get(i).isCaputurado())) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void capturaPokemon(String nombre)
    {
        for(int i = 0; i < listaPokemon.size(); i++ )
        {
            if (listaPokemon.get(i).getNombre().equals(nombre))
            {
                listaPokemon.get(i).setCaputurado(true);
            }
        }
    }

    public double porcentajeCapturas()
    {
        double numeroCapturados=0;
        for(int i = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).isCaputurado())
            {
                numeroCapturados=numeroCapturados+1;
            }
        }
        return ((numeroCapturados*100)/listaPokemon.size());
    }

    public Pokemon buscaPokemon(int id)
    {
        Pokemon devolver=null;
        for(int i = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).getId()==id)
            {
                devolver = listaPokemon.get(i);
            }
        }
        return devolver;
    }

    public Pokemon buscaPokemon(String nombre)
    {
        Pokemon devolver=null;
        for(int i = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).getNombre().equals(nombre))
            {
                devolver = listaPokemon.get(i);
            }
        }
        return devolver;
    }

    public String listadoPokemon()
    {
        String listado="";
        for (int i  = 0; i < listaPokemon.size(); i++)
        {
            listado = listado + "Pokemon " + listaPokemon.get(i).getId()+ "= " + listaPokemon.get(i).getNombre() +", " + listaPokemon.get(i).getTipo();
            listado = listado + "\n";
        }
        return listado;
    }

    public String listadoPokemonCapturados()
    {
        String listado="";
        for (int i  = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).isCaputurado())
            {
                listado = listado + "Pokemon " + listaPokemon.get(i).getId()+ "= " + listaPokemon.get(i).getNombre() +", " + listaPokemon.get(i).getTipo();
                listado = listado + "\n";
            }
        }
        return listado;
    }

    public String listadoPokemonTipo(String tipo)
    {
        String listado="";
        for (int i  = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).getTipo().equals(tipo))
            {
                listado = listado + "Pokemon " + listaPokemon.get(i).getId()+ "= " + listaPokemon.get(i).getNombre() +", " + listaPokemon.get(i).isCaputurado();
                listado = listado + "\n";
            }
        }
        return listado;
    }

    public String listadoPokemonCapturadosTipo(String tipo)
    {
        String listado="";
        for (int i  = 0; i < listaPokemon.size(); i++)
        {
            if(listaPokemon.get(i).getTipo().equals(tipo))
            {
                if(listaPokemon.get(i).isCaputurado())
                {
                    listado = listado + "Pokemon " + listaPokemon.get(i).getId()+ "= " + listaPokemon.get(i).getNombre();
                    listado = listado + "\n";
                }
            }
        }
        return listado;
    }













}
