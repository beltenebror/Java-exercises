package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Dinero
{
    //PARTE ESTATICA
    static List<Moneda> listaMonedas;

    //Bloque estático:
    static
    {
        listaMonedas = new LinkedList<>();
        Moneda euro = new Moneda(TipoMoneda.euro, "EUR", 2, "€", 1);
        listaMonedas.add(euro);
        Moneda yen = new Moneda(TipoMoneda.yen, "JPY", 0, "¥", 0);
        listaMonedas.add(yen);
        listaMonedas.get(1).setCambioEuro(Dinero.ActualizaListaInternet(listaMonedas.get(1).codigo));
        Moneda dolar = new Moneda(TipoMoneda.dolar, "USD", 2, "$", 0);
        listaMonedas.add(dolar);
        listaMonedas.get(2).setCambioEuro(Dinero.ActualizaListaInternet(listaMonedas.get(2).codigo));
        Moneda libra = new Moneda(TipoMoneda.libra, "GBP", 2, "£", 0);
        listaMonedas.add(libra);
        listaMonedas.get(3).setCambioEuro(Dinero.ActualizaListaInternet(listaMonedas.get(3).codigo));
        //listaMonedas.add(new Moneda(TipoMoneda.euro, 2, "€", 1));
//        &&Dinero.ActualizaListaInternet(listaMonedas.get(1).codigo)
    }

    //Métodos estáticos:
    private static int buscaMoneda(TipoMoneda t)
    {
        int i = 0;
        while (listaMonedas.get(i).tipoMoneda != t)
        {
            i++;
        }
        return i;

    }

    public static void actualizaCambio(TipoMoneda t, double cambio)
    {
        int i = buscaMoneda(t);
        listaMonedas.get(i).setCambioEuro(cambio);
    }

//PARTE NORMAL

    //atributos
    private double cantidad;
    private TipoMoneda tMoneda;

    //Constructor

    private Dinero()
    {

    }

    public Dinero(double cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    //Propiedades

    public double getCantidad()
    {
        return this.cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public TipoMoneda gettMoneda()
    {
        return this.tMoneda;
    }

    public void settMoneda(TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
    }

    //Metodos

    @Override
    public String toString()
    {
        int a = buscaMoneda(this.tMoneda);
        int numeroDecimales = listaMonedas.get(a).decimales;
        double cantidadBien = this.cantidad;
        if (numeroDecimales == 0)
        {
            cantidadBien = Math.round(cantidadBien);
            int cantidadbiencerrada = (int) cantidadBien;
            return cantidadbiencerrada + listaMonedas.get(a).Simbolo;
        }
        else
        {
            int i;
            for (i = 0; i < numeroDecimales; i++)
            {
                cantidadBien = cantidadBien * 10;
            }
            cantidadBien = (int) (cantidadBien+0.5);

//            cantidadBien = Math.round(cantidadBien);


            for (i = 0; i < numeroDecimales; i++)
            {
                cantidadBien = cantidadBien / 10;
            }
            String cantiCaracteres="%."+numeroDecimales+"f";
            return String.format(cantiCaracteres, cantidadBien) + listaMonedas.get(a).Simbolo;
        }


    }

    public double valorEn(TipoMoneda t)
    {
        int posicionVi = buscaMoneda(this.tMoneda);
        int posicionNu = buscaMoneda(t);
        double aDevolver = (cantidad / listaMonedas.get(posicionVi).cambioEuro) * listaMonedas.get(posicionNu).cambioEuro;
        return aDevolver;
    }

    public Dinero convierteEn(TipoMoneda t)
    {
        int posicionVi = buscaMoneda(this.tMoneda);
        int posicionNu = buscaMoneda(t);
        double temporal = (cantidad / listaMonedas.get(posicionVi).cambioEuro) * listaMonedas.get(posicionNu).cambioEuro;
        Dinero nuevo = new Dinero(temporal, t);
        return nuevo;
    }

    public String toString(TipoMoneda t)
    {
        int posicionVi = buscaMoneda(this.tMoneda);
        int posicionNu = buscaMoneda(t);
        double cantidadBien = (cantidad / listaMonedas.get(posicionVi).cambioEuro) * listaMonedas.get(posicionNu).cambioEuro;
        int numeroDecimales = listaMonedas.get(posicionNu).decimales;
        if (numeroDecimales == 0)
        {
            cantidadBien = Math.round(cantidadBien);
            int cantidadbiencerrada = (int) cantidadBien;
            return cantidadbiencerrada + listaMonedas.get(posicionNu).Simbolo;
        }
        else
        {
            for (int i = 0; i < numeroDecimales; i++)
            {
                cantidadBien = cantidadBien * 10;
            }
            cantidadBien = Math.round(cantidadBien);

            for (int i = 0; i < numeroDecimales; i++)
            {
                cantidadBien = cantidadBien / 10;
            }
            return cantidadBien + listaMonedas.get(posicionNu).Simbolo;
        }
    }

    //Metodos operadores
    public Dinero add(Dinero dinero2)
    {
        Dinero dineroDevolve = new Dinero();
        if (this.tMoneda == dinero2.gettMoneda())
        {
            dineroDevolve.settMoneda(this.tMoneda);
            dineroDevolve.setCantidad(this.cantidad + dinero2.getCantidad());
        }
        else
        {
            Dinero dineroTemporal = dinero2.convierteEn(this.tMoneda);
            dineroDevolve.settMoneda(this.tMoneda);
            dineroDevolve.setCantidad(this.cantidad + dineroTemporal.getCantidad());
        }
        return dineroDevolve;
    }

    public Dinero substract(Dinero dinero2)
    {
        Dinero dineroDevolve = new Dinero();
        if (this.tMoneda == dinero2.gettMoneda())
        {
            dineroDevolve.settMoneda(this.tMoneda);
            dineroDevolve.setCantidad(this.cantidad - dinero2.getCantidad());
        }
        else
        {
            Dinero dineroTemporal = dinero2.convierteEn(this.tMoneda);
            dineroDevolve.settMoneda(this.tMoneda);
            dineroDevolve.setCantidad(this.cantidad - dineroTemporal.getCantidad());
        }
        return dineroDevolve;
    }

    public Dinero multiply(double numero)
    {
        Dinero dineroDevolver = new Dinero();
        dineroDevolver.tMoneda = this.tMoneda;
        dineroDevolver.cantidad = this.cantidad * numero;
        return dineroDevolver;
    }

    public Dinero divide(double numero)
    {
        Dinero dineroDevolver = new Dinero();
        dineroDevolver.tMoneda = this.tMoneda;
        dineroDevolver.cantidad = this.cantidad / numero;
        return dineroDevolver;
    }

    public Dinero negate()
    {
        Dinero dineroDevolver = new Dinero();
        dineroDevolver.tMoneda = this.tMoneda;
        dineroDevolver.cantidad = this.cantidad * -1;
        return dineroDevolver;
    }

    public boolean equals(Dinero dinero2) //da muy muy exacto
    {
        boolean devolver = false;
        if (this.tMoneda == dinero2.tMoneda)
        {
            if (this.cantidad == dinero2.cantidad)
            {
                devolver = true;
            }
        }
        else
        {
            Dinero dineroTemporal = dinero2.convierteEn(this.tMoneda);
            if (this.cantidad == dineroTemporal.cantidad)
            {
                devolver = true;
            }
        }


        return devolver;

    }

    public int compareTo(Dinero dinero2)
    {
        int devolver = +1;
        if (this.tMoneda == dinero2.tMoneda)
        {
            if (this.cantidad == dinero2.cantidad)
            {
                devolver = 0;
            }
            else
            {
                if (this.cantidad < dinero2.cantidad)
                {
                    devolver = -1;
                }
            }
        }
        else
        {
            Dinero dineroTemporal = dinero2.convierteEn(this.tMoneda);
            if (this.cantidad == dineroTemporal.cantidad)
            {
                devolver = 0;
            }
            else
            {
                if (this.cantidad < dineroTemporal.cantidad)
                {
                    devolver = -1;
                }
            }
        }


        return devolver;

    }

    public static double ActualizaListaInternet(String codigo)
    {
        String page = null; //para que me deje en paz
        int codPosition = 0;
        double devolver;
        try
        {
            URL url = new URL("https://api.exchangeratesapi.io/latest?symbols="+codigo);
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            page = br.readLine();
            br.close();
            is.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<page.length();i++)
        {
            if(  (page.charAt(i)==codigo.charAt(0)) && (page.charAt(i+1)==codigo.charAt(1)) && (page.charAt(i+2)==codigo.charAt(2)) )
            {
                codPosition=i;
                i=page.length();
            }
        }

        String cadena = page.substring(codPosition+5, page.indexOf("}", codPosition));
//        cadena=cadena.replace('.',',');
        devolver = Double.parseDouble(cadena);

        return devolver;


    }
}

