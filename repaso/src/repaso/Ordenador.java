/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dania
 */
public class Ordenador implements Comparable<Ordenador>{
    
    private int ns;
    private Procesador procesador;
    private int Ram;
    private double precio;

    public Ordenador() {
    }

    public Ordenador(int ns, Procesador procesador, int Ram, double precio) {
        this.ns = ns;
        this.procesador = procesador;
        this.Ram = Ram;
        this.precio = precio;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.ns;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordenador other = (Ordenador) obj;
        return this.ns == other.ns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordenador con ");
        sb.append("ns: ").append(ns);
        sb.append(" precio: ").append(precio);
        return sb.toString();
    }

    @Override
    public int compareTo(Ordenador o) {
        return Integer.compare(this.ns, o.getNs());
    }
    
    
}
