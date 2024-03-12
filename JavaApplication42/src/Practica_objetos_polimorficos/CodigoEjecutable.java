
package Practica_objetos_polimorficos;


public class CodigoEjecutable {

    public static void main(String[] args) {
        PrismaRegularTriangular triangulo = new PrismaRegularTriangular();
        triangulo.setAltura(15);
        triangulo.setColor(Colores.ROJO);
        triangulo.setLado(10);
        System.out.println(triangulo.area());
        System.out.println(triangulo.volumen());
    }
    
}
