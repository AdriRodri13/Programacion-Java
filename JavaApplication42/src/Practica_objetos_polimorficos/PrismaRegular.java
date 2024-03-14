package Practica_objetos_polimorficos;

import java.util.Scanner;

public abstract class PrismaRegular extends CuerpoGeometrico {

    private double lado;

    public PrismaRegular() {
    }

    public PrismaRegular(Colores color, double altura, double lado) {
        super(color, altura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double volumen();

    @Override
    public void leer() {
        super.leer();
        Scanner sc = new Scanner(System.in);
        double n;
        do {
            System.out.println("Introduce el valor del lado: ");
            System.out.print("-> ");
            n = sc.nextDouble();
            if (n < 0) {
                System.out.println("Introduce el valor valido (>0)");
            }
        } while (n < 0);
        this.lado = n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Lado: ").append(this.getLado());
        sb.append(" Area: ").append(String.format("%.2f", this.area()));
        sb.append(" Volumen: ").append(String.format("%.2f", this.volumen()));
        return sb.toString();
    }

    


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.lado) ^ (Double.doubleToLongBits(this.lado) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final PrismaRegular other = (PrismaRegular) obj;
            return Double.doubleToLongBits(this.lado) == Double.doubleToLongBits(other.lado);
        } else {
            return false;
        }

    }

}
