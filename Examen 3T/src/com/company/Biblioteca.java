package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca
{
    //Atributo
     public List<Libro> lista;


    //Constructor
    public Biblioteca()
    {
        lista = new LinkedList<>();
    }

    //Metodos
    public void insertaLibro(Libro l)
    {
        boolean existe = false;

        for(int i = 0 ; i < lista.size() ; i++)
        {
            if (l.getIsbn()==lista.get(i).getIsbn())
            {
                existe=true;
                i=lista.size();
            }
        }

        if (!existe)
        {
            lista.add(l);
        }
    }

    public void leeFicheroLibros(String fichero)
    {
        lista.clear();
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            String isbn;
            String titulo;
            String autor;
            int numeroPaginas;
            Boolean leido;

            int numeroLibros=dis.readInt();

            for(int i=0;i<numeroLibros;i++)
            {
                isbn = dis.readUTF();
                titulo = dis.readUTF();
                autor = dis.readUTF();
                numeroPaginas = dis.readInt();
                leido = dis.readBoolean();
                Libro librito = new Libro(isbn,titulo,autor,numeroPaginas,leido);

                lista.add(librito);

            }


            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void ordenaPorPaginasDesc() //Comentario de Luis: Esto es selección tipo array
    {
        Libro librito;

        int numeroPasada = 0;
        while (numeroPasada<lista.size()-1)
        {
            int paginasMax = lista.get(numeroPasada).getNumeroPaginas();
            int posicionMax = numeroPasada;
            for (int i = numeroPasada+1; i < lista.size() ; i++ )
            {
                if(lista.get(i).getNumeroPaginas()>paginasMax)
                {
                    paginasMax=lista.get(i).getNumeroPaginas();
                    posicionMax=i;
                }
            }

            librito = lista.get(posicionMax);
            lista.remove(posicionMax);
            lista.add(numeroPasada,librito);

            numeroPasada=numeroPasada+1;
        }
    }

    @Override
    public String toString()
    {
        String devolver="";
        for(int i = 0; i < lista.size() ; i++)
        {
            devolver=devolver + lista.get(i) + "\n";
        }
        return devolver;
    }
}
