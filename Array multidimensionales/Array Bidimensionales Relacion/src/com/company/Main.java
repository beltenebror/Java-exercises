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
        System.out.println("15. Ejercicio 15");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[][] abi = {{-1, 200, -36}, {-4921, -5, 0}, {-7, 8, -9}};
                escribeArray3x3(abi);
            }
            break;

            case 2:
            {
                //Escribe la función rellena3x3 a la que le pasas un array bidimensional de 3x3 y te lo rellena con los números
                // del 1 al 9.
                int[][] abi=new int[3][3];
                rellena3x3(abi);
                escribeArray3x3(abi);
            }
            break;

            case 3:
            {
                int[][] abi=new int[3][3];
                RellenaAleatorio3x3(abi);
                escribeArray3x3(abi);
            }
            break;

            case 4:
            {
                int[][] abi=new int[3][3];
                rellena3x3(abi);
                escribeArray3x3(abi);
                System.out.println(sumaArray3x3(abi));
            }
            break;

            case 5:
            {
                int[][] abi = {{-1, 200, -36,4,4}, {-4921, -5, 0,3,4}, {-7, 8, -9,3,4}};
                escribeArrayBi(abi);

            }
            break;

            case 6:
            {
                int[][] abi=new int[3][3];
                rellenaAleatorioBi(abi);
                escribeArrayBi(abi);
            }
            break;

            case 7:
            {
                int[][] abi=new int[7][4];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
            }
            break;

            case 8:
            {
                //sumaArrayBi
                int[][] abi=new int[6][4];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
                System.out.println(sumaArrayBi(abi));
            }
            break;

            case 9:
            {
             //Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays bidimensionales de cualquier tamaño (siempre
                // y cuando todos tengan las mismas dimensiones).
                int[][] abi1=new int[6][4];
                rellenaEnordenBi(abi1);
                escribeArrayBi(abi1);
                int[][] abi2=new int[6][4];
                rellenaEnordenBi(abi2);
                escribeArrayBi(abi2);
                int[][] abisuma=new int[6][4];
                suma2ArraysBi(abi1,abi2,abisuma);
                escribeArrayBi(abisuma);

            }
            break;

            case 10:
            {
                //Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con datos y otro vacío, y te copia el contenido del primero al segundo.
                int[][] abi=new int[6][4];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
                int[][] abicopia=new int[6][4];
                copiaArrayBi(abi,abicopia);
                escribeArrayBi(abicopia);

            }
            break;

            case 11:
            {
               // Escribe la función copiaArrayBiPro a la que le pasas un array y te devuelve otro del mismo tamaño y con los mismos datos.
                int[][] abi=new int[2][2];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
                int[][] abicopia=copiaArrayBiPro(abi);
                escribeArrayBi(abicopia);

            }
            break;

            case 12:
            {
                //Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8 con la forma de un tablero de ajedrez,
                // usando el valor 1 para las casillas blancas y 0 para las negras.
                int[][] abi=new int[8][8];
                rellenaArrayAjedrez(abi);
                escribeArrayBi(abi);

            }
            break;

            case 13:
            {
                //Escribe la función rellenaDiagonal que te rellena un array cuadrado con el número ‘1’ en la diagonal principal,
                // el número ‘2’ en el triángulo que queda por encima y el ‘3’ en el triángulo que queda por debajo.
                int[][] abi=new int[4][4];
                rellenaDiagonal(abi);
                escribeArrayBi(abi);

            }
            break;

            case 14:
            {
                //Escribe la función rellenaX que te rellena un array cuadrado con el número ‘1’ en las dos diagonales y el ‘2’ en el resto.
                int[][] abi=new int[5][5];
                rellenaX(abi);
                escribeArrayBi(abi);
            }
            break;

            case 15:
            {
                //Escribe la función rellenaCuadros que te rellena un array cuadrado de lado par (o sea, 2x2, 4x4, 6x6, etc.) en cuatro cuadros.
                // El cuadro superior izquierdo lo rellena con ‘1’, el superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y el inferior
                // derecho con ‘4’.
                int[][] abi=new int[4][4];
                rellenaCuadros(abi);
                escribeArrayBi(abi);
            }
            break;


            default:
                System.out.println("Ese ejercicio no existe");
        }
    }


    public static void rellenaCuadros(int[][] abi)
    {
        int i,j;
        for(i=0;i<abi.length/2;i++)
        {
            for(j=0;j<abi[i].length/2;j++)
            {
                abi[i][j]=1;
            }
            for(j=abi[i].length/2;j<abi[i].length;j++)
            {
                abi[i][j]=2;
            }
        }
        for(i=abi.length/2;i<abi.length;i++)
        {
            for(j=0;j<abi[i].length/2;j++)
            {
                abi[i][j]=3;
            }
            for(j=abi[i].length/2;j<abi[i].length;j++)
            {
                abi[i][j]=4;
            }
        }
    }

    public static void rellenaX(int[][] abi)
    {
        int i, j;
        int k=0;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j <abi[i].length; j++)
            {
                abi[i][j] = 2;
            }
        }
        for (i = 0; i < abi.length; i++)
        {
            abi[i][i]=1;

        }
        for (i = abi.length-1; i >=0 ; i--)
        {

            abi[k][i]=1;
            k=k+1;
        }
    }


    public static void rellenaDiagonal(int[][] abi)
    {
        int i, j;
        for (i = 0; i < abi.length; i++)
        {
            abi[i][i]=1;
            for (j = i+1; j < abi[i].length; j++)
            {
                abi[i][j]=2;
            }
            for (j = 0; j <i; j++)
            {
                abi[i][j]=3;
            }

        }
    }

    public static void rellenaArrayAjedrez(int[][] abi)
    {
        int i, j;
        int num=1;
        for (i = 0; i < abi.length; i++)
        {
            num=(num+1)%2;
            for (j = 0; j < abi[i].length; j++)
            {
                abi[i][j]=num;
                num=(num+1)%2;
            }
        }
    }

    public static int[][] copiaArrayBiPro(int[][] abi)
    {
        int[][] abicopia= new int[abi.length][abi[0].length];
        int i, j;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi[i].length; j++)
            {
                abicopia[i][j]=abi[i][j];
            }
        }
        return abicopia;

    }

    public static void copiaArrayBi(int[][] abi, int[][] abicopia)
    {
        int i, j;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi[i].length; j++)
            {
                abicopia[i][j]=abi[i][j];
            }
        }
    }

    public static void suma2ArraysBi(int[][] abi1, int[][] abi2, int[][] abisuma)
    {
        if((abi1.length!=abi2.length)||(abi1.length!=abisuma.length))
        {
            System.out.println("habemus problema");
        }
        else
        {
            int problema=0;
            for(int i=0 ; i<abisuma.length ; i++)
            {
                if((abi1[i].length!=abi2[i].length)||(abi1[i].length!=abisuma[i].length))
                {
                    problema=1;
                    i=abisuma.length;
                }
            }
            if (problema==1)
            {
                System.out.println("habemus problema");
            }
            else
            {
                int j, k;
                for (k = 0; k < abi1.length; k++)
                {
                    for (j = 0; j < abi1[k].length; j++)
                    {
                        abisuma[k][j]=abi1[k][j]+abi2[k][j];
                    }
                }

            }
        }
    }

    public static int sumaArrayBi(int[][] abi)
    {
        int i, j;
        int suma = 0;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi[i].length; j++)
            {
                suma=suma + abi[i][j];
            }
        }
        return suma;
    }

    public static void rellenaEnordenBi(int[][] abi)
    {
        int i, j;
        int cont = 1;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j <abi[i].length; j++)
            {
                abi[i][j] = cont;
                cont = cont + 1;
            }
        }
    }

    public static void rellenaAleatorioBi(int[][] abi)
    {
        Random r = new Random();
        int i, j;
        int num;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi[i].length; j++)
            {
                num = r.nextInt(1000);
                num = num - 500;
                abi[i][j] = num;
            }
        }
    }

    public static void escribeArrayBi(int[][] abi)
    {
        int i, j;
        String temporal;
        for (i = 0; i < abi.length; i++)
        {
            System.out.print("[");
            for (j = 0; j < abi[i].length; j++)
            {
                temporal = String.valueOf(abi[i][j]);
                temporal = padLeft(temporal, 5);
                System.out.print(temporal);

                if (j < abi[i].length-1)
                {
                    System.out.print(",");
                }

            }
            System.out.print("]");
            System.out.println();

        }
    }

    public static int sumaArray3x3(int[][] abi)
    {
        int i, j;
        int suma = 0;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                suma=suma + abi[i][j];
            }
        }
        return suma;
    }

    public static void RellenaAleatorio3x3(int[][] abi)
    {
        Random r= new Random();
        int i, j;
        int num;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                num = r.nextInt(1000);
                num=num-500;
                abi[i][j] = num;
            }
        }
    }

    public static void rellena3x3(int[][] abi)
    {
        int i, j;
        int cont = 1;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                abi[i][j] = cont;
                cont = cont + 1;
            }
        }
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

    public static void escribeArray3x3(int[][] abi)
    {
        int i, j;
        String temporal;
        for (i = 0; i < 3; i++)
        {
            System.out.print("[");
            for (j = 0; j < 3; j++)
            {
                temporal=String.valueOf(abi[i][j]);
                temporal=padLeft(temporal,5);
                System.out.print(temporal);

//                if((abi[i][j]<10000)&&(abi[i][j]>=0))
//                {
//                    System.out.print(" ");
//                }
//                if((abi[i][j]<1000)&&(abi[i][j]>-1000))
//                {
//                    System.out.print(" ");
//                }
//                if((abi[i][j]<100)&&(abi[i][j]>-100))
//                {
//                    System.out.print(" ");
//                }
//                if((abi[i][j]<10)&&(abi[i][j]>-10))
//                {
//                    System.out.print(" ");
//                }
//                System.out.print(abi[i][j]);
                if(j!=2)
                {
                    System.out.print(",");
                }

            }
            System.out.print("]");
            System.out.println();

        }
    }
}
