package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        int i;          // si la primera letra va en minuscula es una variable
//        Integer i1;    //si la primera letra va con mayuscula es un objeto
//        String s= "patata"; //objeto
//
//        //s.indexOf() metodo
//        String s2 = s + "patata"; //operador
//
//
//        List<Integer> lista = new ArrayList<>();// new es un constructor, para inicializar
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("a"); // ejemplo de poliformismo
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> listax = new LinkedList<>(); //linked y arraylist , herencia de list

        Coche c = new Coche(); //con el constructor vacio
        c.setMatricula("8743KGB");
        c.marca="seat";
        c.modelo="panda";     // sin iniciador
//        c-cilindrada=999;
        c.setPrecio(1000);
        c.nuevo=false;

        Coche c2= new Coche("2222xs", "audi", "a4", 2499,1000,false);
        //con constructor que nosotros hicimos
        c2.setPrecio(100);
//        System.out.println(c2.matricula);
        System.out.println("Rebajado -20% = " + c2.rebaja(20)+"€");
        System.out.println(c2.toString());

        //uso de clases

        List<Coche> lista= new ArrayList<>();





    }
}
