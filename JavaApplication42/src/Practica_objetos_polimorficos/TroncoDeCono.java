
package Practica_objetos_polimorficos;


public class TroncoDeCono extends Cono{
    
    private Circulo circuloMenor;
    
    public TroncoDeCono(){
        
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
        return this.getCirculoBase().calcularArea()+this.circuloMenor.calcularArea()
                +Math.PI*(this.getCirculoBase().calcularArea()+this.circuloMenor.calcularArea())
                *this.getGeneratriz();
    } 

    @Override
    public double volumen() {
        double tercio = 1/3;
        return tercio*Math.PI*this.getAltura()*(Math.pow(this.getCirculoBase().getRadio(), 2))
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("TroncoDeCono: ");
        sb.append(" circuloMenor: ").append(circuloMenor);
        return sb.toString();
    }

    
    
    
    
    
    
}
