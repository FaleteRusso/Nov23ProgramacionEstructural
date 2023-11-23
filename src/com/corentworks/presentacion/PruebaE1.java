package com.corentworks.presentacion;

import java.util.Scanner;

public class PruebaE1 {
    public static void main(String[] args) {

        //pedir por la consola unb numero que representa la edad y decir si puede o no conducir
        Scanner sc=new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad >=18){
            System.out.println("puede conducir");
        }else {
            System.out.println("no puede conducir");
        }
    }
}
