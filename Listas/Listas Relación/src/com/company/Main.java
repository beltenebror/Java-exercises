package com.company;

import java.util.*;

public class Main
{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int opcion;

        System.out.println("Menú");
        System.out.println();
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");


        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe la función leeLista que va leyendo enteros desde el teclado y los va metiendo en una lista.
                // La función ira leyendo valores hasta que escribamos un -1. La lista la pasamos por parámetro.
                //Ejemplo de uso:
                //List<Integer> l = new ArrayList<>();
                //leeLista(l);
                List<Integer> a = new LinkedList<>();
                leeLista(a);
                System.out.println(a);


            }
            break;

            case 2:
            {
                //Escribe la función leeListaN que lee desde el teclado el número de enteros que le digamos.
                // Para ello, le pasaremos dos parámetros: la lista y un entero.
                //Ejemplo de uso:
                //List<Integer> l = new ArrayList<>();
                //leeListaN(l, 10);
                List<Integer> a = new LinkedList<>();
                int tamaño=10;
                leeListaN(a, tamaño);
                System.out.println(a);


            }
            break;

            case 3:
            {
                //Escribe la función escribeLista a la que le pasas una lista y te escribe su contenido por pantalla.
                // Para diferenciarla de los arrays, usaremos angulos para delimitarla.
                   // Ej.: <5, 6, 8, 19>
                List<Integer> a= new LinkedList<>(Arrays.asList(1,2,3,4,5));
                escribeLista(a);

            }
            break;

            case 4:
            {
                //Escribe la función eliminaNegativos que elimine todos los números negativos de una lista de enteros.
                List<Integer> a= new LinkedList<>(Arrays.asList(1,2,-4,-9,3,4,5));
                eliminaNegativos(a);
                System.out.println(a);
            }
            break;

            case 5:
            {
                //Escribe la función clasificaNumeros a la que le pasamos tres listas. La primera contiene un montón de
                // números positivos y negativos. Habrá que copiar los positivos en la primera lista y los negativos en
                // la segunda lista, y después ordenar las dos listas.
                List<Integer> a = new LinkedList<>(Arrays.asList(1,-1,2,-2,3,-3,4,-4,5,-5));
                System.out.println(a);
                List<Integer> positivos= new LinkedList<>();
                List<Integer> negativos= new LinkedList<>();
                clasificaNumeros(a,positivos,negativos);
                System.out.println(positivos);
                System.out.println(negativos);

            }
            break;

            case 6:
            {
                //Escribe la función eliminaRepetidos a la que le pasas una lista y te elimina los elementos repetidos,
                // dejando sólo uno de cada (ej.: <1,2,3,1> = <1,2,3>). La forma más fácil es ir copiando de una lista a
                // otra sólo los elementos que no estén ya introducidos (p.ej., usando contains).
                List<Integer> a = new LinkedList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,4,5,5,6,7,7,8,8,9,9,9,9,9));
                eliminaRepetidos(a);
                escribeLista(a);

            }
            break;

            case 7:
            {
                //Escribe la función ordenaListaSeleccion a la que le pasas una lista de enteros desordenada y te la ordena mediante el algoritmo de selección.
                //La ordenación por selección funciona de la siguiente forma:
                //- Buscamos el elemento más pequeño de nuestra lista.
                //- Lo metemos en otra lista resultado.
                //- Lo eliminamos de nuestra lista.
                //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan pasado a la lista resultado en orden.

                List<Integer> a = new LinkedList<>(Arrays.asList(9,-1,5,-3,1,7,3,2,1));
                escribeLista(a);
                List<Integer> ordenada = new LinkedList<>();
                ordenada = ordenaListaSeleccion(a);
                escribeLista(a);
                escribeLista(ordenada);

            }
            break;

            case 8:
            {
                //Escribe la función ordenaListaInsercion a la que le pasas una lista de enteros desordenada y te la ordena mediante el algoritmo de inserción.
                //La ordenación por inserción funciona de la siguiente forma:
                //- Cogemos cada elemento en orden de nuestra lista.
                //- A la hora de meterlo en la lista resultado lo metemos de manera que la lista resultado se quede ordenada. Para ello,
                // vamos pasando por la lista resultado hasta que encontremos un valor mayor e insertamos nuestro número delante.
                //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan pasado a la lista resultado en orden.
                List<Integer> a = new LinkedList<>(Arrays.asList(9,-1,5,-3,1,7,3,2));
                List<Integer> ordenada = new LinkedList<>();
                ordenada = ordenaListaInsercion(a);
                escribeLista(a);
                escribeLista(ordenada);
            }
            break;

            case 9:
            {
                //Escribe la función ordenaListaPalabras a la que le pasas una lista de cadenas que contiene palabras y te las ordena alfabéticamente.
                List<String> a = new LinkedList<>(Arrays.asList("Dani","agustina","celia","Belen","agustina"));
                System.out.println(a);
                List<String> ordenada = new LinkedList<>();
                ordenada = ordenaListaPalabras(a);
                System.out.println(ordenada);


            }
            break;

            case 10:
            {
                //Escribe la función ordenaListaPalabras2 a la que le pasas una lista de cadenas que contiene palabras y te las ordena por tamaño (la más pequeña el principio).
                List<String> a = new LinkedList<>(Arrays.asList("ccc","ddd","bb","a"));
                System.out.println(a);
                List<String> ordenada = new LinkedList<>();
                ordenada = ordenaListaPalabras2(a);
                System.out.println(ordenada);
            }
            break;

            case 11:
            {
                //Escribe la función insertaArrayEnArrayPro a la que le pasamos tres parámetros: un array de enteros, una posición en ese array y otro array de enteros.
                // La función insertará en el primer array, a partir de la posición indicada, todo el contenido del segundo array, y nos devolverá otro array con el resultado.
                //  Para ello, usaremos una lista como paso intermedio: copiamos el array a la lista, realizamos la inserción en la lista y luego convertiremos la lista en un array y lo devolveremos.
                Integer[] array1={1,2,3,4,9};
                Integer[] array2={5,6,7,8};
                int posicion=4;
                Integer[]arrayresultado;
                arrayresultado = insertaArrayEnArrayPro(array1, array2, posicion);
                System.out.println(Arrays.toString(arrayresultado));

            }
            break;

            case 12:
            {
                //Escribe la función sorteoBonoloto que nos da los 6 números que van a tocar en el próximo sorteo. Para ello, meteremos en una lista los 49 números,
                // elegiremos una posición al azar, guardaremos el número en otra lista y lo eliminaremos de la primera (para que no pueda volver a salir).
                // Al terminar de sortear los 6 números, devolveremos una lista que contenga el resultado.
                List<Integer> sorteo = sorteoBonoloto();
                System.out.println(sorteo);


            }
            break;

            case 13:
            {
                //Escribe la función eliminaRepetidos2 a la que le pasamos un array (en el que puede que aparezcan elementos repetidos) y nos
                // devuelve otro array en el que no hay repetidos. Podemos usar listas para que sea más sencillo.
                Integer[] a={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7};
                Integer[] sinrepetir=eliminaRepetidos2(a);
                System.out.println(Arrays.toString(sinrepetir));

            }
            break;

            case 14:
            {
                //Escribe la función unionListas a la que le pasas dos listas (que representan conjuntos) y que te devuelve otra lista
                // que representará la unión de ambos conjuntos. Esto es, los elementos que estén o en la primera lista o en la segunda
                // (si están en las dos, sólo hay que meterlos una vez).
                List<Integer> conjunto1= new LinkedList<>(Arrays.asList(1,3,5,7,9,4));
                List<Integer> conjunto2= new LinkedList<>(Arrays.asList(1,1,2,4,6,8,9));
                List<Integer> listasunidas=unionListas(conjunto1,conjunto2);
                System.out.println(listasunidas);

            }
            break;

            case 15:
            {
                //Escribe la función interseccionListas a la que le pasas dos listas (que representan conjuntos) y que te devuelve otra lista
                // que representará la intersección de ambos conjuntos. Esto es, los elementos que estén tanto en la primera lista como en la segunda.
                List<Integer> conjunto1= new LinkedList<>(Arrays.asList(1,3,5,7,9,4)); //1,4,9
                List<Integer> conjunto2= new LinkedList<>(Arrays.asList(1,1,2,4,6,8,9));
                List<Integer> listainsercion=interseccionListas(conjunto1,conjunto2);
                System.out.println(listainsercion);

            }
            break;

            case 16:
            {
                //Escribe la función desordenaLista a la que le pasas una lista y te la desordena. Para ello, iremos cogiendo al azar elementos de la lista y
                // poniéndolos en otra lista (quitándolos de la primera). La segunda lista, contendrá los elementos al azar.
                List<Integer> a= new LinkedList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
                List<Integer> ordenada = desordenalista(a);
                System.out.println(ordenada);


            }
            break;

            case 17:
            {
                //Escribe la función modaLista que nos devuelva la moda (el valor que más veces se repite) de una lista de enteros
                List<Integer> a= new LinkedList<>(Arrays.asList(1,1,1,2,2,3,4,5,6,7,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0,0,0,4,4,4,4,3,3,3,4,4,4,4,5,5,5,6,6,6,6,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
                System.out.println(modaLista(a));

            }
            break;

            case 18:
            {
                //Escribe la función puntuacionesTrampolin. La función recibirá una lista con siete números reales que se corresponderán a las
                // notas obtenidas por un saltador de trampolín de 3 metros. En este deporte, para calcular la nota final, se eliminan las dos
                // notas más altas y las dos más bajas, sumándose las tres que quedan. Por tanto, nuestra función eliminará los dos valores más
                // altos y los dos más bajos del la lista y, además, devolverá un real que será la suma de los tres valores que quedan
                List<Double> a= new LinkedList<>(Arrays.asList(0.1,0.2,2.0,3.0,6.0,4.0,7.1));
                System.out.println(puntuacionesTrampolin(a));

            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }
    }

    public static double puntuacionesTrampolin(List<Double> a)
    {
        double min;
        int i;
        int posmin;

        double max;
        int posmax;

        double puntuacion=0;

        for(int j=0;j<2;j++)
        {
            min=a.get(0);
            posmin=0;
            max=a.get(0);
            posmax=0;
            for (i = 0; i < a.size(); i++)
            {
                if (a.get(i) < min)
                {
                    min = a.get(i);
                    posmin = i;
                }
            }
            a.remove(posmin);
            for (i = 0; i < a.size(); i++)
            {
                if (a.get(i) > max)
                {
                    max = a.get(i);
                    posmax = i;
                }
            }
            a.remove(posmax);
        }
        for(i=0;i<a.size();i++)
        {
            puntuacion=puntuacion+a.get(i);
        }
        return puntuacion;


    }

    public static int modaLista(List<Integer> a)
    {
        int contmax=0;
        int cont=1;

        List<Integer> numeros = new LinkedList<>(a);
        Collections.sort(numeros);
        int num=numeros.get(0);
        int nummax=numeros.get(0);

        for(int i=1;i<numeros.size();i++)
        {
            if(numeros.get(i)==num)
            {
                cont=cont+1;
            }
            else
            {
                cont=1;
                num=numeros.get(i);
            }
            if(contmax<cont)
            {
                contmax=cont;
                nummax=num;
            }
        }
        return nummax;
    }

    public static List<Integer> desordenalista(List<Integer> a)
    {
        int temporal;
        List<Integer> desorden= new LinkedList<>();
        Random r= new Random();
        while(a.size()>0)
        {
            temporal=r.nextInt(a.size());
            desorden.add(a.get(temporal));
            a.remove(temporal);
        }
        return  desorden;
    }

    public static List<Integer> interseccionListas(List<Integer> conjunto1, List<Integer> conjunto2)
    {
        List<Integer> repetidos = new LinkedList<>();
        int j=0;
        int k=0;
        int ya=0;
        for(int i=0; i<conjunto1.size();i++)
        {
            ya=0;
            for( j=0; j<conjunto2.size();j++)
            {
                if(conjunto1.get(i)==conjunto2.get(j))
                {
                    if(repetidos.size()==0)
                    {
                        repetidos.add(conjunto1.get(i));
                    }
                    else
                    {
                        for(k=0;k<repetidos.size();k++)
                        {
                            if(conjunto1.get(i)==repetidos.get(k))
                            {
                                ya=1;
                                k=repetidos.size();
                            }
                        }
                        if (ya==0)
                        {
                            repetidos.add(conjunto1.get(i));
                        }
                    }
                }
            }
        }





        return repetidos;

    }

    public static List<Integer> unionListas(List<Integer> conjunto1, List<Integer> conjunto2)
    {
        int j;
        int contador;
        List<Integer> unido = new LinkedList<>();

        for(int i=0; i<conjunto1.size();i++ )
        {
            contador=0;
            for(j=0; j<unido.size();j++ )
            {
                if(conjunto1.get(i)==unido.get(j))
                {
                    contador=contador+1;
                }
            }
            if (contador<1)
            {
                unido.add(conjunto1.get(i));
            }
        }
        for(int i=0; i<conjunto2.size();i++ )
        {
            contador=0;
            for(j=0; j<unido.size();j++ )
            {
                if(conjunto2.get(i)==unido.get(j))
                {
                    contador=contador+1;
                }
            }
            if (contador<1)
            {
                unido.add(conjunto2.get(i));
            }
        }
        return unido;
    }

    public static Integer[] eliminaRepetidos2(Integer[] a)
    {
        Integer[] arrayfinal;
        List<Integer> listatemporal= new LinkedList<>();
        listatemporal.addAll(Arrays.asList(a));
        eliminaRepetidos(listatemporal);
        arrayfinal= listatemporal.toArray(new Integer[0]);
        return arrayfinal;

    }

    public static List<Integer> sorteoBonoloto()
    {
        int i;
        int posicion;
        Random r= new Random();
        List<Integer> numeros = new LinkedList<>();
        List<Integer> premio = new LinkedList<>();
        for(i=1;i<50;i++)
        {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        for( i=0 ; i<6;i++ )
        {
            posicion=r.nextInt(numeros.size());
            premio.add(numeros.get(posicion));
            numeros.remove(posicion);

        }
        return premio;


    }

    public static Integer[] insertaArrayEnArrayPro(Integer[] array1, Integer[] array2, int posicion)
    {
        int i;
        List<Integer> listatemporal= new LinkedList<>();
        Integer[] arrayfinal;


        listatemporal.addAll(Arrays.asList(array1));

        for(i=array2.length-1;i>0;i--)
        {
            listatemporal.add(posicion,array2[i]);
        }

        arrayfinal= listatemporal.toArray(new Integer[0]);
        return arrayfinal;

    }

    public static void escribeArray(int[] a)
    {
        if(a.length==0)
        {
            System.out.println("[]");
        }
        else
        {
            System.out.print("[");

            for(int i=0;i<(a.length-1);i++)
            {
                System.out.print(a[i]+", ");
            }

            System.out.print(a[a.length-1]+"]");
        }

    }

    public static void leeLista(List<Integer> a)
    {
        Integer valor;
        System.out.println("Número a añadir (-1 para parar)");
        valor=sc.nextInt();

        while(valor!=-1)
        {
            a.add(valor);
            System.out.println("otro");
            valor=sc.nextInt();
        }

    }

    public static void leeListaN(List<Integer> a, int tamaño)
    {
        int valor;
        for(int i=0; i<tamaño;i++)
        {
            System.out.println("valor a añadir");
            valor=sc.nextInt();
            a.add(valor);

        }
    }

    public static void escribeLista(List<Integer> a)
    {
        System.out.print("<");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i));
            if(i<a.size()-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }

    public static void eliminaNegativos(List<Integer> a)
    {
        int valor;
        for(int i=0;i<a.size();i++)
        {
            valor = a.get(i);
            if(valor<0)
            {
                a.remove(i);
                i=i-1;
            }
        }
    }

    public static void clasificaNumeros(List<Integer> a,List<Integer> positivos,List<Integer> negativos)
    {
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>0)
            {
                positivos.add(a.get(i));
            }
            else
            {
                if(a.get(i)<0)
                {
                    negativos.add(a.get(i));
                }
            }
        }
    }

    public static void eliminaRepetidos(List<Integer> a)
    {
        int j;
        int contador;
        for(int i=0; i<a.size();i++ )
        {
            contador=0;
            for(j=0; j<a.size();j++ )
            {
                if(a.get(i)==a.get(j))
                {
                    contador=contador+1;
                }
            }
            if (contador>1)
            {
                a.remove(i);
                i=i-1;
            }
        }
    }

    public static List<Integer> ordenaListaSeleccion(List<Integer> a)
    {
        List<Integer> ordenada = new LinkedList<>();
        int min;
        int posicionmin;
        int i;
        while(a.size()!=0)
        {
            min = a.get(0);
            posicionmin=0;
            for (i = 0; i < a.size(); i++)
            {

                if (min > a.get(i))
                {
                    min = a.get(i);
                    posicionmin=i;
                }
            }
            ordenada.add(min);
            a.remove(posicionmin);

        }
        return ordenada;


    }

    public static List<Integer> ordenaListaInsercion(List<Integer> a)
    {
        int yaañadido;
        List<Integer> orden = new LinkedList<>();
        int i;

        orden.add(a.get(0));
        for (i = 1; i < a.size(); i++)
        {
            yaañadido = 0;
            for (int j = 0; j < orden.size(); j++)
            {
                if (a.get(i) <= orden.get(j))
                {
                    orden.add(j, a.get(i));
                    yaañadido = 1;
                    j = orden.size();
                }
            }
            if (yaañadido == 0)
            {
                orden.add(a.get(i));
            }

        }
        return orden;


    }

    public static List<String> ordenaListaPalabras(List<String> a)
    {
        int i;
        String temporal;
        int yaañadido;
        List<String> orden = new LinkedList<>();
        for(i=0;i<a.size();i++)
        {
            temporal=a.get(i);
            a.remove(i);
            temporal=temporal.toLowerCase();
            a.add(i, temporal);

        }
        System.out.println(a);
        orden.add(a.get(0));
        for (i = 1; i < a.size(); i++)
        {
            yaañadido = 0;
            for (int j = 0; j < orden.size(); j++)
            {
                if (a.get(i).compareTo(orden.get(j)) <=  0)
                {
                    orden.add(j, a.get(i));
                    yaañadido = 1;
                    j = orden.size();
                }
            }
            if (yaañadido == 0)
            {
                orden.add(a.get(i));
            }

        }

        return orden;
    }

    public static List<String> ordenaListaPalabras2(List<String> a)//por tamaño
    {
        int i;
        String temporal;
        String temporala;
        String temporalb;
        int yaañadido;
        List<String> orden = new LinkedList<>();

        orden.add(a.get(0));
        for (i = 1; i < a.size(); i++)
        {
            yaañadido = 0;
            for (int j = 0; j < orden.size(); j++)
            {
                if (a.get(i).length() <= orden.get(j).length())
                {
                    orden.add(j, a.get(i));
                    yaañadido = 1;
                    j = orden.size();
                }
            }
            if (yaañadido == 0)
            {
                orden.add(a.get(i));
            }

        }

        return orden;
    }






}
