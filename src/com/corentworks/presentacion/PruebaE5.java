package com.corentworks.presentacion;

import java.util.Scanner;

public class PruebaE5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("que años tiene tu Coche");
        double anios= sc.nextDouble();
        if (anios<2){
            System.out.println("Exentos");
        } else if (anios>=2&&anios<5) {
            System.out.println("Anual");
        }else{


            System.out.println("Semestral");
        }
    }
}
