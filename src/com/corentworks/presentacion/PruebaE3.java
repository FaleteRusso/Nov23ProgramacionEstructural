package com.corentworks.presentacion;

import java.util.Scanner;

public class PruebaE3 {
    public static void main(String[] args) {
        //si el ingresoanueal es <de 20k y no tiene vivienda impuesto 18%, si tiene 15%
        Scanner sc=new Scanner(System.in);
        System.out.println("ingresos");
        double ingreso = sc.nextDouble();
        boolean vivienda = sc.nextBoolean();
        double impuesto;
        if (ingreso<20_000&&vivienda==false){
            impuesto=ingreso*0.18;
            System.out.println("el impuesto es"+ impuesto);
        }else{
            impuesto=ingreso*0.15;
            System.out.println("el impuesto es" + impuesto);
        }
    }

}
