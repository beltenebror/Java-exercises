package com.company;
enum UnidadLongiud
{
    metros, pulgadas, pies, yardas
}
public class Longitud
{
    //Atributos
    private double cantidad;
    private UnidadLongiud unidad;

    //Constructores

    public Longitud(double cantidad, UnidadLongiud unidad)
    {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public Longitud(int cantidad, UnidadLongiud unidad)
    {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    //Propiedades

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public UnidadLongiud getUnidad()
    {
        return unidad;
    }

    //Métodos
    public double valorEnMetros()
    {
        double devolver=0;
        if (this.unidad==UnidadLongiud.metros)
        {
            devolver=this.cantidad;
        }
        else {
            if (this.unidad==UnidadLongiud.pulgadas)
            {
                devolver=this.cantidad*0.0254;
            }
            else
            {
                if (this.unidad==UnidadLongiud.pies)
                {
                    devolver=this.cantidad*0.3048;
                }
                else
                {
                    //solo queda que sean yardas
                    devolver=this.cantidad*0.9144;
                }
            }
        }
        return devolver;
    }

    @Override
    public String toString()
    {
        String devolver;
        devolver= String.format("%.2f", this.cantidad);
        if (this.unidad==UnidadLongiud.metros)
        {
            devolver=devolver+" m";
        }
        else {
            if (this.unidad==UnidadLongiud.pulgadas)
            {
                devolver=devolver+" in";
            }
            else
            {
                if (this.unidad==UnidadLongiud.pies)
                {
                    devolver=devolver+" ft";
                }
                else
                {
                    //solo queda que sean yardas
                    devolver=devolver+" yd";
                }
            }
        }
        return devolver;
    }


    //Operadores aritméticos:
    public Longitud add(Longitud longitud2)
    {
        Longitud devolver = new Longitud(this.cantidad,this.unidad);
        if(devolver.unidad == longitud2.unidad)
        {
            devolver.cantidad=devolver.cantidad+longitud2.cantidad;
        }
        else
        {
            if (devolver.unidad==UnidadLongiud.metros)
            {
                devolver.cantidad = devolver.cantidad + longitud2.valorEnMetros();
            }
            else
            {
                UnidadLongiud unidadTemporal = devolver.unidad;
                Double cantidadEnmetros = devolver.valorEnMetros()+longitud2.valorEnMetros();
                if (unidadTemporal==UnidadLongiud.pulgadas)
                {
                    devolver.cantidad=cantidadEnmetros*0.0254;
                }
                else
                {
                    if (unidadTemporal==UnidadLongiud.pies)
                    {
                        devolver.cantidad=cantidadEnmetros*0.3048;
                    }
                    else
                    {
                        //solo queda que sean yardas
                        devolver.cantidad=cantidadEnmetros*0.9144;
                    }
                }

            }

        }




        return devolver;
    }

    public Longitud substract(Longitud longitud2)
    {
        Longitud devolver = new Longitud(this.cantidad,this.unidad);
        if(devolver.unidad == longitud2.unidad)
        {
            devolver.cantidad=devolver.cantidad-longitud2.cantidad;
        }
        else
        {
            if (devolver.unidad==UnidadLongiud.metros)
            {
                devolver.cantidad = devolver.cantidad - longitud2.valorEnMetros();
            }
            else
            {
                UnidadLongiud unidadTemporal = devolver.unidad;
                Double cantidadEnmetros = devolver.valorEnMetros()-longitud2.valorEnMetros();
                if (unidadTemporal==UnidadLongiud.pulgadas)
                {
                    devolver.cantidad=cantidadEnmetros*0.0254;
                }
                else
                {
                    if (unidadTemporal==UnidadLongiud.pies)
                    {
                        devolver.cantidad=cantidadEnmetros*0.3048;
                    }
                    else
                    {
                        //solo queda que sean yardas
                        devolver.cantidad=cantidadEnmetros*0.9144;
                    }
                }

            }

        }




        return devolver;
    }

    public Longitud multiply(double n)
    {
        Longitud devolver = new Longitud(this.cantidad*n,this.unidad);
        return devolver;
    }
    public Longitud divide(double n)
    {
        Longitud devolver = new Longitud(this.cantidad/n,this.unidad);
        return devolver;
    }



    //Operaciones de comparación
    public boolean equals(Longitud longitud2)
    {
        boolean devolver = false;
        if (this.valorEnMetros()==longitud2.valorEnMetros())
        {
            devolver=true;
        }
        return devolver;
    }

    public int comparteTo(Longitud longitud2)
    {
        int devolver;

        if (this.valorEnMetros()==longitud2.valorEnMetros())
        {
            devolver=0;
        }
        else
        {
            if (this.valorEnMetros()<longitud2.valorEnMetros())
            {
                devolver=-1;
            }
            else
            {
                //solo queda que la nuestra sea mayor
                devolver=1;
            }
        }


        return devolver;
    }




}
