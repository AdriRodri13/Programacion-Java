package Practica_objetos_polimorficos;

import static Practica_objetos_polimorficos.CodigoEjecutable.sc;
import java.util.Objects;

public abstract class CuerpoGeometricoCircular extends CuerpoGeometrico {

    private Circulo circuloBase;
    private double generatriz;

    public CuerpoGeometricoCircular() {

    }

    public CuerpoGeometricoCircular(Colores color, double altura, Circulo circuloBase) {
        super(color, altura);
        this.circuloBase = new Circulo(circuloBase);
    }

    public CuerpoGeometricoCircular(Colores color, double altura, Circulo circuloBase, double generatriz) {
        super(color, altura);
        this.circuloBase = new Circulo(circuloBase);
        this.generatriz = generatriz;
    }

    public Circulo getCirculoBase() {
        return circuloBase;
    }

    public void setCirculoBase(Circulo circuloBase) {
        this.circuloBase = circuloBase;
    }

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }
    
    public void leerGeneratriz(double altura) {
        double g;
        boolean b = false;
        do {
            do {
                System.out.println("Introduce el valor de la generatriz");
                System.out.print("-> ");
                g = sc.nextDouble();
                if (g <= 0) {
                    System.out.println("El valor debe de ser positivo");
                }
            } while (g <= 0);
            if (altura > g) {
                System.out.println("La generatriz debe de ser SIEMPRE mayor o igual a la altura");
                b = false;
            } else {
                b = true;
            }
        } while (!b);
        this.generatriz = g;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double volumen();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Radio circulo base: ").append(this.getCirculoBase().getRadio());
        sb.append(" Generatriz: ").append(this.generatriz);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.circuloBase);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.generatriz) ^ (Double.doubleToLongBits(this.generatriz) >>> 32));
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
            final CuerpoGeometricoCircular other = (CuerpoGeometricoCircular) obj;
            if (Double.doubleToLongBits(this.generatriz) != Double.doubleToLongBits(other.generatriz)) {
                return false;
            }
            return Objects.equals(this.circuloBase, other.circuloBase);
        } else {
            return false;
        }

    }

}
