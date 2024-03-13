
package Practica_objetos_polimorficos;

//Hay algunas formulas que he decidido cambiar, aunque está indicado en alguna clase la pagina que he usado es: 
//https://www.problemasyecuaciones.com/geometria3D/volumen/tronco/cono/calculadora-area-volumen-formula-demostracion.html
//He decidido cambiarlas ya que algunas me resultaban mas comodas y el resultado es el mismo

import java.util.ArrayList;
import java.util.Scanner;



public class CodigoEjecutable {
    static Menu menu = new Menu();
    static ArrayList<CuerpoGeometrico> cuerpos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        do{
            menu.mostrar();
            n = menu.leer();
            
            switch (n){
                case(1) -> nuevoCuerpoGeometrico();
            }
        }while(n!=0);
    }
    
    public static void nuevoCuerpoGeometrico(){
        int n, contador=0;
        CuerpoGeometrico c=null;
        do{
            menu.nuevoCuerpo();
            n = menu.selecNuevoCuerpo();
            
            switch (n){
                case(1) -> c = crearPrismaTriangular();
                case(2) -> c = crearPrismaCuadrangular();
                case(3) -> c = crearCilindroRecto();
                case(4) -> c = crearCilindroOblicuo();
                case(5) -> c = crearCono();
                case(6) -> c = crearTroncoDeCono();
            }
            contador++;
        }while(n!=0 && contador == 0);
        if(!cuerpos.contains(c)){
            cuerpos.add(c);
            System.out.println(cuerpos);
        }else{
            System.out.println("====ESTE CUERPO YA EXISTE====");
            
        }
    }
    
    public static PrismaRegularTriangular crearPrismaTriangular(){
        System.out.println("\n=====Has decidido Crear un Prisma Regular Triangular=====");
        PrismaRegularTriangular t = new PrismaRegularTriangular();
        t.leer();
        return t;
    }
    
    public static PrismaRegularCuadrangular crearPrismaCuadrangular(){
        System.out.println("\n=====Has decidido Crear un Prisma Regular Cuadrangular=====");
        PrismaRegularCuadrangular t = new PrismaRegularCuadrangular();
        t.leer();
        return t;
    }
    
    public static CilindroRecto crearCilindroRecto(){
        System.out.println("\n=====Has decidido Crear un Cilindro Recto=====");
        CilindroRecto c = new CilindroRecto();
        c.leer();
        Circulo circuloBase = crearCirculo();
        c.setCirculoBase(circuloBase);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));
        
        return c;
    }
    
    public static CilindroOblicuo crearCilindroOblicuo(){
        System.out.println("\n=====Has decidido Crear un Cilindro Oblicuo=====");
        CilindroOblicuo c = new CilindroOblicuo();
        c.leer();
        Circulo circuloBase = crearCirculo();
        c.setCirculoBase(circuloBase);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));
        
        return c;
    }
    
    public static Cono crearCono(){
        System.out.println("\n=====Has decidido Crear un Cono=====");
        Cono c = new Cono();
        c.leer();
        Circulo circuloBase = crearCirculo();
        c.setCirculoBase(circuloBase);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));
        
        return c;
    }
    
    public static TroncoDeCono crearTroncoDeCono(){
        System.out.println("\n=====Has decidido Crear un Tronco De Cono=====");
        TroncoDeCono c = new TroncoDeCono();
        c.leer();
        System.out.println("====Creamos el circulo base====");
        Circulo circuloBase = crearCirculo();
        System.out.println("====Creamos el circulo pequeño====");
        Circulo circuloPequeño;
        do{
            circuloPequeño = crearCirculo();
            if(circuloPequeño.getRadio()>circuloBase.getRadio()){
                System.out.println("El radio del circulo pequeño OBVIAMENTE debe de ser menor que el del circulo base");
            }
        }while(circuloPequeño.getRadio()>circuloBase.getRadio());
        
        c.setCirculoBase(circuloBase);
        c.setCirculoMenor(circuloPequeño);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));
        
        return c;
    }
    
    public static Circulo crearCirculo(){
        System.out.println("\n===Hay que crear un circulo para el objeto que estás creando===");
        double n;
        System.out.println("Introduce el radio del circulo: ");
        do{
            System.out.print("-> ");
            n=sc.nextDouble();
            if(n<0){
                System.out.println("Introduce un valor valido (>0)");
            }
        }while(n<0);
        Circulo c = new Circulo(n);
        return c;
    }
    
    public static double leerGeneratriz(double altura){
        double g;
        boolean b=false;
        do{
            do{
                System.out.println("Introduce el valor de la generatriz");
                System.out.print("-> ");
                g=sc.nextDouble();
                if(g<=0){
                    System.out.println("El valor debe de ser positivo");
                }
            }while(g<=0);
            if(altura > g){
                System.out.println("La generatriz debe de ser SIEMPRE mayor o igual a la altura");
                b=false;
            }else{
                b=true;
            }
        }while(!b);
        return g;
    }
    
    
    
    
    
}
