package com.company;

import java.util.Scanner;

public class Main
{
                      //numeros impares entre el 1 y el 10
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double i;

        i = 1;
        while(i <= 10)
        {
            if(i % 2 == 0)
            {
                i = i + 1;
            }
            else
            {
                System.out.println(i);
                i = i + 1;
            }
        }
    }
}
