
package Practica_objetos_polimorficos;

import java.util.Scanner;


public abstract class PrismaRegular extends CuerpoGeometrico{
    
    private double lado;

    public PrismaRegular() {
    }

    public PrismaRegular(Colores color, double altura,double lado) {
        super(color, altura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public abstract double area();

    @Override
    public abstract double volumen();
    
    public void leer(){
        Scanner sc = new Scanner(System.in);
        double n;
        do{
            System.out.println("Introduce el valor del lado: ");
            System.out.print("-> ");
            n = sc.nextDouble();
            if(n<0){
                System.out.println("Introduce el valor valido (>0)");
            }
        }while(n<0);
        this.lado = n;
    }
    
}
