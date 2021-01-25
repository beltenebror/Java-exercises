package com.company;

import java.security.InvalidParameterException;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya
{  //x 1-jugador uno    0-2jugadir dis
    Scanner sc = new Scanner(System.in);


    //atributos

    public int[][] tablero;

    //Constructor
    public TresEnRaya()
    {
        this.tablero = new int[3][3];
    }


    // Métodos

    public boolean movimientoValido(int pos)
    {
        boolean devolver=false;
        if((pos>0)&&(pos<10))
        {
            int i,j;
            if(pos<=3) //if muy grande para saber posiciones i y j a partir de la posicion que me pasan
            {
                i=0;
                j=pos-1;
            }
            else
            {
                if(pos<=6)
                {
                    i=1;
                    j=pos-4;
                }
                else
                {
                    i=2;
                    j=pos-7;
                }
            }

            if(this.tablero[i][j]==0)
            {
                devolver=true;
            }

        }
        return devolver;

    }



    public void mueveJugador1(int pos)
    {

        if(movimientoValido(pos))
        {
            if((pos>0)&&(pos<10))
            {
                int i,j;
                if(pos<=3)
                {
                    i=0;
                    j=pos-1;
                }
                else
                {
                    if(pos<=6)
                    {
                        i=1;
                        j=pos-4;
                    }
                    else
                    {
                        i=2;
                        j=pos-7;
                    }
                }
                this.tablero[i][j]=1;
            }

        }
    }

    public void mueveJugador2(int pos)
    {

        if(movimientoValido(pos))
        {
            if((pos>0)&&(pos<10))
            {
                int i,j;
                if(pos<=3)
                {
                    i=0;
                    j=pos-1;
                }
                else
                {
                    if(pos<=6)
                    {
                        i=1;
                        j=pos-4;
                    }
                    else
                    {
                        i=2;
                        j=pos-7;
                    }
                }
                this.tablero[i][j]=2;
            }

        }
    }




    public void mueveOrdenador1()
    {
        boolean seguir= true;
        boolean heMovido=false;
        if (vacio())
        {
            while (seguir)
            {
                Random r = new Random();
                int i = r.nextInt(3);
                int j = r.nextInt(3);
                if(tablero[i][j]==0)
                {
                    seguir=false;
                    tablero[i][j]=1;
                }
            }
        }
        else
        {
            int columna=0;
            int fila=0;
            for(int i =0 ; i<3;i++) //buscando ganar columnnas y filas
            {
                fila = 0;
                columna = 0;
                for (int j = 0; j < 3; j++)
                {
                    if (tablero[i][j] == 1)
                    {
                        fila = fila + 1;
                    }
                    if (tablero[j][i] == 1)
                    {
                        columna = columna + 1;
                    }
                }
                if (fila == 2)
                {
                    if (tablero[i][0] == 0)
                    {
                        tablero[i][0] = 1;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][1] == 0)
                    {
                        tablero[i][1] = 1;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][2] == 0)
                    {
                        tablero[i][2] = 1;
                        heMovido=true;

                    }
                }
                if((columna == 2))
                {
                    if (!heMovido && tablero[0][i] == 0)
                    {
                        tablero[0][i] = 1;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[1][i] == 0)
                    {
                        tablero[1][i] = 1;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[2][i] == 0)
                    {
                        tablero[2][i] = 1;
                        heMovido=true;
                    }
                }
            }

            if(!heMovido)  //Diagonal 1
            {
                // diagonal 1
                int diagonal1=0;
                if (tablero[0][0]==1)
                {
                    diagonal1=diagonal1+1;
                }
                if (tablero[1][1]==1)
                {
                    diagonal1=diagonal1+1;
                }
                if (tablero[2][2]==1)
                {
                    diagonal1=diagonal1+1;
                }

                if (diagonal1==2)
                {
                    if (tablero[0][0]==0)
                    {
                        tablero[0][0] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[1][1]==0)
                    {
                        tablero[1][1] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[2][2]==0)
                    {
                        tablero[2][2] = 1;
                        heMovido=true;
                    }
                }
            }

            if(!heMovido) //Diagonal 2
            {
                int diagonal2=0;
                if (tablero[2][0]==1)
                {
                    diagonal2=diagonal2+1;
                }
                if (tablero[1][1]==1)
                {
                    diagonal2=diagonal2+1;
                }
                if (tablero[0][2]==1)

                {
                    diagonal2=diagonal2+1;
                }

                if (diagonal2==2)
                {
                    if (tablero[2][0]==0)
                    {
                        tablero[2][0] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[1][1]==0)
                    {
                        tablero[1][1] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[0][2]==0)
                    {
                        tablero[0][2] = 1;
                        heMovido=true;
                    }
                }

            }


            if(!heMovido) //ahora busca parar columnas y filas
            {
                for(int i =0 ; i<3;i++)
                {
                    fila = 0;
                    columna = 0;
                    for (int j = 0; j < 3; j++)
                    {
                        if (tablero[i][j] == 2)
                        {
                            fila = fila + 1;
                        }
                        if (tablero[j][i] == 2)
                        {
                            columna = columna + 1;
                        }
                    }
                    if (fila == 2)
                    {
                        if (tablero[i][0] == 0)
                        {
                            tablero[i][0] = 1;
                            heMovido=true;

                        }
                        if (!heMovido && tablero[i][1] == 0)
                        {
                            tablero[i][1] = 1;
                            heMovido=true;

                        }
                        if (!heMovido && tablero[i][2] == 0)
                        {
                            tablero[i][2] = 1;
                            heMovido=true;

                        }
                    }
                    if((columna == 2))
                    {
                        if (!heMovido && tablero[0][i] == 0)
                        {
                            tablero[0][i] = 1;
                            heMovido=true;

                        }
                        if (!heMovido && tablero[1][i] == 0)
                        {
                            tablero[1][i] = 1;
                            heMovido=true;

                        }
                        if (!heMovido && tablero[2][i] == 0)
                        {
                            tablero[2][i] = 1;
                            heMovido=true;
                        }
                    }
                }
            }

            if(!heMovido)  //Parar diagonal 1
            {
                // diagonal 1
                int diagonal1=0;
                if (tablero[0][0]==2)
                {
                    diagonal1=diagonal1+1;
                }
                if (tablero[1][1]==2)
                {
                    diagonal1=diagonal1+1;
                }
                if (tablero[2][2]==2)
                {
                    diagonal1=diagonal1+1;
                }

                if (diagonal1==2)
                {
                    if (tablero[0][0]==0)
                    {
                        tablero[0][0] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[1][1]==0)
                    {
                        tablero[1][1] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[2][2]==0)
                    {
                        tablero[2][2] = 1;
                        heMovido=true;
                    }
                }
            }

            if(!heMovido) //Diagonal 2
            {
                int diagonal2=0;
                if (tablero[2][0]==2)
                {
                    diagonal2=diagonal2+1;
                }
                if (tablero[1][1]==2)
                {
                    diagonal2=diagonal2+1;
                }
                if (tablero[0][2]==2)

                {
                    diagonal2=diagonal2+1;
                }

                if (diagonal2==2)
                {
                    if (tablero[2][0]==0)
                    {
                        tablero[2][0] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[1][1]==0)
                    {
                        tablero[1][1] = 1;
                        heMovido=true;
                    }
                    if (!heMovido && tablero[0][2]==0)
                    {
                        tablero[0][2] = 1;
                        heMovido=true;
                    }
                }

            }

            if(!heMovido)
            {
                while (seguir)
                {
                    Random r = new Random();
                    int i = r.nextInt(3);
                    int j = r.nextInt(3);
                    if(tablero[i][j]==0)
                    {
                        seguir=false;
                        tablero[i][j]=1;
                    }
                }
            }


        }
    }

    public void mueveOrdenador2()
    {
        boolean seguir= true;
        boolean heMovido=false;
        int columna=0;
        int fila=0;

        if(!heMovido) //ahora busca ganar columnas y filas
        {
            for(int i =0 ; i<3;i++)
            {
                fila = 0;
                columna = 0;
                for (int j = 0; j < 3; j++)
                {
                    if (tablero[i][j] == 2)
                    {
                        fila = fila + 1;
                    }
                    if (tablero[j][i] == 2)
                    {
                        columna = columna + 1;
                    }
                }
                if (fila == 2)
                {
                    if (tablero[i][0] == 0)
                    {
                        tablero[i][0] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][1] == 0)
                    {
                        tablero[i][1] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][2] == 0)
                    {
                        tablero[i][2] = 2;
                        heMovido=true;

                    }
                }
                if((columna == 2))
                {
                    if (!heMovido && tablero[0][i] == 0)
                    {
                        tablero[0][i] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[1][i] == 0)
                    {
                        tablero[1][i] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[2][i] == 0)
                    {
                        tablero[2][i] = 2;
                        heMovido=true;
                    }
                }
            }
        }

        if(!heMovido)  //ganar diagonal 1
        {
            // diagonal 1
            int diagonal1=0;
            if (tablero[0][0]==2)
            {
                diagonal1=diagonal1+1;
            }
            if (tablero[1][1]==2)
            {
                diagonal1=diagonal1+1;
            }
            if (tablero[2][2]==2)
            {
                diagonal1=diagonal1+1;
            }

            if (diagonal1==2)
            {
                if (tablero[0][0]==0)
                {
                    tablero[0][0] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[1][1]==0)
                {
                    tablero[1][1] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[2][2]==0)
                {
                    tablero[2][2] = 2;
                    heMovido=true;
                }
            }
        }

        if(!heMovido) //Diagonal 2
        {
            int diagonal2=0;
            if (tablero[2][0]==2)
            {
                diagonal2=diagonal2+1;
            }
            if (tablero[1][1]==2)
            {
                diagonal2=diagonal2+1;
            }
            if (tablero[0][2]==2)

            {
                diagonal2=diagonal2+1;
            }

            if (diagonal2==2)
            {
                if (tablero[2][0]==0)
                {
                    tablero[2][0] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[1][1]==0)
                {
                    tablero[1][1] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[0][2]==0)
                {
                    tablero[0][2] = 2;
                    heMovido=true;
                }
            }

        }

        if(!heMovido)
        {
            for(int i =0 ; i<3;i++) //buscando parar columnnas y filas
            {
                fila = 0;
                columna = 0;
                for (int j = 0; j < 3; j++)
                {
                    if (tablero[i][j] == 1)
                    {
                        fila = fila + 1;
                    }
                    if (tablero[j][i] == 1)
                    {
                        columna = columna + 1;
                    }
                }
                if (fila == 2)
                {
                    if (tablero[i][0] == 0)
                    {
                        tablero[i][0] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][1] == 0)
                    {
                        tablero[i][1] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[i][2] == 0)
                    {
                        tablero[i][2] = 2;
                        heMovido=true;

                    }
                }
                if((columna == 2))
                {
                    if (!heMovido && tablero[0][i] == 0)
                    {
                        tablero[0][i] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[1][i] == 0)
                    {
                        tablero[1][i] = 2;
                        heMovido=true;

                    }
                    if (!heMovido && tablero[2][i] == 0)
                    {
                        tablero[2][i] = 2;
                        heMovido=true;
                    }
                }
            }
        }


        if(!heMovido)  //Diagonal 1
        {
            // diagonal 1
            int diagonal1=0;
            if (tablero[0][0]==1)
            {
                diagonal1=diagonal1+1;
            }
            if (tablero[1][1]==1)
            {
                diagonal1=diagonal1+1;
            }
            if (tablero[2][2]==1)
            {
                diagonal1=diagonal1+1;
            }

            if (diagonal1==2)
            {
                if (tablero[0][0]==0)
                {
                    tablero[0][0] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[1][1]==0)
                {
                    tablero[1][1] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[2][2]==0)
                {
                    tablero[2][2] = 2;
                    heMovido=true;
                }
            }
        }

        if(!heMovido) //Diagonal 2
        {
            int diagonal2=0;
            if (tablero[2][0]==1)
            {
                diagonal2=diagonal2+1;
            }
            if (tablero[1][1]==1)
            {
                diagonal2=diagonal2+1;
            }
            if (tablero[0][2]==1)

            {
                diagonal2=diagonal2+1;
            }

            if (diagonal2==2)
            {
                if (tablero[2][0]==0)
                {
                    tablero[2][0] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[1][1]==0)
                {
                    tablero[1][1] = 2;
                    heMovido=true;
                }
                if (!heMovido && tablero[0][2]==0)
                {
                    tablero[0][2] = 2;
                    heMovido=true;
                }
            }

        }

        if(!heMovido)
        {
            while (seguir)
            {
                Random r = new Random();
                int i = r.nextInt(3);
                int j = r.nextInt(3);
                if(tablero[i][j]==0)
                {
                    seguir=false;
                    tablero[i][j]=2;
                }
            }
        }
    }



    public boolean vacio()
    {
        boolean devolver=true;
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(this.tablero[i][j]!=0)
                {
                    devolver=false;
                    j=3;
                    i=3;
                }
            }
        }
        return devolver;
    }

    public void iniciar()
    {
        for(int i =0 ; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tablero[i][j]=0;
            }
        }
    }


    public boolean quedanMovimientos()
    {
        boolean movimiento=false;
        for(int i =0 ; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(tablero[i][j]==0)
                {
                    movimiento=true;
                    j=4;
                    i=4;
                }
            }
        }
        return movimiento;

    }



    public boolean ganaJugador1()
    {
        boolean gana=false;
        int fila;
        int columna;

        for(int i =0 ; i<3;i++)
        {
            fila=0;
            columna=0;
            for(int j=0;j<3;j++)
            {
                if(tablero[i][j]==1)
                {
                    fila=fila+1;
                }
                if(tablero[j][i]==1)
                {
                    columna=columna+1;
                }
            }
            if((fila==3)||(columna==3))
            {
                gana=true;
            }
        }
        if(!gana)
        {
            if((tablero[0][0]==1)&&(tablero[1][1]==1)&&(tablero[2][2]==1))
            {
                gana=true;
            }
            if((tablero[0][2]==1)&&(tablero[1][1]==1)&&(tablero[2][0]==1))
            {
                gana=true;
            }
        }


        return gana;
    }

    public boolean ganaJugador2()
    {
        boolean gana=false;
        int fila;
        int columna;

        for(int i =0 ; i<3;i++)
        {
            fila=0;
            columna=0;
            for(int j=0;j<3;j++)
            {
                if(tablero[i][j]==2)
                {
                    fila=fila+1;
                }
                if(tablero[j][i]==2)
                {
                    columna=columna+1;
                }
            }
            if((fila==3)||(columna==3))
            {
                gana=true;
            }
        }
        if(!gana)
        {
            if((tablero[0][0]==2)&&(tablero[1][1]==2)&&(tablero[2][2]==2))
            {
                gana=true;
            }
            if((tablero[0][2]==2)&&(tablero[1][1]==2)&&(tablero[2][0]==2))
            {
                gana=true;
            }
        }


        return gana;
    }



    public void dibujaTablero()
    {
        for(int i =0 ; i<3;i++)
        {
            System.out.println("----------------");
            System.out.print("|");
            for(int j=0;j<3;j++)
            {
                System.out.print("  ");
                if(tablero[i][j]==0)
                {
                    System.out.print(" ");
                }
                if(tablero[i][j]==1)
                {
                    System.out.print("X");
                }
                if(tablero[i][j]==2)
                {
                    System.out.print("O");
                }

                System.out.print(" ");
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }







}
