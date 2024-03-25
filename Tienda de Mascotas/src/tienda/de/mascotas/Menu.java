package tienda.de.mascotas;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("1. Mostrar");
        System.out.println("2. Ofertas");
        System.out.println("0. FIN");
    }

    public int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 2);
        sc.nextLine();
        return opcion;
    }
    
    public void mostrarCatalogo(){
        System.out.println("1. Perros");
        System.out.println("2. Gatos");
        System.out.println("3. Articulos");
    }
    
    public int leerCatalogo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        sc.nextLine();
        return opcion;
    }
}
