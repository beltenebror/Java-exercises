package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main
{

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
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("22. Ejercicio 22");
        System.out.println("23. Ejercicio 23");
        System.out.println("24. Ejercicio 24");
        System.out.println("25. Ejercicio 25");
        System.out.println("26. Ejercicio 26");
        System.out.println("27. Ejercicio 27");
        System.out.println("28. Ejercicio 28");
        System.out.println("29. Ejercicio 29");
        System.out.println("30. Ejercicio 30");
        System.out.println("31. Ejercicio 31");
        System.out.println("32. Ejercicio 32");
        System.out.println("33. Ejercicio 33");
        System.out.println("34. Ejercicio 34");
        System.out.println("35. Ejercicio 35");
        System.out.println("36. Ejercicio 36");
        System.out.println("37. Ejercicio 37");
        System.out.println("38. Ejercicio 38");
        System.out.println("39. Ejercicio 39");
        System.out.println("40. Ejercicio 40");


        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[] a= new int[5];
                a[0]=1;
                a[1]=5;
                a[2]=9;
                a[3]=2;
                a[4]=7;
                escribeArray5(a);
            }
            break;

            case 2:
            {
                int[] a= {1,2,3,4,5,6,7,8,9,10};

                escribeArray(a);
            }
            break;

            case 3:
            {
                int[] a= new int[5];
                leeArray5(a);
                escribeArray(a);
            }
            break;

            case 4:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                escribeArray(a);

            }
            break;

            case 5:
            {
                int[] a= new int[5];
                ponCeros5(a);
                escribeArray(a);
            }
            break;

            case 6:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                ponCeros(a);
                escribeArray(a);
            }
            break;

            case 7:
            {
                int[] a= new int[5];
                leeArray5(a);
                escribeArray(a);
                System.out.println();
                System.out.println(sumaArray5(a));
            }
            break;

            case 8:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                escribeArray(a);
                System.out.println();
                System.out.println(sumaArray(a));
            }
            break;

            case 9:
            {
                int[] a= new int[5];
                leeArray5(a);
                escribeArray(a);
                System.out.println();
                System.out.println(mediaArray5(a));
            }
            break;

            case 10:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                escribeArray(a);
                System.out.println();
                System.out.println(mediaArray(a));
            }
            break;

            case 11:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                rellenaEnOrden(a);
                escribeArray(a);
            }
            break;

            case 12:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
            break;

            case 13:
            {
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                rellenaAleatorio(a);
                escribeArray(a);
            }
            break;

            case 14:
            {
                //Escribe una función “estaOrdenado” a la que le pasas un array de enteros y te devuelve un booleano
                // que será verdadero si los elementos del array se encuentran en orden ascendente.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                System.out.println(estaOrdenado(a));
            }
            break;

            case 15:
            {
                //Escribe una función “numeroImpares” a la que le pasas un array de enteros y te devuelve un entero
                // que corresponde a la cantidad de números impares que tenemos en el array.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                System.out.println(numeroImpares(a));

            }
            break;

            case 16:
            {
                //Escribe una función “minArray” a la que le pasas un array y te devuelve el valor más pequeño de
                // los contenidos en dicho array
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                System.out.println("el mínimo es " + minArray(a));
            }
            break;

            case 17:
            {
                //Escribe una función “maxArray” que te devuelve el más grande.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                System.out.println("el máximo es " + maxArray(a));
            }
            break;

            case 18:
            {
                //Escribe una función “numeroAprobados” a la que se le pasa un array de enteros y, suponiendo que son
                // notas, nos devuelve el número de aprobados (valores entre 5 y 10).
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[] a= new int[tamanno];
                leeArray(a);
                System.out.println("El numero de aprobados es " + numeroAprobados(a));
            }
            break;

            case 19:
            {
                //Escribe una función “porEncimaDe” a la que le pasamos un valor “limite” y nos devuelve cuántos
                // elementos del array son iguales o mayores que ese límite. Por ejemplo, le pasamos el valor 10
                // y nos dice cuántos elementos son 10 o más.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]a=new int[tamanno];
                leeArray(a);
                System.out.println("hay " + porEncimaDe(a) + " números por encima o igual al valor");
            }
            break;

            case 20:
            {
               // Escribe una función “cuantosCeros” a la que le pasamos un array y nos devuelve un entero que nos
                // dice cuántos elementos tienen el valor 0.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]a=new int[tamanno];
                leeArray(a);
                System.out.println("hay " + cuantosCeros(a) + " valores iguales a 0");
            }
            break;

            case 21:
            {
                //Escribe una función “copiaArray” a la que le pasas dos arrays por parámetro (array1 y array2,
                // por ejemplo) del mismo tamaño (se debería comprobar dentro de la función).
                // La función copiara el contenido del primer array al segundo array.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]array1=new int[tamanno];
                int[]array2=new int[tamanno];
                leeArray(array1);
                copiaArray(array1,array2);
                escribeArray(array1);
                escribeArray(array2);
            }
            break;

            case 22:
            {
                //Escribe una función “copiaArrayInvertido” a la que le pasas dos arrays por parámetro y te copia
                // el contenido del primer array al segundo array pero en orden inverso
                // (Ej.: si el primero es [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]array1=new int[tamanno];
                int[]array2=new int[tamanno];
                leeArray(array1);
                copiaArrayInvertido(array1,array2);
                escribeArray(array1);
                escribeArray(array2);
            }
            break;

            case 23:
            {
                //Escribe una función “sumaArrays” a la que le pasamos tres arrays. Los dos primeros contendrán
                // los datos que hay que sumar y en el tercero guardaremos el resultado
                // (Ej.: [1,2,3] + [8, 6, 8] = [9, 8, 11])
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]array1=new int[tamanno];
                int[]array2=new int[tamanno];
                int[]arraysuma=new int[tamanno];
                leeArray(array1);
                leeArray(array2);
                sumaArrays(array1,array2,arraysuma);

                escribeArray(array1);
                System.out.print(" + ");
                escribeArray(array2);
                System.out.print(" = ");
                escribeArray(arraysuma);
            }
            break;

            case 24:
            {
                //Escribe también las funciones “restaArrays”, “multiplicaArrays” y “divideArrays”.
                //Escribe una función “sumaArrays” a la que le pasamos tres arrays. Los dos primeros contendrán
                // los datos que hay que sumar y en el tercero guardaremos el resultado
                // (Ej.: [1,2,3] + [8, 6, 8] = [9, 8, 11])
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]array1=new int[tamanno];
                int[]array2=new int[tamanno];
                int[]arrayresta=new int[tamanno];
                int[]arraymultiplicaos=new int[tamanno];
                int[]arraydividido=new int[tamanno];

                leeArray(array1);
                leeArray(array2);
                restaArrays(array1,array2,arrayresta);
                multiplicaArrays(array1,array2,arraymultiplicaos);
                divideArrays(array1,array2,arraydividido);


                escribeArray(array1);
                System.out.print(" - ");
                escribeArray(array2);
                System.out.print(" = ");
                escribeArray(arrayresta);

                System.out.println();

                escribeArray(array1);
                System.out.print(" * ");
                escribeArray(array2);
                System.out.print(" = ");
                escribeArray(arraymultiplicaos);

                System.out.println();

                escribeArray(array1);
                System.out.print(" / ");
                escribeArray(array2);
                System.out.print(" = ");
                escribeArray(arraydividido);


            }
            break;

            case 25:
            {
                //Escribe una función “invierteArray” a la que le pasamos un array de enteros y modifica su contenido
                // invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]a=new int[tamanno];
                leeArray(a);
                invierteArray(a);
                escribeArray(a);
            }
            break;

            case 26:
            {
                //Escribe una función “comparaArrays” a la que le pasamos dos arrays y nos devuelve un boolean
                // que será verdadero si los dos arrays tienen el mismo tamaño y contienen los mismos datos.
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                int[]a=new int[tamanno];
                int[]b=new int[tamanno];
                leeArray(a);
                leeArray(b);
                System.out.println(comparaArrays(a,b));

            }
            break;

            case 27:
            {
                //Escribe una función “ponNotasArray” a la que le pasamos dos arrays del mismo tamaño. El primero
                // será un array de reales (double) y contendrá las notas de los alumnos. El segundo será un array de
                // booleanos en el que deberemos escribir en cada posición “true” si la nota es mayor o igual
                // que 5 (aprobado) y “false” en caso contrario
                System.out.println("dime el tamaño");
                int tamanno=sc.nextInt();
                double notas[]=new double[tamanno];
                leeArrayDouble(notas);
                boolean[] aprobado=new boolean[tamanno];

                ponNotasArray(notas,aprobado);

                escribeArrayDouble(notas);
                escribeArrayBoolean(aprobado);

            }
            break;

            case 28:
            {
                //Escribe una función “concatenaArrays55” a la que le pasamos tres arrays de enteros. Los dos primeros
                // tendrán un tamaño de 5 y contendrán los datos que hay que copiar. El tercero tendrá un tamaño de 10
                // y en él copiaremos los datos del primer array y después los datos del segundo
                // (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).
                int[]a=new int[5];
                leeArray(a);
                int[]b=new int[5];
                leeArray(b);
                int[]c=new int[10];

                concatenaArrays55(a,b,c);
                escribeArray(c);
            }
            break;

            case 29:
            {
                //Escribe una función “concatenaArrays” a la que pasamos tres arrays con la condición de que el tamaño
                //del tercero sea igual a la suma del tamaño de los dos primeros. Hará lo mismo que la función anterior.
                System.out.println("dime el tamaño de a");
                int tamannoA=sc.nextInt();
                int[]a=new int[tamannoA];
                leeArray(a);
                System.out.println("dime el tamaño de b");
                int tamannoB=sc.nextInt();
                int[]b=new int[tamannoB];
                leeArray(b);
                int[]c=new int[a.length+b.length];

                concatenaArrays(a,b,c);
                escribeArray(c);
            }
            break;

            case 30:
            {
                //Escribe una función “contiene” a la que le pasamos un array y un valor entero. La función nos
                // devolverá “true” si el array contiene el número y “false” si no lo contiene.
                System.out.println("dime el tamaño de a");
                int tamanno=sc.nextInt();
                int[]a=new int[tamanno];
                leeArray(a);
                System.out.println("valor que quieres comprobar que tienes");
                int valor=sc.nextInt();
                System.out.println(contiene(a,valor));
            }
            break;

            case 31:
            {
                //Escribe una función “concatenaArraysPro” a la que le pasas dos arrays de enteros y te devuelve
                // un array cuyo tamaño es la suma del tamaño de ambos y que contiene todos los elementos del primero
                // y a continuación los del segundo. Esta función devolverá un array de enteros (int[]) el cuál se
                // creará dentro de la propia función.
                System.out.println("dime el tamaño de a");
                int tamannoA=sc.nextInt();
                int[]a=new int[tamannoA];
                leeArray(a);
                System.out.println("dime el tamaño de b");
                int tamannoB=sc.nextInt();
                int[]b=new int[tamannoB];
                leeArray(b);
                int[]c=concatenaArraysPro(a,b);
                escribeArray(c);


            }
            break;

            case 32:
            {
                //Escribe una función “copiaArrayPro” a la que le pasas un array y te devuelve un array del mismo
                // tamaño y con los mismos datos.
                System.out.println("dime el tamaño de a");
                int tamannoA=sc.nextInt();
                int[]a=new int[tamannoA];
                leeArray(a);
                int[]b=copiaArrayPro(a);
                escribeArray(b);
            }
            break;

            case 33:
            {
                //Escribe una función “insertaEnArray” a la que le pasas tres parámetros: un array de enteros,
                // un valor entero y una posición. La función insertará el valor en la posición indicada, desplazando
                // el resto de valores para hacerle hueco. La función nos devolverá un array con el resultado.
                // Ej.: Si tenemos el array [1,2,3,4,5] y queremos insertar el valor “26” en la posición “2”,
                // el resultado será: [1,2,26,3,4,5].
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("que valor quieres añadir");
                int nuevovalor=sc.nextInt();
                System.out.println("en que posicion quieres añadir");
                int posicionnuevovalor=sc.nextInt();
                a=insertaEnArray(a,nuevovalor,posicionnuevovalor);
                escribeArray(a);


            }
            break;

            case 34:
            {
                //Escribe una función “borraDeArray” a la que le pasas dos parámetros: un array de enteros y una
                // posición. La función eliminará el elemento colocado en la posición indicada. La función nos
                // devolverá un array con el resultado. Ej.: Si tenemos el array [5,7,2,8,1] y queremos eliminar
                // la posición 1, el resultado será: [5,2,8,1].
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("que posicion quieres eliminar");
                int posicion=sc.nextInt();
                a=borraDeArray(a,posicion);
                escribeArray(a);
            }
            break;

            case 35:
            {
                //Escribe una función “elimina1ElementoArray” a la que le pasas dos parámetros: un array de enteros
                // y un valor entero. La función eliminará del array el valor entero independientemente de la posición
                // en la que se encuentre. Si el valor se repite, se eliminará sólo la primera vez que aparece el valor.
                // La función nos devolverá un array con el resultado.
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("que valor quieres eliminar ");
                int valor=sc.nextInt();
                a=elimina1ElementoArray(a,valor);
                escribeArray(a);
            }
            break;

            case 36:
            {
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("que valor quieres eliminar");
                int valor=sc.nextInt();
                a=eliminaElementosArray(a,valor);
                escribeArray(a);
            }
            break;

            case 37:
            {
                //Escribe una función “insertaArrayEnArray” a la que le pasas tres parámetros: un array
                //de enteros, una posición de ese array, y otro array de enteros. La función insertará en
                //el primer array, a partir de la posición indicada, toodo el contenido del segundo array.
                //La función nos devolverá un array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar:
                //[12, 13], resultado = [6, 2, 12, 13, 1, 3].
                System.out.println("dime el tamaño de a");
                int tamañoA=sc.nextInt();
                int[]a=new int[tamañoA];
                leeArray(a);
                System.out.println("que posicion quieres insertar el otro array");
                int posicion=sc.nextInt();
                System.out.println("dime el tamaño de b");
                int tamañoB=sc.nextInt();
                int[]b=new int[tamañoB];
                leeArray(b);
                int[]c=insertaArrayEnArray(a,b,posicion);
                escribeArray(a);
                escribeArray(b);
                escribeArray(c);


            }
            break;

            case 38:
            {
//                Escribe una función “subArray” a la que le pasas un array y dos posiciones. La función
//                te devuelve otro array que contiene los datos comprendidos entre ambas posiciones
//                (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("posicion1");
                int posicion1=sc.nextInt();
                System.out.println("posicion2");
                int posicion2=sc.nextInt();
                int[]b=subArray(a,posicion1,posicion2);
                escribeArray(b);
            }
            break;

            case 39:
            {
//                Escribe una función “recortaArray” a la que le pasas un array y dos posiciones. La
//                función te devuelve otro array que contiene los todos los datos menos los
//                comprendidos entre ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9],
//                posiciones, 1 y 3, resultado = [3, 9].
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                System.out.println("posicion1");
                int posicion1=sc.nextInt();
                System.out.println("posicion2");
                int posicion2=sc.nextInt();
                int[]b=recortaArray(a,posicion1,posicion2);
                escribeArray(b);

            }
            break;

            case 40:
            {
                System.out.println("dime el tamaño de a");
                int tamaño=sc.nextInt();
                int[]a=new int[tamaño];
                leeArray(a);
                escribeArray(a);
                ordenaBurbuja(a);
                escribeArray(a);
            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }

    }
    public static void leeArrayDouble(double[] a)
    {
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i<a.length;i++)
        {
            System.out.println("valor " + i);
            a[i]=sc.nextDouble();
        }
    }

    public static void escribeArrayDouble(double[] a)
    {
        System.out.print("[");

        for(int i=0;i<(a.length-1);i++)
        {
            System.out.print(a[i]+", ");
        }

        System.out.print(a[a.length-1]+"]");
    }

    public static void escribeArrayBoolean(boolean[] a)
    {
        System.out.print("[");

        for(int i=0;i<(a.length-1);i++)
        {
            System.out.print(a[i]+", ");
        }

        System.out.print(a[a.length-1]+"]");
    }

    public static void escribeArray5(int[] a)
    {

        System.out.print("[");

        for(int i=0;i<4;i++)
        {
            System.out.print(a[i]+", ");
        }

        System.out.print(a[4]+"]");
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

    public static void leeArray5(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("valor 0");
        a[0]=sc.nextInt();
        System.out.println("valor 1");
        a[1]=sc.nextInt();
        System.out.println("valor 2");
        a[2]=sc.nextInt();
        System.out.println("valor 3");
        a[3]=sc.nextInt();
        System.out.println("valor 4");
        a[4]=sc.nextInt();
    }

    public static void leeArray(int[] a)
    {
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i<a.length;i++)
        {
            System.out.println("valor " + i);
            a[i]=sc.nextInt();
        }
    }

    public static void ponCeros5(int[] a)
    {
        for(int i= 0; i<5;i++)
        {
            a[i]=0;
        }
    }

    public static void ponCeros(int[] a)
    {
        for(int i= 0; i<a.length;i++)
        {
            a[i]=0;

        }
    }

    public static int sumaArray5(int[] a)
    {
        int suma = 0;
        for(int i= 0; i<5;i++)
        {
            suma=suma + a[i];
        }
        return suma;
    }

    public static int sumaArray(int[] a)
    {
        int suma = 0;
        for(int i= 0; i<a.length;i++)
        {
            suma=suma + a[i];
        }
        return suma;
    }

    public static int mediaArray5(int[] a)
    {
        int suma= 0;
        for(int i= 0; i<5;i++)
        {
            suma=suma + a[i];
        }
        int media;
        media=suma/5;
        return media;
    }

    public static int mediaArray(int[] a)
    {
        int suma= 0;
        for(int i= 0; i<a.length;i++)
        {
            suma=suma + a[i];
        }
        int media;
        media=suma/a.length;

        return media;
    }

    public static void rellenaEnOrden(int[] a)
    {
        int n=1;
        for(int i= 0; i<a.length;i++)
        {
            a[i]=n;
            n=n+1;
        }
    }

    public static void rellenaEnOrdenDesc(int[] a)
    {
        int n=a.length;
        for(int i= 0; i<a.length;i++)
        {
            a[i]=n;
            n=n-1;
        }
    }

    public static void rellenaAleatorio(int[] a)
    {
        Random r = new Random();
        for(int i= 0; i<a.length;i++)
        {
            a[i]=(r.nextInt(10)+1);
        }
    }

    public static boolean estaOrdenado(int[] a)
    {
        int no=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]>a[i])
            {
                no=no+1;
            }
        }
        if(no==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int numeroImpares(int[] a)
    {
        int impares=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                impares=impares+1;
            }
        }
        return impares;
    }

    public static int minArray(int[] a)
    {
        //Escribe una función “minArray” a la que le pasas un array y te devuelve el valor más pequeño de
        // los contenidos en dicho array
        int menor;
        menor=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(menor>a[i])
            {
                menor=a[i];
            }
        }
        return menor;
    }

    public static int maxArray(int[] a)
    {//Escribe una función “maxArray” que te devuelve el más grande
        int mayor;
        mayor=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(mayor<a[i])
            {
                mayor=a[i];
            }
        }
        return mayor;
    }

    public static int numeroAprobados(int[] a)
    {
        int numeroaprobados=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=5)
            {
                numeroaprobados=numeroaprobados+1;
            }
        }
        return numeroaprobados;
    }

    public static int porEncimaDe(int[] a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("cual es el valor?");
        int valor=sc.nextInt();
        int elementosporencima=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=valor)
            {
                elementosporencima=elementosporencima+1;
            }
        }
        return elementosporencima;
    }

    public static int cuantosCeros(int[] a)
    {
        int numerode0=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                numerode0=numerode0+1;
            }
        }
        return numerode0;
    }

    public static void copiaArray(int[] array1, int[] array2)
    {
        if(array1.length==array2.length)
        {
            for(int i=0;i<array1.length;i++)
            {
                array2[i]=array1[i];
            }
        }
        else
        {
            System.out.println("los dos array no son de la misma medida");
        }
    }

    public static void copiaArrayInvertido(int[] array1, int[] array2)
    {
        if(array1.length==array2.length)
        {
            int j= array1.length-1;
            for(int i=0;i<array1.length;i++)
            {
                array2[i]=array1[j];
                j=j-1;
            }
        }
        else
        {
            System.out.println("los dos array no son de la misma medida");
        }
    }

    public static void sumaArrays(int[] array1, int[] array2,int[] sumarray)
    {
        for(int i=0;i<array1.length;i++)
        {
            sumarray[i]=array1[i]+array2[i];
        }
    }

    public static void restaArrays(int[] array1, int[] array2,int[] restarray)
    {
        for(int i=0;i<array1.length;i++)
        {
            restarray[i]=array1[i]-array2[i];
        }
    }

    public static void multiplicaArrays(int[] array1, int[] array2,int[] multiplicarray)
    {
        for(int i=0;i<array1.length;i++)
        {
            multiplicarray[i]=array1[i]*array2[i];
        }
    }

    public static void divideArrays(int[] array1, int[] array2,int[] dividearray)
    {
        for(int i=0;i<array1.length;i++)
        {
            dividearray[i]=array1[i]/array2[i];
        }
    }

    public static void invierteArray(int[] a)
    {
        int temporal=1;
        int j= a.length-1;
        for(int i=0;i<a.length/2;i++)
        {
            temporal=a[i];
            a[i]=a[j];
            a[j]=temporal;
            j=j-1;
        }
    }

    public static boolean comparaArrays(int[] array1, int[] array2)
    {
        if (array1.length == array2.length)
        {
            int diferencias=0;
            for(int i=0;i<array1.length;i++)
            {
                if(array1[i]!=array2[i])
                {
                    diferencias=diferencias+1;
                    i = array1.length;
                }
            }
            if(diferencias==0)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {
            return false;
        }
    }

    public static void ponNotasArray(double[] notas,boolean[]aprobados)
    {
        for(int i=0;i<notas.length;i++)
        {
            if(notas[i]>=5)
            {
                aprobados[i]=true;
            }
            else
            {
                aprobados[i]=false;
            }
        }
    }

    public static void concatenaArrays55(int[] a, int[] b,int[] c)
    {
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
            c[i+5]=b[i];
        }
    }

    public static void concatenaArrays(int[] a, int[] b,int[] c)
    {
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        int j=a.length;
        for(int i=0 ;i<b.length;i++)
        {
            c[j]=b[i];
            j=j+1;
        }
    }

    public static boolean contiene(int[] a,int valor)
    {
        int contiene=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==valor)
            {
                contiene=contiene+1;
                i=a.length;
            }
        }
        if(contiene==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static int[] concatenaArraysPro(int[] a, int[] b)
    {
        int i, j;
        int[] c= new int[a.length + b.length];
        j = 0;
        for(i=0;i<a.length;i++)
        {
            c[j]=a[i];
            j++;
        }
        for(i=0 ;i<b.length;i++)
        {
            c[j]=b[i];
            j=j+1;
        }
        return c;
//        int[] c= new int[a.length + b.length];
//        for(int i=0;i<a.length;i++)
//        {
//            c[i]=a[i];
//        }
//        int j=a.length;
//        for(int i=0 ;i<b.length;i++)
//        {
//            c[j]=b[i];
//            j=j+1;
//        }
//        return c;
    }

    public static int[] copiaArrayPro(int[] array1)
    {
        int[] array2= new int[array1.length];
        for(int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
        return array2;
    }

    public static int[] insertaEnArray(int[] array1,int valor, int posicion)
    {
        int[] array2= new int[array1.length+1];
        int i;

        for( i=0;i<posicion;i++)
        {
            array2[i]=array1[i];
        }
        for( i= array1.length;i>=posicion;i--)
        {
            array2[i]=array1[i-1];
        }
        array2[posicion]=valor;
        return array2;
    }

    public static int[] borraDeArray(int[] array1, int posicion)
    {
        int[] array2 = new int[array1.length - 1];
        int i;
        for (i = 0; i < posicion; i++)
        {
            array2[i] = array1[i];
        }
        for (i = array1.length-1; i > posicion; i--)
        {
            array2[i - 1] = array1[i];
        }
        return array2;
    }

    public static int[] elimina1ElementoArray(int[] array1, int valor)
    {
        int posicionenlaquecoincide=-1;
        for(int i=0;i<array1.length;i++)
        {
            if (array1[i] == valor)
            {
                posicionenlaquecoincide=i;
                i= array1.length;
            }
        }
        if(posicionenlaquecoincide>=0)
        {
            array1=borraDeArray(array1, posicionenlaquecoincide);
        }
        return array1;

    }

    public static int[] eliminaElementosArray(int[] array1, int valor) //da error si todos los[i] del array = valor
    {
        int vecesdelvalor = 0;
        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] == valor)
            {
                vecesdelvalor = vecesdelvalor + 1;
            }
        }
        int[] array2 = new int[array1.length - vecesdelvalor];

        int j=0;//contador nuevo array
        for(int i=0; i<array1.length;i++)
        {
            if(array1[i] != valor)
            {
                array2[j]=array1[i];
                j++;
            }
        }
        return array2;
    }

    public static int[] insertaArrayEnArray(int[] a,int[] b, int posicion)
    {
        int[] c= new int[a.length+b.length];
        int i;

        for( i=0;i<posicion;i++)
        {
            c[i]=a[i];
        }
        int j=posicion;//contador de array c, nuevo
        for( i= 0;i<b.length;i++)
        {
            c[j]=b[i];
            j++;
        }
        for(i=posicion;i<a.length;i++)
        {
            c[j]=a[i];
            j++;
        }
        return c;
    }

    public static int[] subArray(int[] a,int posicion1, int posicion2)
    {
        int tamañob=(Math.abs(posicion1-posicion2))+1;
        int[] b= new int[tamañob];
        if(posicion1>posicion2)
        {
            System.out.println("error te has equivocado adios");
            return new int[0];
        }
        else
        {
            int j=0;//contador b
            int i;
            for( i=posicion1;i<=posicion2;i++)
            {
                b[j]=a[i];
                j++;
            }
            return b ;

        }

    }

    public static int[] recortaArray(int[] a,int posicion1, int posicion2)
    {
        int tamañoarestar=(Math.abs(posicion1-posicion2))+1;
        int[] b= new int[a.length-tamañoarestar];
        if(posicion1>posicion2)
        {
            System.out.println("error te has equivocado adios");
            return new int[0];
        }
        else
        {
            int j=0;//contador b
            for( int i=0;i<posicion1;i++)
            {
                b[j]=a[i];
                j++;
            }
            for(int i=posicion2+1;i<a.length;i++)
            {
                b[j]=a[i];
                j++;
            }
            return b;
        }

    }

    public static void ordenaBurbuja(int[] a)
    {
        int temporal;
        int i;
        for(int j=0;j<a.length-1;j++)
        {
            for(i=0;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    temporal=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temporal;
                }
            }
        }
    }

















}

