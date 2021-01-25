package com.company;

import java.util.Scanner;

public class Main
{
 //Escribe una función potencia2 que te devuelva la potencia de 2 del número que le pasas por parámetro (ambos enteros).
 // El valor del parámetro tendrá que ser 0 (un caso especial) o un número positivo. Si se le manda un número negativo,
 // la función devolverá -1. No se podrá utilizar la función Math.pow() (evidentemente).
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n");
        n = sc.nextInt();
        System.out.println(potencia2(n));

    }
    public static int potencia2(int n)
    {
        int resultado = 1;
      if(n == 0)
      {
          return 1;
      }
      else
      {
          if(n<0)
          {
              return -1;
          }
          else
          {
              for(int i=1; i<=n;i++)
              {
                  resultado = resultado * 2;
              }
              return resultado;
          }
      }
    }
}
