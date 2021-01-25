package com.company;

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
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función marcaSubCadena a la que le pasamos dos cadenas y nos busca la segunda cadena
                // dentro de la primera. Nos devolverá otra cadena igual que la primera, pero en la que se cambiará
                // la primera letra de cada vez que aparece la subcadena por un asterisco.

                String a="La mejor es Cintia";
                String b="Cintia";
                System.out.println(marcaSubCadena(a,b));

            }
            break;

            case 2:
            {
                //Escribe la función escribeNombres a la que le pasamos una cadena por parámetro y nos la escribe por
                // la pantalla (con println) con el siguiente formato: la cadena contendrá varias palabras separadas
                // por espacios, con el siguiente formato: “apellido1 apellido2 nombre apellido1 apellido2 nombre (…)”
                // y deberemos escribirla por pantalla de la siguiente forma:
                //nombre apellido1 apellido2
                //nombre apellido1 apellido2
                //(…)
                String a="Cabrera Gamaza Cintia Gomez Perez Juan Garrido Bertez Manuel";
                escribeNombres(a);


            }
            break;

            case 3:
            {
//                Escribe la función cuentaLetras a la que le pasas una cadena por parámetro y te devuelve un array de
//                enteros. El tamaño del array será 5 y el contenido será el número de veces que aparecen las letras
//                “a”, “b”, “c”, “d” y “e”, respectivamente, en la cadena que le hemos pasado (independientemente de
//                si son mayúsculas o minúsculas).
//                Ej.: cadena = “patata camaleón batata”, resultado: [8, 1, 1, 0, 1]
//                Versión Pro: La función devolverá un array de enteros con 26 posiciones correspondientes a
//                las 26 letras del abecedario. No uséis un switch (ni 26 ifs). Perdón, 27, se me olvidaba la eñe.
                String a="aabbccccccfff";
                escribeArray(cuentaLetras(a));
            }
            break;

            case 4:
            {
                //Escribe la función mayusculasMinusculas que recibirá dos parámetros: una cadena
                // (que podrá contener saltos de línea) y un número entre 1 y 4. Dependiendo del número que le pasemos,
                // la función nos devolverá otra cadena con las siguientes características:
                //• 1 = Todas las letras en minúsculas.
                //• 2 = Todas las letras en mayúsculas.
                //• 3 = La primera letra de cada palabra en mayúsculas y el resto en minúsculas.
                //• 4 = La primera letra de cada frase en mayúsculas y el resto en minúsculas.
                //Escribir también un pequeño menú en el programa principal para probar las diferentes opciones.
                String a="CinTia eS la meJor";
                System.out.println("Tu cadena es la siguiente:");
                System.out.println(a);
                System.out.println();
                System.out.println("¿Qué función desea?");
                System.out.println("• 1 = Todas las letras en minúsculas.");
                System.out.println("• 2 = Todas las letras en mayúsculas.");
                System.out.println("• 3 = La primera letra de cada palabra en mayúsculas y el resto en minúsculas.");
                System.out.println("• 4 = La primera letra de cada palabra en minúsculas y el resto en mayúsculas.");
                int funcion=sc.nextInt();
                System.out.println();
                System.out.println(mayusculasMinusculas(a,funcion));
                //preguntar a luis por salto de linea, resulta que este esta mal
            }
            break;

            case 5:
            {
                //Escribe la función eliminaTags a la que le pasamos una cadena que contiene tags (como los de XML) y
                //los elimina dejando sólo el texto (nos devuelve una cadena con el resultado).
                //Ej.: <p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>
                //Nos devolvería: Esto es texto normal y esto es texto en negrita.

            }
            break;

            case 6:
            {
                //Escribe
            }
            break;

            case 7:
            {
                //Escr
            }
            break;

            case 8:
            {
                //Escribe l
            }
            break;

            case 9:
            {


            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }


    }


    public static String marcaSubCadena(String cadena, String contenido)
    {
        String devolver="";
        if(cadena.contains(contenido))
        {
            int lugar= cadena.indexOf(contenido);
            for(int i=0;i<cadena.length();i++)
            {
                if(i==lugar)
                {
                    devolver = devolver + "*";
                }
                devolver=devolver + cadena.charAt(i);
            }
        }
        return devolver;

    }

    public static void escribeNombres(String a)
    {

        String [] palabras= a.split(" ");

        for(int i=0;i<(palabras.length-2);i=i+3)
        {
            System.out.print(palabras[i+2] + " " + palabras[i] + " " + palabras[i+1]);
            System.out.println();
        }

    }

    public static int[] cuentaLetras(String a)
    {
        String acontar="abcdefghijklmnñopqrstuvwxyz";
        a=a.toLowerCase();
        a=quitaAcentos(a);
        int[] devolver=new int[27];
        int i, j;
        for(i=0;i<a.length();i++)
        {
            for(j=0;j<acontar.length();j++)
            {
                if(a.charAt(i)==acontar.charAt(j))
                {
                    devolver[j]=devolver[j]+1;
                }
            }
        }
        return devolver;

    }

    public static String mayusculasMinusculas(String a,int funcion)
    {
        String devolver="";

        switch (funcion)
        {
            case 1:
            {
                devolver=a.toLowerCase();
            }
            break;

            case 2:
            {
                devolver=a.toUpperCase();
            }
            break;

            case 3:
            {
                String temporal="";
                devolver=a.toLowerCase();
                devolver=quitaEspaciosSobrantes(devolver);
                String [] palabras= devolver.split(" ");
                for(int i=0;i<palabras.length;i++)
                {
                    temporal=palabras[i];
                    char[] array = temporal.toCharArray();
                    array[0]=Character.toUpperCase(array[0]);
                    palabras[i]=new String(array);

                }
                devolver=String.join(" ", palabras);

            }

            break;

            case 4:
            {
                String temporal="";
                devolver=a.toLowerCase();
                devolver=quitaEspaciosSobrantes(devolver);
                String [] palabras= devolver.split(" ");
                for(int i=0;i<palabras.length;i++)
                {
                    temporal=palabras[i];
                    char[] array = temporal.toCharArray();
                    for(int j=1;j<array.length;j++)
                    {
                        array[j]=Character.toUpperCase(array[j]);
                    }
                    palabras[i]=new String(array);

                }
                devolver=String.join(" ", palabras);


            }
            break;

            default:
                devolver="funcion erronea";
        }
        return devolver;

    }

    public static String quitaEspaciosSobrantes(String a)
    {
        String b="";
        if(a.length()>0)
        {
            a=a.trim();
            for(int i=0;i<a.length();i++)
            {
                if((a.charAt(i)!=' ')||(a.charAt(i+1)!=' '))
                {
                    b=b+ a.charAt(i);
                }
            }
        }

        return b;
    }




















    public static String quitaAcentos(String a)
    {
        String acentos="áéíóúüÁÉÍÓÚÜ";
        String sinacentos="aeiouuAEIOUU";
        String b="";
        int i, j,pos;
        for(i=0;i<a.length();i++)
        {
            pos = acentos.indexOf(a.charAt(i));

            if(pos == -1)
            {
                b=b + a.charAt(i);
            }
            else
            {
                b=b + sinacentos.charAt(pos);
            }
        }

        return b;
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




















}
