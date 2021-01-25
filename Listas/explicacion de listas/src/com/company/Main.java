package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //las listas son parecidas a los arrays pero tienen el tamaño de lo que haya dentro( y variable)
        //Definicion de variable
        List<Integer> li;

        //creamos la lista (Se usa una de las dos)
        li= new ArrayList<>();   //más rapida para recorrer la lista
        li= new LinkedList<>();  //más rapida para añadir o insertar elementos

        //añadir elementos aa una lsita
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
              //ahora ocn un for
        int i;
        for(i=4; i<=6; i++)
        {
            li.add(i);
        }
        //sumarle uno a cada posicion

        for(i=0;i<li.size();i++)
        {
            int valor=li.get(i);//lee el valor de una posición
            li.set(i, valor+1);// modifica el valor de la posición i

                //li.set/(i, li.get(i)+1); //de una sola vez
        }

        //para que no pete el size porque cambia segun gambio mi lista
        while(li.size()>0)
        {
            System.out.println(li.get(0));
            li.remove(0);
        }

        //mas funciones de listas--
        //insertar
        li.add(5);//añade el elemento al final
        li.add(0, 5);//añade un elemento al principio
        //li.add(1, 5);//añade el 5 en la posicion 3, desplaza los demás y peta ni no existe esa posicion

        //borrar por posición (lo recomienda el profe)
        li.remove(0);//borra el primer elemento
        li.remove(li.size()-1);//borra el ultimo elemento
        //li.remove(5);//borra el elemento 5, si no está peta


        //borrar por elemento
        Integer ele=5;
        li.remove(ele); //borra los elementos = 5 (si hay nás de uno quita el primero)
                        //además, devuelve true si está y false sino.
              //si quiero borrarlo todas las veces con un while


        //contains
        //li.cotains(); igualq ue el de cadenas

        //INDEXOD
        //li.indexOf(5); igual que el de cadena, busca y me da la posicion donde está

        //SUBLIST
        //lo.subList(2,6); igual que en cadenas

        //añadir muchos datos a una lista
        List<Integer> l2 =new LinkedList<>(Arrays.asList(1,2,3,4));
        List<Integer> l3 =new LinkedList<>( Arrays.asList(11,12,13,14));
        l2.addAll(l3);
        System.out.println(l2);

        //LE VAMOS APSAR AHORA UN ARRRAY
        Integer[]array ={99,98,97};
        l2.addAll(Arrays.asList(array));
        System.out.println(l2);
//        ahora al reves de lista array
//            arrayfinal= listatemporal.toArray(new Integer[0]);


        //CLEAR
        //li.clear(); -- la deja vacía

        //ISEMPTY
        //if/(li.isEmpty()) // el rpofe usa / !(li.size()>0)

        //Resto de funciones chulas está en collections
        System.out.println("min=" + Collections.min(l2));
        System.out.println("min=" + Collections.max(l2));
        Collections.reverse(l2); //le da la vuelta
        Collections.sort(l2); //ordena
        Collections.shuffle(l2); //desordena

        //insertAll inserta una dentro de otro

    }
}

