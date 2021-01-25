package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Main {
           //Cliente
    public static void main(String[] args) {
        String HOST = "127.0.0.1";
        int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        try
        {
            Socket socketCliente = new Socket(HOST,PUERTO);

            in = new DataInputStream(socketCliente.getInputStream());
            out = new DataOutputStream(socketCliente.getOutputStream());

            out.writeUTF("Ho la mundo desde el cliente");

            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socketCliente.close();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
