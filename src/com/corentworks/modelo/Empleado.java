package com.corentworks.modelo;

import java.util.Objects;

public class Empleado implements Comparable{
    private int id;
    private double sueldo;
    private String nombre;

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }

    public Empleado() {
    }

    public Empleado(int id, double sueldo, String nombre) {
        this.id = id;
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Double.compare(sueldo, empleado.sueldo) == 0 && Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sueldo, nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object o) {
        Empleado parametro = null;
        if (o instanceof Empleado){
            parametro=(Empleado)o;
        }
        return nombre.compareTo(parametro.getNombre());//para Strings usar este.
        /*if (sueldo>parametro.getSueldo()){
            return -1;
        } else if (sueldo== parametro.getSueldo()){
          return 0;
        }else {
            return 1;
        }
    */}
}
