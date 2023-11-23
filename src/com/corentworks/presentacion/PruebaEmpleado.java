package com.corentworks.presentacion;

import com.corentworks.modelo.Empleado;

import java.util.TreeSet;

public class PruebaEmpleado {
    public static void main(String[] args) {
        TreeSet<Empleado>sueloOrden=new TreeSet<>();
        sueloOrden.add(new Empleado(1,1_500,"Antonio"));
        sueloOrden.add(new Empleado(1,2_300,"Marga"));
        sueloOrden.add(new Empleado(1,1_780,"Pedro"));
        System.out.println(sueloOrden);

    }
}
