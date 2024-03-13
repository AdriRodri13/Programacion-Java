
package Practica_objetos_polimorficos;


public abstract class CuerpoGeometricoCircular extends CuerpoGeometrico{
    
    private Circulo circuloBase;
    private double generatriz;
    
    public CuerpoGeometricoCircular(){
        
    }

    public CuerpoGeometricoCircular(Colores color, double altura, Circulo circuloBase) {
        super(color, altura);
        this.circuloBase = new Circulo(circuloBase);
    }
 

    public CuerpoGeometricoCircular( Colores color, double altura,Circulo circuloBase, double generatriz) {
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
        sb.append("CuerpoGeometricoCircular: ");
        sb.append("circuloBase: ").append(circuloBase);
        sb.append(" generatriz: ").append(generatriz);
        return sb.toString();
    }
    
    
    
}
