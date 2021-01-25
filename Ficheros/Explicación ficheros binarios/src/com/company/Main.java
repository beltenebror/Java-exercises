package com.company;

import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
//        //Escribiendo un ficheros binario
//        try
//        {
//            FileOutputStream fos = new FileOutputStream("fichero2.bin");
//            DataOutputStream dos = new DataOutputStream(fos);
//
//            dos.writeInt(10);
//            dos.writeInt(100);
//            dos.writeInt(1000);
////            dos.writeUTF("patata");
//
//            dos.close();
//            fos.close();
//
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }


//        //leyendo de un fichero bunario
//        try
//        {
//            FileInputStream fis= new FileInputStream("fichero.bin");
//            DataInputStream dis= new DataInputStream(fis);
//
//            int n1= dis.readInt();
//            int n2= dis.readInt();
//            int n3= dis.readInt();
//            System.out.println(n1+ " " + n2+" "+ n3);
//
//            String s= dis.readUTF();
//            System.out.println(s);
//
//            dis.close();
//            fis.close();
//
//
//
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
//    }

        //como leer hasta el dinal(jauq ue saber el tipo de dato)
        try
        {
            FileInputStream fis= new FileInputStream("fichero2.bin");
            DataInputStream dis= new DataInputStream(fis);

            int n;
            while(dis.available()>0)
            {
                n=dis.readInt();
                System.out.println(n);
            }


            dis.close();
            fis.close();



        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
