
package Practica_objetos_polimorficos;


public class CilindroRecto extends Cilindro{

    public CilindroRecto(){
        
    }

    public CilindroRecto(Circulo circuloBase, Colores color, double altura) {
        super(circuloBase, color, altura);
        this.setGeneratriz(altura);
    }
    
    @Override
    public double area() {
        return 2*Math.PI*this.getCirculoBase().getRadio()*this.getAltura() + 2*this.getCirculoBase().calcularArea();
    }

    @Override
    public double volumen() {
        return this.getCirculoBase().calcularArea()*this.getAltura();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cilindro Recto ");
        sb.append(super.toString());
        return sb.toString();
    }
    
    
    
}
