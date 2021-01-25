package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class Main {
          //servidor
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket socketCliente = null;
        DataInputStream in;
        DataOutputStream out;
        int PUERTO = 5000;
        try
        {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true)
            {
                socketCliente = servidor.accept();
                System.out.println("Cliente Conectado");
                in = new DataInputStream(socketCliente.getInputStream());
                out = new DataOutputStream(socketCliente.getOutputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);

                out.writeUTF("Hola mundo desde el servidor");

                socketCliente.close();
                System.out.println("Cliente desconectado");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
