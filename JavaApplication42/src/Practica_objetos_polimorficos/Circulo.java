
package Practica_objetos_polimorficos;


public class Circulo {
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio=radio;
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
        
    }
    
    
}
