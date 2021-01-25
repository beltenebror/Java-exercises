package com.company;

public class Main {

    public static void main(String[] args)
    {
        Dinero dinero1 = new Dinero(1,TipoMoneda.euro);

//        Dinero dinero2 = new Dinero(119.03,TipoMoneda.yen);
        System.out.println(dinero1.convierteEn(TipoMoneda.libra));

//        System.out.println(dinero1.compareTo(dinero2));

//        Dinero.ActualizaListaInternet("USD");


    }
}
