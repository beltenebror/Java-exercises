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

        switch (opcion)
        {
            case 1:
            {
                //Escribe la función invierteBi a la que le pasas un array bidimensional cuadrado (es decir, igual de alto que de ancho) y te lo invierte.
                //cambiar filas por columnas
                int [][] abi = new int[3][3];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
                System.out.println();
                invierteBi(abi);
                escribeArrayBi(abi);

            }
            break;

            case 2:
            {
                //Escribe la función calculaDeterminante que te calcule el valor de un determinante de 3x3 y te lo devuelva. Si no
                // sabéis cómo se calcula un determinante de 3x3, lo buscáis en el internete.
                int [][] abi = new int[3][3];
                rellenaEnordenBi(abi);
                escribeArrayBi(abi);
                System.out.println();
                System.out.println(calculaDeterminante(abi));

            }
            break;

            case 3:
            {
                //Escribe la función cuadradoMagico a la que le pasas un array de 3x3 y te dice si es un cuadrado mágico o no.
                // Un cuadrado mágico es un array bidimensional cuadrado en el cual la suma de cada una de las filas y de cada
                // una de las columnas y de las dos diagonales principales es igual.
                int[][] abi = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
                System.out.println(cuadradoMagico(abi));

            }
            break;

            case 4:
            {
                //Escribe la función compruebaSudoku a la que le pasas un array de 9x9 enteros y te dice si el array contiene un
                // sudoku correcto (devuelve un Boolean que será true si es correcto). Un sudoku será correcto si en cada fila, en
                // cada columna y en cada submatriz de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno.
                //Se recomienda crear la función compruebaArray19 al que le pasas un array de 9 enteros y te dice si en él se
                // encuentran todos los números del 1 al 9 una sola vez.
                //Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de 9 enteros y pasárselo a
                // esta función para comprobar si está bien.
                int[][] abi = {{5,3,4,6,7,8,9,1,2}, {6,7,2,4,9,5,3,4,8}, {1,9,8,3,4,2,5,6,7}, {8,5,9,7,6,1,4,2,3}, {4,2,6,8,5,3,7,9,1}, {7,1,3,9,2,4,8,5,6}, {9,6,1,5,3,7,2,8,4}, {2,8,7,4,1,9,6,3,5}, {3,4,5,2,8,6,1,7,9}};
                System.out.println(compruebaSudoku(abi));


            }
            break;

            case 5:
            {
                int[][] abi = {{0,0,0,0,0,0,0,0}, {1,1,1,0,0,0,2,0}, {0,0,0,0,0,0,2,0}, {0,3,3,3,3,0,2,0}, {0,0,0,0,0,0,0,0}, {0,4,0,0,5,5,5,0}, {0,4,0,0,0,0,0,0}, {0,4,0,0,0,0,0,0}};
                hundirLaFlota(abi);
            }
            break;

            default:
                System.out.println("Ese ejercicio no existe");
        }

    }

    public static void hundirLaFlota(int[][] abi)
    {
        Scanner sc = new Scanner(System.in);
        int[][] mapa = new int[8][8];
        int i, j, k, l;
        int barco = 1;
        escribeArrayBi(mapa);
        int numerodebarco;
        String hundido;



        while(quedanbarcos(abi))
        {
            System.out.println("qué posición quieres bombardear? del 1 al 8");
            System.out.println("fila:");
            k = sc.nextInt();
            System.out.println("columna:");
            l = sc.nextInt();
            while((k<0)||(l<0)||(k>8)||(l>8))
            {
                System.out.println("amos a ver, las filas están malamente");
                System.out.println("qué posición quieres bombardear?");
                System.out.println("fila:");
                k = sc.nextInt();
                System.out.println("columna:");
                l = sc.nextInt();
            }
            k=k-1;
            l=l-1;
            if(abi[k][l]<100)
            {
                abi[k][l] = (abi[k][l]) + 100;
            }
            mapa[k][l] = abi[k][l];


            escribeArrayBi(mapa);
            if(mapa[k][l]==100)
            {
                System.out.println("              AGUA!");
            }
            else
            {
                numerodebarco=abi[k][l]-100;
                if(hundido(abi,numerodebarco)==true)
                {
                    System.out.println("              TOCADO Y HUNDIDO!!!");
                }
                else
                {
                    System.out.println("              TOCADO!!");
                }

            }
            System.out.println();

        }


        System.out.println();
        System.out.println("TERMINASTE");


    }
    public static boolean hundido(int [][] abi, int numerodebarco)
    {
        int i,j;
        boolean barco=true;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi.length; j++)
            {
                if (abi[i][j] ==numerodebarco)
                {
                    barco = false;
                    j = abi.length;
                }

            }
        }
        return barco;
    }

    public static boolean quedanbarcos(int [][] abi)
    {
        int i,j;
        boolean barco=false;
        for (i = 0; i < abi.length; i++)
        {
            for (j = 0; j < abi.length; j++)
            {
                if ((abi[i][j] > 0) && (abi[i][j] < 100))
                {
                    barco = true;
                    j = abi.length;
                }

            }
        }
        return barco;
    }

    public static boolean compruebaSudoku(int[][] abi)
    {
        List<Integer> listafila = new LinkedList<>();
        List<Integer> listacolumnas = new LinkedList<>();
        List<Integer> listabloque = new LinkedList<>();
        boolean valor = true;

        int i, j, k,l;
        for (i = 0; i < abi.length; i++)
        {
            listafila.clear();
            listacolumnas.clear();
            for (j = 0; j < abi.length; j++)
            {
                listafila.add(abi[i][j]);
                listacolumnas.add(abi[j][i]);
            }
            Collections.sort(listafila);
            Collections.sort(listacolumnas);
            for (k = 1; k < 10; k++)
            {
                if ((listafila.get(k - 1) != k) || (listacolumnas.get(k - 1) != k))
                {
                    valor = false;
                    i = abi.length;
                }
            }

        }

        for (i = 0; i < 9; i = i + 3)
        {
            for(j=0;j < 9; j = j + 3)
            {
                listabloque.clear();
                for (k = i; k < i + 3; k++)
                {
                    for (l = j; l < j + 3; l++)
                    {
                        listabloque.add(abi[k][l]);
                    }

                }
                Collections.sort(listabloque);
                for (l = 1; l < 9; l++)
                {
                    if (listabloque.get(l - 1) != l)
                    {
                        valor = false;
                        j= abi.length+100;
                        i = abi.length+100;
                    }
                }
            }
        }

        return valor;
    }

    public static boolean cuadradoMagico(int[][] abi)
    {
        boolean valor=true;
        int i,j;
        int multiplicacioncolumna=1,multiplicacionfila=1;
        int anterior=0;

        for(i=0;i<abi.length;i++)
        {
            multiplicacioncolumna=0;
            multiplicacionfila=0;
            for(j=0;j<abi[i].length;j++)
            {
                multiplicacionfila=multiplicacionfila+abi[i][j];
                multiplicacioncolumna=multiplicacioncolumna+abi[j][i];

            }
            if((i==0))
            {
                if(multiplicacioncolumna!=multiplicacionfila)
                {
                    valor=false;
                    i=abi.length;
                }
                else
                {
                    anterior=multiplicacioncolumna;
                }
            }
            else
            {
                if ((multiplicacioncolumna != anterior) || (multiplicacionfila != anterior))
                {
                    valor = false;
                    i = abi.length;
                }
            }
        }
        return valor;
    }

    public static int calculaDeterminante(int[][] abi)
    {
        int multiplicacion=1;
        int suma =0;
        int determinante;
        multiplicacion=abi[0][0]*abi[1][1]*abi[2][2];
        suma= suma+multiplicacion;
        multiplicacion=abi[0][1]*abi[1][2]*abi[2][0];
        suma= suma+multiplicacion;
        multiplicacion=abi[0][2]*abi[1][0]*abi[2][1];
        suma= suma+multiplicacion;
        determinante= suma;
        multiplicacion=abi[0][2]*abi[1][1]*abi[2][0];
        determinante=determinante-multiplicacion;
        multiplicacion=abi[0][0]*abi[1][2]*abi[2][1];
        determinante=determinante-multiplicacion;
        multiplicacion=abi[0][1]*abi[1][0]*abi[2][2];
        determinante=determinante-multiplicacion;


        return determinante;
    }

    public static void invierteBi(int[][] abi)
    {
        if(abi.length!=abi[0].length)
        {
            System.out.println("error son de distinto tamaña");
        }
        else
        {
            int i,j,k;
            int [][] temporal=new int[abi.length][abi.length];
            for (i=0;i<abi.length;i++)
            {
                for(j=0;j<abi.length;j++)
                {
                    temporal[j][i]=abi[i][j];
                }
            }
            for (i=0;i<temporal.length;i++)
            {
                for(j=0;j<temporal.length;j++)
                {
                    abi[i][j]=temporal[i][j];
                }
            }
        }


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
                num = r.nextInt(20);
                num = num - 10;
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

    public static String padLeft(String a, int longitud)
    {
        int numeroespacios=longitud-a.length();
        for(int i=0; i<numeroespacios; i++)
        {
            a= ' ' + a ;
        }
        return a;
    }





}
