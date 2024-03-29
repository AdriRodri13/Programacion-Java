
package Practica_objetos_polimorficos;


public class Circulo {
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public Circulo(Circulo circulo){
        this.radio=circulo.getRadio();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo: ");
        sb.append(" radio: ").append(radio);
        return sb.toString();
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.radio) ^ (Double.doubleToLongBits(this.radio) >>> 32));
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
        final Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio);
    }
    
    
}
