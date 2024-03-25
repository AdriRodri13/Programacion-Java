package tienda.de.mascotas;

import java.util.Random;
import java.util.Scanner;

public class TiendaDeMascotas {

    public static Menu menu = new Menu();
    public static Tienda[] tienda;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        leerDatos();
        do{
            menu.mostrar();
            n = menu.leerOpcion();
            switch (n){
                case 1 -> mostrar();
                case 2 -> gestionarOfertas();
            }
        }while(n!=0);
    }
    
    public static void mostrar(){
        for (int i = 0; i < tienda.length; i++) {
            System.out.println(tienda[i].toString());
        }
    }
    
    public static void gestionarOfertas(){
        Random rnd = new Random();
        int n; 
        n = rnd.nextInt(0,tienda.length);
        if(tienda[n].enOferta()){
            if(tienda[n] instanceof Gato gato){
                gato.setOferta(false);
                tienda[n] = gato;
                System.out.println("Ya no está en oferta: ");
                System.out.println(tienda[n].toString());
            }
            
            if(tienda[n] instanceof Perro perro){
                perro.setOferta(false);
                tienda[n] = perro;
                System.out.println("Ya no está en oferta: ");
                System.out.println(tienda[n].toString());
            }
            
            if(tienda[n] instanceof Articulo articulo){
                articulo.setOferta(false);
                tienda[n] = articulo;
                System.out.println("Ya no está en oferta: ");
                System.out.println(tienda[n].toString());
            }
        }else{
            if(tienda[n] instanceof Gato gato){
                gato.setOferta(true);
                tienda[n] = gato;
            }
            
            if(tienda[n] instanceof Perro perro){
                perro.setOferta(true);
                tienda[n] = perro;
            }
            
            if(tienda[n] instanceof Articulo articulo){
                articulo.setOferta(true);
                tienda[n] = articulo;
            }
        }
    }

    @SuppressWarnings("empty-statement")
    public static void leerDatos() {
        int n, m = 0, codigo, indice = 0;
        double precio;
        String descripcion;
        boolean repetido = false;
        System.out.println("Introduce el numero de Objetos que va a tener la tienda ");

        do {
            System.out.print("-> ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Debe haber un minimo de un (1) articulo en la tienda ");
            }
        } while (n < 1);

        tienda = new Tienda[n];

        for (int i = 0; i < n; i++) {
            menu.mostrarCatalogo();
            m = menu.leerCatalogo();

            do {
                System.out.println("Introduce el codigo del articulo ");
                System.out.print("-> ");
                codigo = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (tienda[i] instanceof Animal animal) {
                        if (animal.getCodigo() == codigo) {
                            repetido = true;
                        }
                    }

                    if (tienda[i] instanceof Articulo articulo) {
                        if (articulo.getCodigo() == codigo) {
                            repetido = true;
                        }
                    }

                    if (repetido == true) {
                        System.out.println("El codigo ya existe, debes introducir otro");
                    } else {
                        repetido = false;
                    }
                }
            } while (repetido);

            do {
                System.out.println("Introduce el precio del objeto ");
                System.out.print("-> ");
                precio = sc.nextDouble();
                if (precio < 0.01) {
                    System.out.println("El precio debe ser minimo de 0.01");
                }
            } while (precio < 0.01);

            if (m == 3) {
                System.out.println("Introduce la descripcion del Articulo: ");
                System.out.print("-> ");
                descripcion = sc.nextLine();
                Articulo articulo = new Articulo(codigo, descripcion, precio);
                tienda[i] = articulo;
            } else {
                int r;
                if (m == 1) {
                    Perro perro = new Perro();
                    perro.setCodigo(codigo);
                    perro.setPrecio(precio);
                    
                    System.out.println("De que raza es el Perro: ");
                    System.out.println("""
                                       1-> Chihuahua
                                       2-> Boxer
                                       3-> Pastor Aleman
                                       4-> Labrador
                                       """);
                    r = comprobarRaza();
                    switch (r){
                        case(1) -> perro.setRaza(RazaPerro.CHIHUAHUA);
                        case(2) -> perro.setRaza(RazaPerro.BOXER);
                        case(3) -> perro.setRaza(RazaPerro.PASTORALEMAN);
                        case(4) -> perro.setRaza(RazaPerro.LABRADOR);
                    }
                    tienda[i] = perro;
                } else {
                    Gato gato = new Gato();
                    gato.setCodigo(codigo);
                    gato.setPrecio(precio);
                    
                    System.out.println("De que raza es el Gato: ");
                    System.out.println("""
                                       1-> Persa
                                       2-> Bobtail
                                       3-> Siames
                                       4-> Siberiano
                                       """);
                    r = comprobarRaza();
                    
                    switch (r){
                        case(1) -> gato.setRaza(RazaGato.PERSA);
                        case(2) -> gato.setRaza(RazaGato.BOBTAIL);
                        case(3) -> gato.setRaza(RazaGato.SIAMES);
                        case(4) -> gato.setRaza(RazaGato.SIBERIANO);
                    }
                    tienda[i] = gato;
                }
            }

        }

    }

    public static int comprobarRaza() {
        int r;
        do {
            System.out.println("-> ");
            r = sc.nextInt();
            if (r < 1 || r > 4) {
                System.out.println("Introduce una opcion valida");
            }
        } while (r < 1 || r > 4);
        return r;
    }
}
