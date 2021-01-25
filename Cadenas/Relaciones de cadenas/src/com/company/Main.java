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
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String a="hola me llamo cintia ";
                System.out.println("tiene " + numeroEspacios(a)+" espacios");
            }
            break;

            case 2:
            {
                String a="hola me llamo cintia ";
                System.out.println("tiene " + numeroVocales(a)+" vocales");
            }
            break;

            case 3:
            {
                String a="oasad";
                System.out.println(esPalindromo(a));
            }
            break;

            case 4:
            {
                //Escribe la función “contiene” a la que le pasamos una cadena y un carácter por parámetro y nos dice
                // si el carácter aparece en la cadena o no. Es igual que la función contains. Evidentemente, no podéis
                // usar esta función para hacer la vuestra.
                String a="cintia";
                char caracter = 'a';
                System.out.println(contiene(a,caracter));

            }
            break;

            case 5:
            {
                //Escribe la función “repiteCaracter” a la que le pasamos dos parámetros: un carácter y un entero.
                // La función nos devolverá una cadena que contendrá el carácter repetido
                int numerodeveces=50;
                char caracter='a';
                System.out.println(repiteCaracter(numerodeveces,caracter));


            }
            break;

            case 6:
            {
                //Escribe las funciones “padLeft” y “padRight” a las que le pasaremos una cadena y una longitud final.
                // Ambas funciones nos añadirán espacios delante (padLeft) o detrás (padRight) de nuestra cadena hasta
                // que el tamaño de nuestra cadena llega a la longitud que le hemos pasado.
                //Ejemplo: padLeft(“patata”, 10) nos añadirá 4 espacios delante de “patata” para que la longitud final
                // quede 10. El resultado sería “~~~~patata” (~ = espacio).
                //Estas funciones nos serán muy útiles para cuando queramos escribir por pantalla listados y tablas de
                // manera elegante.

                String a="cintia";
                int longitud=15;
                System.out.println(padLeft(a,longitud));
                System.out.println(padRight(a,longitud));

            }
            break;

            case 7:
            {
                //Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos devuelve la misma cadena,
                // pero con todos los espacios quitados (tanto los del principio como los del final como los intermedios).
                String a=" c i n   t ia  ";
                System.out.println(quitaEspacios(a));
            }
            break;

            case 8:
            {
         //Escribe la función “quitaEspaciosTrim” a la que le pasamos una cadena y nos devuelve otra cadena igual que la
                // primera en la que se han eliminado los espacios que haya al principio y al final.
                String a=" c i n t i a ";
                System.out.println(quitaEspaciosTrim(a));
            }
            break;

            case 9:
            {
                //Escribe la función “sustituyeCaracter” a la que le pasamos una cadena, un carácter y otro carácter y
                // nos devuelve otra cadena igual que la primera en la que se ha sustituido el primer carácter por el
                // segundo carácter. Ojo, en las cadenas, al contrario que en los arrays, no podemos modificar
                // directamente un valor al estilo de cadena[2] = ‘A’ (los corchetes sólo sirven para leer el valor,
                // no para modificarlo).
                String a=" c i n t i a ";
                char caracteracambiar='i';
                char caracteraponer='1';
                System.out.println(sustituyeCaracter(a,caracteracambiar,caracteraponer));


            }
            break;

            case 10:
            {
                //Escribe la función “cuentaPalabras” a la que le pasamos una cadena que contiene una frase y nos
                // devuelve el número de palabras que hay en la misma.
                String a="       hola    gente   estoy doramion";
                System.out.println(cuentaPalabras(a));
            }
            break;

            case 11:
            {
                //Escribe la función “esNumero”, a la que le pasamos una cadena y nos dice si está formada enteramente
                // por números o no. Esta función es muy interesante para evitarnos errores a la hora de hacer
                // un Scanner.nextInt(). Si queremos leer un número del teclado, lo más correcto es leerlo con un
                // Scanner.next() como si fuera una cadena, después comprobar con la función esNumero si está formado
                // completamente por dígitos y después convertirlo a entero con, por ejemplo, un Integer.parseInt().
                String a="00998877";
                System.out.println(esNumero(a));
            }
            break;

            case 12:
            {
                String a="cintia lo vale";
                char caractercaca='a';
                System.out.println(quitaCaracter(a,caractercaca));

            }
            break;

            case 13:
            {
                //Escribe la función “quitaAcentos” a la que le pasas una cadena con caracteres acentuados y te
                // devuelve la cadena con los acentos quitados (esto se hace para algunos programas que no se enteran
                // de los acentos).
                String a="cíntíá ló válé";
                System.out.println(quitaAcentos(a));
            }
            break;

            case 14:
            {
                //Escribe la función “invierteCadena” a la que le pasamos una cadena y nos la devuelve invertida
                // (de detrás para delante, vamos).
                String a="cintia";
                System.out.println(invierteCadena(a));

            }
            break;

            case 15:
            {
              //  Escribe la función “vecesCaracter” a la que le pasamos una cadena y un carácter y nos dice cuántas veces se repite ese carácter.
                String a="cintia";
                char caracter='i';
                System.out.println(vecesCaracter(a, caracter));
            }
            break;

            case 16:
            {
                //Escribe la función “vecesPalabra” a la que le pasamos una cadena y una palabra (otra cadena) y nos
                // dice cuántas veces se repite esa palabra en la cadena.
                String a="cintia es la es mejor es";
                String acomprobar="es";
                System.out.println(vecesPalabra(a,acomprobar));
            }
            break;

            case 17:
            {
                //Escribe la función “mayusculasPrimera” a la que le pasas una cadena y te devuelve la cadena con la primera letra de cada palabra puesta en mayúsculas.
                String a="cintia es la es mejor es";
                System.out.println(mayusculasPrimera(a));
            }
            break;

            case 18:
            {
                //Escribe la función “sustituyePalabra” a la que le pasamos una cadena y dos palabras y nos devuelve
                // otra cadena en la que haya que sustituir la primera por la segunda.
                String a="cintia es la es mejor es";
                String palabracaca="es";
                String nuevapalabra="hola";
                System.out.println(sustituyePalabra(a,palabracaca,nuevapalabra));

            }
            break;

            case 19:
            {
                //Escribe una función “inviertePalabras” a la que la pasamos una cadena y nos devuelve otra en la que
                // están invertidas todas las palabras (no la cadena entera, sino cada palabra independientemente).
                String a="cintia es la mejor";
                System.out.println(inviertePalabras(a));


            }
            break;

            case 20:
            {
                //Escribe la función “quitaEspaciosSobrantes” a la que le pasamos una cadena por parámetro y nos devuelve otra.
                // La cadena que le pasamos podrá tener espacios delante y detrás, además de espacios entre las palabras.
                // Para obtener la cadena resultado, tendremos que quitar los espacios de delante y de detrás y si entre dos palabras
                // hay más de un espacio, deberemos dejar sólo uno.
                //Ej.: “~~~Mi~~mamá~~~~me~mima~~” -> “Mi~mamá~me~mima” (~ = espacio)
                String a="   cintia     es        la     mejor   ";
                System.out.println(quitaEspaciosSobrantes(a));
            }
            break;
            default:
                System.out.println("Ese ejercicio no existe");
        }

    }


    public static int numeroEspacios(String a)
    {
        int contador=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                contador=contador+1;
            }
        }

        return contador;

    }

    public static int numeroVocales(String a)
    {
        int contador=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            if((a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u')
                    ||(a.charAt(i)=='á')||(a.charAt(i)=='é')||(a.charAt(i)=='í')||(a.charAt(i)=='ó')||(a.charAt(i)=='ú')||(a.charAt(i)=='ü'))
            {
                contador=contador+1;
            }
        }

        return contador;

    }

    public static boolean esPalindromo(String a)
    {
        boolean devolver;
        int contador=0;
        a=a.toLowerCase();
        int j=a.length()-1;
        for(int i=0; i<a.length()/2;i++)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                contador = contador+1;
                i=a.length();
            }
        }
        if(contador==0)
        {
            devolver=true;
        }
        else
        {
            devolver=false;

        }
        return devolver;

    }

    public static boolean contiene(String a, char caracter)
    {
        boolean devolver;
        int numApariciones=0;
        for(int i=0; i<a.length();i++)
        {
            if(a.charAt(i)==caracter)
            {
                numApariciones = numApariciones+1;
                i=a.length();
            }
        }
        if(numApariciones==0)
        {
            devolver=false;
        }
        else
        {
            devolver=true;

        }
        return devolver;


    }

    public static String repiteCaracter(int veces, char caracter)
    {
        String a="";
        for(int i=0; i<veces; i++)
        {
            a= a + caracter;
        }
        return a;
    }

    public static String padLeft(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a= ' ' + a ;
        }
        return a;
    }

    public static String padRight(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a=  a + ' ';
        }
        return a;
    }

    public static String quitaEspacios(String a)
    {
        String b="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=' ')
            {
                b=b+ a.charAt(i);
            }

        }
        return b;
    }

    public static String quitaEspaciosTrim(String a)
    {
        int i=0;
        String b="";
        while(a.charAt(i)==' ')
        {
            i++;
        }
        for(;i<a.length();i++)
        {
            b=b+ a.charAt(i);
        }
        a="";
        i=b.length()-1;
        while(b.charAt(i)==' ')
        {
            i--;
        }
        for(int j=0;j<=i;j++)
        {
            a=a+ b.charAt(j);
        }
        return a;

    }

    public static String sustituyeCaracter(String a,char caractercaca,char nuevocaracter)
    {
        String b="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=caractercaca)
            {
                b=b+a.charAt(i);
            }
            else
            {
                b=b+nuevocaracter;
            }
        }

        return b;
    }

    public static int cuentaPalabras(String a)
    {
        int numerodepalabras=0;
        if(a.length()>0)
        {
            a=a.trim();
            numerodepalabras=1;
            for(int i=0;i<a.length()-1;i++)
            {
                if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' '))
                {
                    numerodepalabras=numerodepalabras+1;
                }
            }
        }
        else
        {
            numerodepalabras=0;
        }

        return numerodepalabras;
    }

    public static boolean esNumero(String a)
    {
        String numeros="0123456789";
        int i, j;
        int coincicendias=0;
        for(i=0;i<a.length();i++)
        {
            for(j=0;j<numeros.length();j++)
            {
                if(a.charAt(i)==numeros.charAt(j))
                {
                    coincicendias= coincicendias+1;
                }
            }
        }
        Boolean devolver;
        if(coincicendias==a.length())
        {
            devolver=true;
        }
        else
        {
            devolver=false;
        }
        return devolver;


    }

    public static String quitaCaracter(String a, char caractercaca)
    {
        String b="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=caractercaca)
            {
                b=b+ a.charAt(i);
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
//            int pos=-1;
//            for(j=0;j<acentos.length();j++)
//            {
//                if(a.charAt(i)==acentos.charAt(j))
//                {
//                    pos = j;
//                    j = a.length();
//                }
//            }

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

    public static String invierteCadena(String a)
    {
        String b="";
        int j=a.length()-1;
        for(int i=0;i<a.length();i++)
        {
                b=b+ a.charAt(j);
            j--;

        }
        return b;
    }

    public static int vecesCaracter(String a, char caracter)
    {
        int contador=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==caracter)
            {
                contador=contador+1;
            }
        }

        return contador;

    }

    public static int vecesPalabra(String a, String acomprobar)
    {
        int contador=0;
        String [] palabras= a.split(" ");
        for(int i=0;i<palabras.length;i++)
        {
            if(palabras[i].equals(acomprobar))
            {
                contador = contador+1;
            }
        }
        return contador;
    }

    public static String mayusculasPrimera(String a)
    {
        char[] array = a.toCharArray();
        array[0]=Character.toUpperCase(array[0]);
        String b=new String(array);
        return b;
    }

    public static String sustituyePalabra(String a, String palabracaca, String nuevapalabra)
    {
        String b;
        String [] palabras= a.split(" ");
        for(int i=0;i<palabras.length;i++)
        {
            if(palabras[i].equals(palabracaca))
            {
               palabras[i] = nuevapalabra;
            }
        }
        b=String.join(" ", palabras);
        return b;
    }

    public static String inviertePalabras(String a)
    {
        int contador=0;
        String [] palabras= a.split(" ");
        String temporal="caca";
        int j=palabras.length-1;
        for(int i=0;i<palabras.length/2;i++)
        {
            temporal=palabras[i];
            palabras[i]=palabras[j];
            palabras[j]=temporal;
            j=j-1;
        }
        a=String.join(" ", palabras);

        return a;
    }


    //Escribe la función “quitaEspaciosSobrantes” a la que le pasamos una cadena por parámetro y nos devuelve otra.
    // La cadena que le pasamos podrá tener espacios delante y detrás, además de espacios entre las palabras.
    // Para obtener la cadena resultado, tendremos que quitar los espacios de delante y de detrás y si entre dos palabras
    // hay más de un espacio, deberemos dejar sólo uno.
    //Ej.: “~~~Mi~~mamá~~~~me~mima~~” -> “Mi~mamá~me~mima” (~ = espacio)
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


























}
