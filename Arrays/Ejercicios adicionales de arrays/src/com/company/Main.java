package com.company;

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


        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[] a ={0,1,2,3,4,5,6};
                intercambiaParImpar(a);
                escribeArray(a);
            }
            break;

            case 2:
            {
                System.out.println("sinceramente la complicación solo la veo en lo de la comprobación" +
                        "así que paso al siguiente");
            }
            break;

            case 3:
            {
//    Escribe la función tailArray. A esta función le pasaremos un array de enteros y un número n. La función nos
//    devolverá otro array de enteros con los n últimos elementos del array que le pasamos. O sea, si n = 5, nos
//    devolverá un array con las cinco últimas posiciones del primero. Si n es mayor que el número de elementos del
//    array o n es menor que 0, la función mostrará un mensaje de error y devolverá el array original.
//    Ej.: Si le pasamos [1, 2, 3, 4, 5, 6] y n=3, nos devolverá: [4, 5, 6]
//    Nota: El array que le pasamos por parámetro debe quedar exactamente igual que al principio; no os lo carguéis.
                int[] a ={0,1,2,3,4,5,6,7,8,9};
                escribeArray(a);
                int n=5;
                int[]b=tailArray(a,n);
                escribeArray(b);




            }
            break;

            case 4:
            {
                int[] a={0,1,2,3,4,5,5,5,5,5};
                System.out.println(detecta5(a));
            }
            break;

            case 5:
            {
                int n=10;
                boolean[] a=calculaNPrimos(n);
                escribeArrayBoolean(a);
            }
            break;

            case 6:
            {
            }
            break;

            case 7:
            {
//                Escribe la función tachaElementosNoComunes a la que le pasamos dos arrays. La función sustituirá los
//                elementos de un array que no aparezcan en el otro por ceros (y viceversa).
//                Ej: [1, 3, 5, 7] y [1, 2, 3, 4] => [1, 3, 0, 0] y [1, 0, 3, 0]
                int[]a={1,3,5,7};
                int[]b={1,2,3,4};
                tachaElementosNoComunes(a,b);
                escribeArray(a);
                escribeArray(b);



            }
            break;

            case 8:
            {
//                Escribe la función eliminaRepetidos a la que le pasas un array y te devuelve otro array
//                en el que se han eliminado los elementos que estén repetidos.
                int[] a={0,2,9,2,9,0,1,3};
                escribeArray(a);
                a=eliminaRepetidos(a);
                escribeArray(a);
            }
            break;

            case 9:
            {
                double[] a={1.56, 2.75, 3, 9.9};
                int[] b = redondeaArray(a);
                escribeArrayDouble(a);
                escribeArray(b);
                double[] c=decimalesArray(a);
                escribeArrayDouble(c);

                //[1.56, 2.75, 3, 9.9] => [1, 2, 3, 9]
            }
            break;

            case 10:
            {
                //Escribe la función desordenaArray. La función recibirá un array de enteros por
                //parámetro, que al término de la función deberá quedar desordenado.
                //Para conseguir esto, iremos cogiendo los elementos de un array de manera aleatoria y
                //los iremos poniendo en un array auxiliar.
                int[] a={0,1,2,3,4,5,6,7,8,9};
                escribeArray(a);
                int[]b=desordenaArray(a);
                escribeArray(b);

            }
            break;

            case 11:
            {
                int[] a={7,3,4,8,3,1,13};
                escribeArray(a);
                int[]b=minMaxArray(a);
                escribeArray(b);
            }
            break;

            case 12:
            {
                int[]a={9, 5, 3, 2, 10};
                graficaBarras(a);
            }
            break;

            case 13:
            {
                int[]a={2, 1, 1, 0, 1, 1, 0, 1, 1, 0, 2, 0, 5, 1, 2, 1, 1, 0};
                System.out.println(" la mayor racha es " + mejorRacha(a));

            }
            break;

            case 14:
            {
                int[]a =numerosPrimosPro();
                escribeArray(a);
            }
            break;

            case 15:
            {
                int[]a = new int[10];
                sucesionFibonacci(a);
                escribeArray(a);
            }
            break;

            case 16:
            {
                int[]a={4,3,3,8};
                String local="casa";
                String visitante="nuevo";
                String ganador=seriesMundiales(local,visitante,a);
                System.out.println("ganador");

            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
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

    public static void intercambiaParImpar(int[] a)
    {
        if((a.length%2)!=0)
        {
            int temporal;
            int i;
            for(i=0;i<a.length-1;i=i+2)
            {
                temporal=a[i];
                a[i]=a[i+1];
                a[i+1]=temporal;
            }
        }
        else
        {
            System.out.println("po esto sta mal");
        }
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

    public static int[] tailArray(int[] a,int n)
    {
        if((n<=0) || (n>a.length))
        {
            System.out.println("pos esta malamente");
            return a;
        }
        else
        {
            int[] b= new int[n];
            int i= a.length-1;
            for(int j=n-1 ; j>=0 ; j--)
            {
                b[j]=a[i];
                i--;
            }
            return b;
        }
    }

    public static boolean detecta5(int[] a)
    {
        int igualdad =0;
        for(int i=0;i<a.length-4;i++)
        {
            if((a[i]==a[i+1]) && (a[i+1]==a[i+2]) && (a[i+2]==a[i+3]) && (a[i+3]==a[i+4]))
            {
                igualdad=igualdad+1;
                i=a.length;
            }
        }

        if(igualdad>0)
        {
            return true;
        }
        else
        {
            return false;
        }

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

    public static boolean[] calculaNPrimos(int n)
    {
        boolean []a=new boolean[n+1];
        a[0]=false;
        a[1]=false;
        for(int i=3; i<=n; i++)
        {
            if(primo(i))
            {
                a[i]=true;
            }
            else
            {
                a[i]=false;
            }
        }
        return a;
    }

    public static boolean primo(int n)
    {
        int divisores;
        divisores = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                divisores = divisores + 1;
            }
        }
        if(divisores > 2)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    public static void tachaElementosNoComunes(int[]a, int[]b)
    {
        int coincidencia=0;
        //i contador a, j contador b
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    coincidencia=coincidencia+1;
                }
            }
            if(coincidencia==0)
            {
                a[i]=0;
            }
            coincidencia=0;
        }
        //i contador b, j contador a
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(b[i]==a[j])
                {
                    coincidencia=coincidencia+1;
                }
            }
            if(coincidencia==0)
            {
                b[i]=0;
            }
            coincidencia=0;
        }




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

    public static int[] copiaArrayPro(int[] array1)
    {
        int[] array2= new int[array1.length];
        for(int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
        return array2;
    }

    public static int[] eliminaRepetidos(int[]a)
    {
  //      int[]b=new int[a.length]

        int heborrado=0;
        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {w
                    a=borraDeArray(a,j);
                    j=j-1;
                }
            }
        }
        return a;
    }

    public static double[] decimalesArray(double[]a)
    {
        int []b=redondeaArray(a);
        double []c=new double[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i]-b[i];
        }
        return c;
    }

    public static int[] redondeaArray(double[]a)
    {
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=(int)a[i];
//            if(a[i]>=0)
//            {
//                b[i]=Math.floor(a[i]);
//            }
//            else
//            {
//                b[i]=Math.ceil(a[i]);
//            }

        }
        return b;

    }

    public static int[] desordenaArray(int[] a)
    {
        int[] b= new int[a.length];
        Random r = new Random();
        for(int i=0;i<b.length;i++)
        {
            int j= r.nextInt(a.length);
            b[i]=a[j];
            a=borraDeArray(a,j);
        }
        return b;
    }

    public static int[] minMaxArray(int[] a)
    {
        int min=minArray(a);
        int max= maxArray(a);
        int ponemosesto=min;
        int [] b= new int[(max-min)+1];
        for(int i= 0; i<b.length; i++)
        {
            b[i]=ponemosesto;
            ponemosesto=ponemosesto+1;
        }
        return b;

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

    public static void graficaBarras(int [] a)
    {
        for( int i= 0; i<a.length; i++)
        {
            if(a[i]<10)
            {
                System.out.print(" ");
            }
            System.out.print(a[i] + " ");
            for(int j=1;j<= a[i];j++)
            {
                System.out.print("█");
            }
            System.out.println();
        }
    }

    public static int mejorRacha(int[] a)
    {
        int racha=0;
        int maximo=0;
        for(int i=0;i<a.length-1;i=i+2)
        {
            if(a[i]>a[i+1])
            {
                racha=racha+1;
                if(maximo < racha)
                {
                    maximo=racha;
                }
            }
            else
            {
                racha=0;
            }
        }
        return maximo;
    }

    public static int[] numerosPrimosPro()
    {
        int[] a = new int[1001];
        a[0]=-1;
        a[1]=-1;
        for(int i=2; i<a.length; i++)
        {
            if(a[i]==0)
            {
                for(int j=i+i;j<a.length;j=j+i)
                {
                    a[j]=-1;
                }

            }

        }
        int tamañoarray2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                tamañoarray2=tamañoarray2+1;
            }
        }

        int[] b = new int[tamañoarray2];

        int j=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                b[j]=i;
                j=j+1;
            }
        }
        return b;

    }

    public static int[] sucesionFibonacci(int[] a)
    {
        a[0]=0;
        a[1]=1;
        for(int i=2; i<a.length;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }


    public static String seriesMundiales(String local, String visitante, int[] a)//me faltan las comprobaciones
    {
        String devolver;
        int victoriaslocal=0;
        int victoriasvisitante=0;
        if((a.length%2)!=0)
        {
            devolver="error";
        }
        else
        {
            for(int i=0;i<a.length;i=i+2);
            {
                if(a[i]>a[i+1])
                {
                    victoriaslocal=victoriasvisitante+1;
                }
                else
                {
                    if(a[i]<a[i+1])
                    {
                        victoriasvisitante=victoriasvisitante+1;
                    }
                }
            }
        }
        if(victoriaslocal>victoriasvisitante)
        {
            devolver=local;
        }
        else
        {
            if(victoriaslocal<victoriasvisitante)
            {
                devolver=visitante;

            }
            else
            {
                devolver="error";
            }
        }
        return devolver;










    }











}
