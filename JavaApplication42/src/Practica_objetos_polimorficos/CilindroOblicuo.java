
package Practica_objetos_polimorficos;


public class CilindroOblicuo extends Cilindro{

    public CilindroOblicuo() {
    }
    
    public CilindroOblicuo(Colores color, double altura, Circulo circuloBase, double generatriz) {
        super(color, altura, circuloBase, generatriz);
    }
    
    
    //He utilizado otra formula a la que proporcionas ya que segun la pagina 
    //https://www.problemasyecuaciones.com/geometria3D/cilindro/calculadora-area-volumen-formulas-ejemplos-problemas.html
    //La formula correcta es: 2*PI*R*(R+generatriz), no 2*PI*R*generatriz que es la que proporcionas, con esta formula
    //el resultado me da bien, con la tuya no (Obviamente es posible que yo lo tenga mal)
    
    //@Override
    // public double area(){
    //     return 2*Math.PI*this.getCirucloBase().getRadio()*this.getGeneratriz;
    //}
    
    @Override
    public double area() {
        return 2*Math.PI*this.getCirculoBase().getRadio()*(this.getCirculoBase().getRadio()+this.getGeneratriz());
    }

    @Override
    public double volumen() {
        return this.getCirculoBase().calcularArea()*this.getAltura();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CilindroOblicuo: ");
        return sb.toString();
    }

}
