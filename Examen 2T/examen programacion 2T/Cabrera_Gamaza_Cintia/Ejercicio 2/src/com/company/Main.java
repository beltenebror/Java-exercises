package com.company;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        generaCartonBingo("micarton2.bingo");
    }

    public static void generaCartonBingo(String nombre)
    {
        List<Integer> numeros = new LinkedList();
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("BINGO");
            Random r= new Random();
            int randonnum;
            for(i=0;i<15;i++)//añado a la lista 15 números aleatorios diferentes del 1 al 90
            {
                randonnum=r.nextInt(90)+1;

                if(numeros.contains(randonnum))
                {
                    i=i-1;
                }
                else
                {
                    numeros.add(randonnum);
                }
            }

            for(i=0;i<numeros.size();i++)//los escribo
            {
                dos.writeInt(numeros.get(i));
            }

            dos.close();
            fos.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
