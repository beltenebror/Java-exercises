package com.company;

public class Pokemon
{
    //Atributos
    private int id;
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private int vida;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velovidad;
    private String habilidad;
    private boolean caputurado;

    //Constructor

    public Pokemon(int id, String nombre, String tipo, int ataque, int defensa, int vida, int ataqueEspecial, int defensaEspecial, int velovidad, String habilidad, boolean caputurado)
    {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velovidad = velovidad;
        this.habilidad = habilidad;
        this.caputurado = caputurado;
    }


    //Propiedades

             //gets
    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public int getAtaque()
    {
        return ataque;
    }

    public int getDefensa()
    {
        return defensa;
    }

    public int getVida()
    {
        return vida;
    }

    public int getAtaqueEspecial()
    {
        return ataqueEspecial;
    }

    public int getDefensaEspecial()
    {
        return defensaEspecial;
    }

    public int getVelovidad()
    {
        return velovidad;
    }

    public String getHabilidad()
    {
        return habilidad;
    }

    public boolean isCaputurado()
    {
        return caputurado;
    }

             //sets

    public void setCaputurado(boolean caputurado)
    {
        this.caputurado = caputurado;
    }


    //Metodos


    @Override
    public String toString()
    {
        String capturadoSiNo="no";
        if(caputurado)
        {
            capturadoSiNo="Si";
        }

        return "Pokemon " + id +":  \n" +
                "  Nombre= " + nombre + '\n' +
                "  Tipo= " + tipo + '\n' +
                "  Ataque= " + ataque + '\n' +
                "  Defensa= " + defensa + '\n' +
                "  Vida= " + vida + '\n' +
                "  Ataque Especial= " + ataqueEspecial + '\n' +
                "  Defensa Especial= " + defensaEspecial + '\n' +
                "  Velovidad= " + velovidad + '\n' +
                "  Habilidad= " + habilidad + '\n' +
                "  Caputurado= " + capturadoSiNo + '\n';


    }
}
