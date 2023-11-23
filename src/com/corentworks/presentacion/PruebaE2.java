package com.corentworks.presentacion;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PruebaE2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ingresos");
        float ingreso = sc.nextFloat();
        System.out.println("hijos");
        int hijos = sc.nextInt();
        if (ingreso<19_000&&hijos>=2){
            System.out.println("recibe ayuda, viva el comunismo");
        }else {
            System.out.println("no tiene ayuda, magnate");
        }
    }


}
