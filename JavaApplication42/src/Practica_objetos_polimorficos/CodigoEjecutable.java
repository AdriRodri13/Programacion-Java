
package Practica_objetos_polimorficos;


public class CodigoEjecutable {

    public static void main(String[] args) {
        Circulo circuloBase = new Circulo(5);
        CilindroOblicuo cilindro = new CilindroOblicuo(Colores.AZUL,10,circuloBase,5);
        
        System.out.println(cilindro.area());
        System.out.println(cilindro.volumen());
    }
    
}
