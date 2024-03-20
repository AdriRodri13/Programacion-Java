
package Practica_objetos_polimorficos;


public class Cono extends CuerpoGeometricoCircular{

    public Cono() {
    }

    public Cono(Colores color, double altura, Circulo circuloBase, double generatriz) {
        super(color, altura, circuloBase, generatriz);
    }
    
    @Override
    public double area() {
        return this.getCirculoBase().calcularArea()+Math.PI*this.getCirculoBase().getRadio()*this.getGeneratriz();
    }
    

    @Override
    public double volumen() {
        double tercio = 1.0/3.0;
        return this.getCirculoBase().calcularArea()*tercio*this.getAltura();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cono");
        sb.append(super.toString());
        sb.append(" Area: ").append(String.format("%.2f", this.area()));
        sb.append(" Volumen: ").append(String.format("%.2f", this.volumen()));
        return sb.toString();
    }
    
    
    
}
