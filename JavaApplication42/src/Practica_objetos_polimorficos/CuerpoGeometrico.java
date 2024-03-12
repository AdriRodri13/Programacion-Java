
package Practica_objetos_polimorficos;

import java.util.Scanner;


public abstract class CuerpoGeometrico {
    
    private Colores color;
    private double altura;

    public CuerpoGeometrico() {
    }

    public CuerpoGeometrico(Colores color, double altura) {
        this.color = color;
        this.altura = altura;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void leer (){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Introduce el color:");
            System.out.println("\t1 -> Azul ");
            System.out.println("\t2 -> Blanco ");
            System.out.println("\t3 -> Rojo ");
            System.out.println("\t4 -> Verde ");
            System.out.print("-> ");
            
            n = sc.nextInt();
            if(n<1 || n > 4){
                System.out.println("Introduce una opcion valida");
            }
        }while(n<1 || n > 4);
        
        this.color= Colores.values()[n-1];
        
//        Otra opcion valida: 
//
//        switch (n){
//            case 1 -> this.color = Colores.AZUL;
//            case 2 -> this.color = Colores.BLANCO;
//            case 3 -> this.color = Colores.ROJO;
//            case 4 -> this.color = Colores.VERDE;
//        }

        do{
            System.out.print("Introduce la altura del poligono: ");
            this.altura = sc.nextDouble();
            if(altura < 0){
                System.out.println("Introduce una altura valida (>0)");
            }
        }while(altura<0);
        
    }
    
    public abstract double area();
    
    public abstract double volumen();
}
