package com.corentworks.presentacion;

import java.util.Scanner;

public class PruebaE4 {
    public static void main(String[] args) {
        //pedir un numero y decir que dia de la semana es
        Scanner sc = new Scanner(System.in);
        System.out.println("ponga un numero de 1 a 7");
        int numero= sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Lunes");;
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Tonto");
                break;
        }
    }
}
