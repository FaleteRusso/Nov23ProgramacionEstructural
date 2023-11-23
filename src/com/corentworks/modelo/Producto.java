package com.corentworks.modelo;

import java.util.Objects;

public class Producto implements Comparable {
    private int id;
    private int cantidadExixtencias;
    private double precio;

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", cantidadExixtencias=" + cantidadExixtencias +
                ", precio=" + precio +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && cantidadExixtencias == producto.cantidadExixtencias && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidadExixtencias, precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadExixtencias() {
        return cantidadExixtencias;
    }

    public void setCantidadExixtencias(int cantidadExixtencias) {
        this.cantidadExixtencias = cantidadExixtencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto() {
    }

    public Producto(int id, int cantidadExixtencias, double precio) {
        this.id = id;
        this.cantidadExixtencias = cantidadExixtencias;
        this.precio = precio;
    }

    @Override
    public int compareTo(Object o) {
        Producto parametro=null;
        if (o instanceof Producto) {
           parametro = (Producto) o;
        }
if(precio>parametro.getPrecio()){
    //cambiar el orden de 1,0 y -1 da como resultado de mayor a menor o menor a mayor
    return 1;
} else if (precio==parametro.getCantidadExixtencias()) {
    return 0;
}else {
    return -1;
}
    }

    }

