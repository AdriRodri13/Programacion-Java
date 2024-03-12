
package Practica_objetos_polimorficos;


public class PrismaRegularTriangular extends PrismaRegular{

    public PrismaRegularTriangular(){
        
    }
    
    public PrismaRegularTriangular(Colores color, double altura, double lado) {
        super(color, altura, lado);
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
        sb.append(" PrismaRegularTriangular ");
        return sb.toString();
    }
    
    
    
    
}
