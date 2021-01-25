package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
//        List<Integer> lista = new LinkedList<>();
//        // Linked es una subclase de List
//        Vehiculo v = new Vehiculo();
//        v.matricula= "vehiculo";

        Moto m = new Moto();
        m.matricula = "moto";
        m.tieneSidecar=true;

        Vehiculo c = new Coche();
        c.matricula ="coche";

        List<Vehiculo> lista = new ArrayList<>();
//        lista.add(v);
        lista.add(m);
        lista.add(c);
        for(int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
            if(lista.get(i).getClass() == Moto.class) //lista.get(i) instanceof Moto
            {
                Moto mo = (Moto)lista.get(i);
                System.out.println("tiene sidecar = " + mo.tieneSidecar);
            }
        }




        //FECHAS
//        LocalDate d = new LocalDate(2020, 03, 10);
        LocalDate d = LocalDate.of(2020, 3, 10); //no poner 0
        d =d.plusDays(5);
        System.out.println(d.toString());

        String fechaBonita = d.format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
        System.out.println(fechaBonita);






    }
}
