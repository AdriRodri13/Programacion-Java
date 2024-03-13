
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
        return Math.PI*(Math.pow(this.getCirculoBase().getRadio(), 2)+Math.pow(this.getCirculoMenor().getRadio(), 2)+
                this.getGeneratriz()*(this.getCirculoBase().getRadio()+this.getCirculoMenor().getRadio()));
    } 

    @Override
    public double volumen() {
        return this.getAltura()*Math.PI/3*(Math.pow(this.getCirculoBase().getRadio(), 2)+Math.pow(this.getCirculoMenor().getRadio(), 2)
                +this.getCirculoBase().getRadio()*this.getCirculoMenor().getRadio());
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
