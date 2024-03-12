
package Practica_objetos_polimorficos;


public class CilindroRecto extends Cilindro{

    public CilindroRecto(){
        
    }

    public CilindroRecto(Circulo circuloBase, Colores color, double altura) {
        super(circuloBase, color, altura);
        this.setGeneratriz(altura);
    }

    
    //SobreEscribo estos metodos ya que quiero que si en algun momento el usuario cambia la altura o la generatriz
    //del objetos, es importante que como el ejercicio indica se mantengan iguales, por eso mismo solo pido la altura
    //en el constructor, para evitar que se generen objetos de este tipo con alturas y generatrices direrentes
    
    @Override
    public void setGeneratriz(double generatriz) { 
        super.setGeneratriz(generatriz); 
        super.setAltura(generatriz);
    }

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setGeneratriz(altura);
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
        sb.append("CilindroRecto: ");
        return sb.toString();
    }
    
    
    
}