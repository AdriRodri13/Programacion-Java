package Practica_objetos_polimorficos;

import java.util.Objects;

public class TroncoDeCono extends Cono {

    private Circulo circuloMenor;

    public TroncoDeCono() {

    }

    public TroncoDeCono(Colores color, double altura, Circulo circuloBase, double generatriz, Circulo circuloMenor) {
        super(color, altura, circuloBase, generatriz);
        this.circuloMenor = new Circulo(circuloMenor);
    }

    public Circulo getCirculoMenor() {
        return circuloMenor;
    }

    public void setCirculoMenor(Circulo circuloMenor) {
        this.circuloMenor = circuloMenor;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(this.getCirculoBase().getRadio(), 2) + Math.pow(this.getCirculoMenor().getRadio(), 2)
                + this.getGeneratriz() * (this.getCirculoBase().getRadio() + this.getCirculoMenor().getRadio()));
    }

    @Override
    public double volumen() {
        return this.getAltura() * Math.PI / 3 * (Math.pow(this.getCirculoBase().getRadio(), 2) + Math.pow(this.getCirculoMenor().getRadio(), 2)
                + this.getCirculoBase().getRadio() * this.getCirculoMenor().getRadio());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tronco De Cono ");
        sb.append("Color ").append(this.getColor());
        sb.append(" Altura: ").append(this.getAltura());
        sb.append("Radio del circulo base: ").append(this.getCirculoBase().getRadio());
        sb.append(" Generatriz: ").append(this.getGeneratriz());
        sb.append(" Radio del circulo menor: ").append(this.circuloMenor.getRadio());
        sb.append(" Area: ").append(String.format("%.2f", this.area()));
        sb.append(" Volumen: ").append(String.format("%.2f", this.volumen()));
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.circuloMenor);
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
            final TroncoDeCono other = (TroncoDeCono) obj;
            return Objects.equals(this.circuloMenor, other.circuloMenor);
        } else {
            return false;
        }

    }

}
