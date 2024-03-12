
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
    public double volumen() {
        return super.volumen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double area() {
        return super.area(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
