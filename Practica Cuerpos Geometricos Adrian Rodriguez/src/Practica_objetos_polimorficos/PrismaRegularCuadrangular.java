
package Practica_objetos_polimorficos;


public class PrismaRegularCuadrangular extends PrismaRegular{

    public PrismaRegularCuadrangular() {
    }
    
    public PrismaRegularCuadrangular(Colores color, double altura, double lado) {
        super(color, altura, lado);
    }
    
    @Override
    public double area() {
        return 2*this.getLado()*(this.getLado()+2*this.getAltura());
    }

    @Override
    public double volumen() {
        return Math.pow(this.getLado(), 2)*this.getAltura();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prisma Regular Cuadrangular");
        sb.append(super.toString());
        return sb.toString();
        
    }
    
    
    
}
