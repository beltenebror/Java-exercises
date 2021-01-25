package com.company;

import java.util.Scanner;

public class Main
{           //EXPLICACIÓN CADENAS

    public static void main(String[] args)
    {
        char c= 'a'; //Char con comillas simples
        String s= "hola";
        String s1= "a";
        String s2= "";
        //OPERACONES CON CADENAS


            //Concatenacion
            String ca= "hola " + " adiós";

            ca = "el resultado es " +  5; //en realidad no se cambia lo de dentro, se crea una cadena nueva
                                          // con el mismo nombre y haces eso.
            ca= "cadena" + 'a';

            //PARA RECORRER UNA CADENA CON UN FOR
            String s4= "patata";
            int i;
            for(i=0;i<s4.length();i++)
            {
                System.out.println(s4.charAt(i)); //lo mismo que s4[i](pero para cadenas, en los demas se usa así)
            }


             int contador=0;
             for(i=0;i<s4.length();i++)  //para contar las veces que aparceve la a
             {
                 if(s4.charAt(i)=='a')
                 {
                     contador=contador+1;
                 }
             }

             //Quitar la letra a de una cadena

            String s5="";
             for(i=0;i<s4.length();i++)
             {
                 if(s4.charAt(i)!='a')
                 {
                     s5=s5+ s4.charAt(i);
                 }

             }
        System.out.println(s5);
             //Como copiar una cadena
            String scopia=s;

            //Como se lee una cedena;

        Scanner sc =new Scanner(System.in);
        String s6= sc.nextLine();//lee hasta el enter
        s6=sc.next();//solo lee hasta el siguiente separador(muchos problemas)


        int n=sc.nextInt();
        sc.nextLine();//para limpiar el buffer antes de leer una cadena, porque sino guarda el salto de linea.



        //FUNCIONES DE CADENAS

        String s7= "patata";
        //.charAt
        //s7.equals --> para comparar cadenas si son iguales
        //!s7.equals --> diferentes
        if(s5.equals(s7))
        {
            System.out.println("son iguales");
        }
        //s7.compareTo -- compara cadenas alfabeticamente
                            //0 si son iguales
                            //<0 si la primera es mas pequeña
                            //>0 si la primera es mas grande

        //s7.contains("aqui a dentro lo que contenga") -- nos dice si la cadena contiene algo

        //s7.indexOf('a')-- nos dice la posicion de algo, devuelve -1 si no esta(solo encuentra la primera)

        int pos= s7.indexOf('a');
        int pos2=s7.indexOf('a', pos+1);
        //s7.laxtIndexOf-- igual pero empezando desde el final

        //.isEmpty()-- para ver si esta vacia-true o false


        //.startsWith()--mira si empieza con
        //.endsWith()-- mira si termina con

        //para convertir nuna cadena de mayusculas a minuscula==
        s7="patata";
        System.out.println(s7.toUpperCase());
        System.out.println(s7.toLowerCase());

        char c1='a';
        char cmay=Character.toUpperCase(c1);
        char cmin= Character.toLowerCase(c1);


        //Funciones de caracteres parra verque tipo de caracter es
        if(Character.isLetter(c1))
        { }
        if(Character.isDigit(c1))
        { }
        if(Character.isUpperCase(c1))
        { }
        if(Character.isLowerCase(c1))
        { }

        //una funcion muy chula que no quiere luis que usemos=remplace

        String s8= "hola    adiós  goodbay";
        s8=s8.replace("  "," ");


        //TRIM -- QUITA ESPACIOS DE DEL ANTE Y DE DETRAS

        String s9="                hola y adios    ";
        s9=s9.trim();

        System.out.println(s9);


        //CONVERTIR CADENA EN ARRAY Y VICEVERSA
        //no quiere que lo usemos
        String s10="hola que tal";
        char[] array = s10.toCharArray();
        array[0]='H';
        s10=new String(array);
        System.out.println(s10);



        //subString-recorta una subvatena
        String s11= "hola que tal";
        String s12= s11.substring(0,4);//no incluida el 4:

        String s14 = s11.substring(0,5) + "Q" + s11.substring(6);


        //Split y Join= trocear una cadena y pegarla de nuevo

        String s15 ="holas que tal";
        String [] palabras= s15.split(" ");

        //escribo la primera letra de la segunda palabra
        System.out.println(palabras[2].charAt(0));
            //cambio que por   QUE
        palabras[1]="QUE";

        String s16=String.join(" ", palabras);
        System.out.println("s16");




    }
}
