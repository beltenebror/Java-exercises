package com.company;

enum DiaSemana  //tipo nuevo de dato valores 0,1,2...
{
    lunes, martes, miercoles, jeuves, viernes, sabado, domingo
}
public class Ejemplo
{
    int a;
    static int s; //s compartido para toda la clase /se accede de la clase

    static // inicializa el solito  los estaticos (cosntructor estático)
    {
        s=100;
    }

    public Ejemplo(int a)
    {
        this.a = a;
    }
    public static void incremetna100() //Solo para atributos staticos
    {
        s = s +100;
    }
}
