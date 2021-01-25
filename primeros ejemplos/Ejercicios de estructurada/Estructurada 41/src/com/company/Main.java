package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, divisor, resto, divisores, i;

        numero = 2;

        while (numero <= 1000)
        {
            divisor = 1;
            divisores = 0;

            while (divisor <= numero)
            {
                resto = numero % divisor;
                if (resto == 0)
                {
                    divisores = divisores + 1;
                }
                divisor = divisor + 1;
            }
            if (divisores < 3)
            {
                System.out.println(numero);
            }
            numero = numero + 1;
        }
    }
}
