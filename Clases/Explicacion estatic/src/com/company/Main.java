package com.company;

public class Main {

    public static void main(String[] args)
    {
        Ejemplo e1 = new Ejemplo(10);
        Ejemplo.s=200;

        //metodo estaticos
        Ejemplo.incremetna100();
        System.out.println(Ejemplo.s);
        DiaSemana d = DiaSemana.domingo;
    }
}
