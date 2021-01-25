package com.company;

import java.security.InvalidParameterException;

public class Libro
{
    //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean leido;

    //Contrusctor


    public Libro(String isbn, String titulo, String autor, int numeroPaginas, boolean leido)
    {
        if(compruebaISBN(isbn))
        {
            this.isbn = isbn;
        }
        else
        {
            throw new InvalidParameterException("Isbn invalido");
        }
        if (numeroPaginas>0)
        {
            this.numeroPaginas = numeroPaginas;
        }
        else
        {
            throw new InvalidParameterException("Numero de páginas invalido");
        }
        this.titulo = titulo;
        this.autor = autor;

        this.leido = leido;
    }


    //Propiedades


    public String getAutor()
    {
        return autor;
    }

    public boolean isLeido()
    {
        return leido;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setLeido(boolean leido)
    {
        this.leido = leido;
    }


    //Metodos

    private boolean compruebaISBN(String isbn)
    {
        boolean devolver = true;
        String estoDebenSerNumeros="";
        String estoDebenSerGuiones="";
        if(isbn.length()!=17)
        {
            devolver=false;
        }

        if (devolver)
        {
            estoDebenSerNumeros = estoDebenSerNumeros + isbn.substring(0,3)+ isbn.substring(4,6) + isbn.substring(7,11) +
                    isbn.substring(12,15) + isbn.charAt(16);


            estoDebenSerGuiones = estoDebenSerGuiones + isbn.charAt(3) +  isbn.charAt(6)+  isbn.charAt(11)+  isbn.charAt(15);

            for(int i = 0; i< estoDebenSerNumeros.length();i++)
            {
                if (!Character.isDigit(estoDebenSerNumeros.charAt(i)))
                {
                    devolver=false;
                    i = estoDebenSerNumeros.length()+1;
                }

            }

            if (devolver)
            {
                for (int i = 0; i<estoDebenSerGuiones.length();i++)
                {
                    if(estoDebenSerGuiones.charAt(i)!='-')
                    {
                        devolver=false;
                        i=estoDebenSerGuiones.length();
                    }
                }
            }


        }



        return devolver;
    }

    @Override
    public String toString()
    {
        return "'" + titulo + "' de " + autor ;
    }

}
