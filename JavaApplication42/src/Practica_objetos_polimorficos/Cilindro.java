
package Practica_objetos_polimorficos;


public abstract class Cilindro extends CuerpoGeometricoCircular{
    
    public Cilindro(){
        
    }
    
    public Cilindro(Circulo circuloBase, Colores color, double altura) {
        super(color, altura, circuloBase);
    }

    public Cilindro(Colores color, double altura, Circulo circuloBase, double generatriz) {
        super(color, altura, circuloBase, generatriz);
    }
    
    
    @Override
    public abstract double area();

    @Override
    public abstract double volumen();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cilindro: ");
        return sb.toString();
    }

    
    
    
    
}
