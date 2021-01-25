package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("El cambio de 1 Euro a dolares es:");
        BuscaTexto miTexto = new BuscaTexto();
        miTexto.cargaFichero("cambio.html");
        miTexto.busca("cc-ratebox");
        miTexto.buscaSiguiente("tabindex");
        System.out.println(miTexto.extraeCadena(">","<"));
        System.out.println();

        System.out.println("La fecha y hora de actualización de este cambio es:");
        miTexto.busca("utc-timestamp");
        System.out.println(miTexto.extraeCadena(">","<"));



    }
}
