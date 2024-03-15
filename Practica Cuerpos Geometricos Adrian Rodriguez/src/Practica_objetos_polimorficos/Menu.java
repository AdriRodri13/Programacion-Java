
package Practica_objetos_polimorficos;

import java.util.Scanner;


public class Menu {
    public Menu(){
        
    }
    
    public void mostrar(){
        System.out.println("""
                           1 -> Nuevo Cuerpo Geometrico
                           2 -> Mostrar Todos
                           3 -> Mostrar Prismas
                           4 -> Mostrar Circulares
                           0 -> Salir
                           """);
    }
    
    public int leer(){
        Scanner sc = new Scanner (System.in);
        int n;
        do{
            System.out.println("Introduce una opcion del menu ");
            System.out.print("-> ");
            n = sc.nextInt();
            if(n<0 || n > 4){
                System.out.println("Introduce una opcion valida (Entre 0 y 4)");
            }
        }while(n<0 || n > 4);
        return n;
    }
    
    public void nuevoCuerpo(){
        System.out.println("Que tipo de cuerpo quieres generar? ");
        System.out.println("""
                           1 -> Prisma Regular Triangular
                           2 -> Prisma Regular Cuadrangular
                           3 -> Cilindro Recto
                           4 -> Cilindro Oblicuo
                           5 -> Cono
                           6 -> Tronco de Cono
                           0 -> Ninguno, me he equivocado
                           """);
    }
    
    public int selecNuevoCuerpo(){
        Scanner sc = new Scanner (System.in);
        int n;
        do{
            System.out.println("Introduce una opcion del menu ");
            System.out.print("-> ");
            n = sc.nextInt();
            if(n<0 || n > 6){
                System.out.println("Introduce una opcion valida (Entre 0 y 4)");
            }
        }while(n<0 || n > 6);
        return n;
    }
}
