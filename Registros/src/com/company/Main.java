package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{


    public static void main(String[] args)
    {
        CuentaBanco cb = new CuentaBanco();
        cb.numeroCuenta = "ES89800210001980000387438";
        cb.propietario = "Antonio García Rodrógiez";
        cb.saldo = 14.5;
        cb.bloqueado = false;

        List<CuentaBanco> lista = new ArrayList<>();

        lista.add(cb);
    }


}
