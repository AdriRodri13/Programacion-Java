
package Practica_objetos_polimorficos;


public class PrismaRegularTriangular extends PrismaRegular{

    public PrismaRegularTriangular(){
        
    }
    
    public PrismaRegularTriangular(Colores color, double altura, double lado) {
        super(color, altura, lado);
    }

    @Override
    public double area() {
        return this.getLado()*(Math.sqrt(3)/2*this.getLado()+3*this.getAltura());
    }

    @Override
    public double volumen() {
        return Math.sqrt(3)/4 * Math.pow(this.getLado(), 2)*this.getAltura();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" PrismaRegularTriangular ");
        return sb.toString();
    }
    
    
    
    
}
