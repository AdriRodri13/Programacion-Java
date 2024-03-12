
package Practica_objetos_polimorficos;


public class CilindroOblicuo extends Cilindro{

    public CilindroOblicuo() {
    }
    
    public CilindroOblicuo(Colores color, double altura, Circulo circuloBase, double generatriz) {
        super(color, altura, circuloBase, generatriz);
    }
    
    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double volumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CilindroOblicuo: ");
        return sb.toString();
    }

}
