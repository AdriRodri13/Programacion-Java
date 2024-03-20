package Practica_objetos_polimorficos;

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
