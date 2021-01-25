package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menú");
        System.out.println();
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");


        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
            {
                //Escribe la función ordenaRepetidos, a la que le pasas una lista con números y te la
                //ordena en función del número de veces que se repiten sus elementos, con los
                //números que más se repiten apareciendo en las primeras posiciones y los que menos
                //se repiten (o aparecen una sola vez) apareciendo en las últimas.
                //Ej.: [5, 5, 1, 2, 8, 3, 0, 3, 2, 2, 5, 7, 5] => [5, 5, 5, 5, 2, 2, 2, 3, 3, 1, 8, 0, 7]
                List<Integer> list = new LinkedList<>(Arrays.asList(5, 5, 1, 2, 8, 3, 0, 3, 2, 2, 5, 7, 5));
                System.out.println(list);
                ordenaRepetidos(list);
                System.out.println(list);
                //PRECAUCIonN; PETA Y NO SÉ PORQUÉ
            }
            break;

            case 2:
            {
                //Escribe las funciones elementosUnicos y elementosRepetidos. La función
                //elementosUnicos recibirá una lista y nos devolverá otra lista que contendrá
                //solamente los elementos de la primera que sólo aparecen una vez.
                //Ej.: {1, 1, 2, 3, 99, 1, 99, 5} nos devolvería {2, 3, 5}
                //La función elementosRepetidos hace justo lo contrario: recibirá una lista y nos
                //devuelve otra lista con los elementos que aparecen repetidos en la primera lista.
                //Ej.: {1, 1, 2, 3, 99, 1, 99, 5} nos devolvería {1, 99}
                //Las funciones no deberán modificar la lista que se les pasa por parámetro.
                List<Integer> list = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 99, 1, 99, 5));
                List<Integer> norepetidos = elementosUnicos(list);
                System.out.println(norepetidos);
                List<Integer> repetidos = elementosRepetidos(list);
                System.out.println(repetidos);

            }
            break;

            case 3:
            {
                //Escribe la función listaDominoDobles a la que le pasaremos una lista de enteros que
                //representará fichas de dominó. La representación será la siguiente: cada pareja de
                //enteros se corresponderá con una ficha, estando cada valor comprendido entre 0 y 6.
                //Ej.: Estas tres fichas se representarían
                //como la lista:
                //< 6, 2, 0, 3, 6, 4 >
                //La función nos devolverá una lista de enteros en la que aparecerán las fichas dobles (las
                //que tienen los dos valores iguales) que aparezcan en la lista que le pasamos.
                //Ej.: Si le pasamos < 1, 1, 2, 6, 0, 0, 5, 4 > nos devolvería < 1, 1, 0, 0 >
                List<Integer> lista= new LinkedList<>(Arrays.asList(1, 1, 2, 6, 0, 0, 5, 4,6,6,6,5,5,3));
                System.out.println(lista);
                List<Integer> dobles= listaDominoDobles(lista);
                System.out.println(dobles);
            }
            break;

            case 4:
            {
                //Escribe la función palabrasMismaLetra a la que le pasamos una cadena y nos devolverá
                //una lista de cadenas que contendrá las palabras que empiezan y acaban por la misma
                //letra. A la hora de contar las palabras, habrá que ignorar los símbolos de puntuación y
                //las mayúsculas y minúsculas.
                //Ej.: “Amanda tiene tres serpientes” devolvería {amanda, serpientes}
                String cadena=" Amanda tiene tres serpientes ";
                List<String> palabrasbien= palabrasMismaLetra(cadena);
                System.out.println(palabrasbien);
                //para dejarlo perfecta deberia usar la funcion que tenemos de quitar todo los espacios de más, pero no la tengo a mano.
            }
            break;

            case 5:
            {
                //Escribe la función listaPalabrasLargas, a la que le pasamos una cadena que contiene
                //palabras separadas por espacios y un entero en el que le indicamos la longitud mínima
                //de una palabra y nos devuelve una lista de cadenas que contendrá solamente las
                //palabras que tienen una longitud igual o mayor a la mínima.
                //Ej.: “Mi mamá me mima” (longitud = 4) devolvería {mamá, mima}
                String cadena="1 22 333 4444 55555";
                List<String> mayor=listaPalabrasLargas(cadena);
                System.out.println(mayor);
            }
            break;

            default:
                {

                System.out.println("Ese ejercicio no existe");
            }
        }
    }

    //Escribe la función listaPalabrasLargas, a la que le pasamos una cadena que contiene
    //palabras separadas por espacios y un entero en el que le indicamos la longitud mínima
    //de una palabra y nos devuelve una lista de cadenas que contendrá solamente las
    //palabras que tienen una longitud igual o mayor a la mínima.
    //Ej.: “Mi mamá me mima” (longitud = 4) devolvería {mamá, mima}
    public static List<String> listaPalabrasLargas(String cadena)
    {
        List<String> palabrasbien= new LinkedList<>();
        cadena=cadena.toLowerCase();
        cadena=cadena.trim();
        String [] palabras= cadena.split(" ");
        String temporal;
        int letrasmax=0;
        for(int i=0;i<palabras.length;i++)
        {
            temporal=palabras[i];
            if(temporal.length()>letrasmax)
            {
                letrasmax=temporal.length();
            }
        }
        for(int i=0;i<palabras.length;i++)
        {
            temporal=palabras[i];
            if(temporal.length()==letrasmax)
            {
                palabrasbien.add(temporal);
            }
        }
        return palabrasbien;


    }


    public static List<String> palabrasMismaLetra(String cadena)
    {
        List<String> palabrasbien= new LinkedList<>();
        cadena=cadena.toLowerCase();
        cadena=cadena.trim();
        String[] palabras= cadena.split(" ");
        for(int i=0;i<palabras.length;i++)
        {
            char[] temporal=palabras[i].toCharArray();
            if(temporal[0]==temporal[temporal.length-1])
            {
                palabrasbien.add(palabras[i]);
            }

        }
        return palabrasbien;


    }


    public static List<Integer> listaDominoDobles(List<Integer> lista)
    {
        List<Integer> dobles= new LinkedList<>();
        int error=0;
        int i;
        if(lista.size()%2!=0)
        {
            error=1;
        }
        else
        {
            for(i=0;i<lista.size();i++)
            {
                if(lista.get(i)>6)
                {
                    error=1;
                    i=lista.size();
                }
            }
        }
        if(error==0)
        {
            for(i=0;i<lista.size()-1;i=i+2)
            {
                if(lista.get(i)==lista.get(i+1))
                {
                    dobles.add(lista.get(i));
                    dobles.add(lista.get(i));
                }
            }
        }
        return dobles;

    }

    public static List<Integer> elementosRepetidos(List<Integer> list)
    {
        List<Integer> listcopia = new LinkedList<>(list);
        int i, j, temporalposicion, temporal;
        List<Integer> listabien = new LinkedList<>();

        for (i = 0; i < listcopia.size() - 1; i++) {
            for (j = i + 1; j < listcopia.size(); j++) {
                if (listcopia.get(i) == listcopia.get(j)) {
                    temporal = listcopia.get(i);
                    temporalposicion = listcopia.indexOf(temporal);
                    listabien.add(temporal);
                    while (temporalposicion != -1) {
                        listcopia.remove(temporalposicion);
                        temporalposicion = listcopia.indexOf(temporal);
                    }
                    j = listcopia.size();
                    i = i - 1;
                }
            }
        }


        return listabien;

    }

    public static List<Integer> elementosUnicos(List<Integer> list)
    {
        List<Integer> listcopia = new LinkedList<>(list);
        int i, j, temporalposicion, temporal;

        for (i = 0; i < listcopia.size() - 1; i++) {
            for (j = i + 1; j < listcopia.size(); j++) {
                if (listcopia.get(i) == listcopia.get(j)) {
                    temporal = listcopia.get(i);
                    temporalposicion = listcopia.indexOf(temporal);
                    while (temporalposicion != -1) {
                        listcopia.remove(temporalposicion);
                        temporalposicion = listcopia.indexOf(temporal);
                    }
                    j = listcopia.size();
                    i = i - 1;
                }
            }
        }


        return listcopia;

    }

    public static void ordenaRepetidos(List<Integer> list)
    {
        int i,j;
        int num;
        int temporal;

        for(i=0;i<list.size();i++) //ordeno los repetidos pero sin tener en ceunta las veces
        {
            num=list.get(i);
            for(j=i+1;j<list.size();j++)
            {
                if(num==list.get(j))
                {
                    temporal=list.get(j);
                    list.remove(j);
                    list.add(i,temporal);
                }
            }
        }
        System.out.println(list);
        List<Integer> temporallist = new LinkedList<>(list);
        while(list.size()!=0) //vacío la lista que tenia al principio, y la llevo a una lista temporal
        {
            list.remove(0);
        }
        System.out.println(list);
        System.out.println(temporallist);

        int max,actual,rep,repmax,todelete=0;

        //Aqui intento ver cuandas veces se repite, y luego copio ese que más se repite en la otra... no funciona
        while(temporallist.size()>0)
        {
            max=temporallist.get(0);
            actual=temporallist.get(0);
            rep=1;
            repmax=1;
            for (i=1;i<temporallist.size();i++)
            {
                if(temporallist.get(i)==actual)
                {
                    rep=rep+1;
                    if(rep>repmax)
                    {
                        repmax=rep;
                        max=temporallist.get(i);   // la idea es quedarme con el numero que más se repite, y las veces que se repite
                    }
                }
                else
                {
                    actual=temporallist.get(i);
                    rep=1;
                }
            }

            for(i=0;i<repmax;i++) //Este bucle se repite infinitamente
            {
                list.add(max);
                if(temporallist.indexOf(max)>=0)
                {
                    todelete = temporallist.indexOf(max);
                    temporallist.remove(todelete);
                }
            }
        }


    }
















}
