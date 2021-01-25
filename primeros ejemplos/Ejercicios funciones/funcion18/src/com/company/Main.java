package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “resolucionCamara” a la que le pasas el número de MegaPixels que tiene una cámara digital
    // (puede ser un double) y nos dice cuál es la resolución máxima de las fotos que hace la cámara.
    // Como no podemos devolver dos valores (la altura y la anchura de la imagen), los escribiremos por pantalla.(void)

     //altura =raizcuadrada(pixeles*(9/16)
    //anchira al reves
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double megapixeles;
        System.out.println(" dime los megapixeles");
        megapixeles = sc.nextDouble();
        resolucionCamara(megapixeles);
    }
    public static void resolucionCamara(double megap)
    {
        double p = megap * 1000000;
        double al; //alto
        double anc; //ancho
        al = Math.sqrt(p * (9.0/16.0));
        anc = Math.sqrt(p * (16.0/9.0));
        al = Math.floor(al);
        anc = Math.floor(anc);
        System.out.println(anc + " píxeles de ancho " + al + " píxeles de alto");

    }
}
