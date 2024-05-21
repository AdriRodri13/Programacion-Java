package repaso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Repaso {

    static TreeSet<Ordenador> tr = new TreeSet<>();

    public static void main(String[] args) {
        altaOrdenadores();
        mostrarOrdenadores();
        crearFicheroTexto();
        modificarFicheroTexto();
        crearFicheroBinario();
        mostrarFicheroBinario();
        copiaSeguridad();
        mostrarCopiaSeguridad();
    }

    public static void altaOrdenadores() {
        int n;
        do {
            do{
                n = leerEntero();
            }while(!comprobarNumeroSerie(n));
            if(!(n==0)){
                Ordenador o = new Ordenador();
                o.setNs(n);
                o.setProcesador(elegirProcesador());
                o.setRam(leerEntero());
                o.setPrecio(leerDouble());
            }else{
                System.out.println("Introduccion de ordenadores finalizada");
            }
            
        } while (n != 0);
    }
    
    public static void mostrarOrdenadores(){
        System.out.println("Ordenadores ordenados por numero de serie");
        recorrerCollection(tr);
        
        System.out.println("Ordenadore ordenador por precio: ");
        ArrayList<Ordenador> copia = copiarSet(tr);
        recorrerCollection(copia);
        
    }
    
    public static void recorrerCollection(Collection o){
        for (Object a:o) {
            System.out.println(a.toString());
        }
    }
    
    public static void mostrarProcesadores(){
        TreeSet<Procesador> p = new TreeSet();
        for (Ordenador o:tr) {
            p.add(o.getProcesador());
        }
        System.out.println(p);
    }
    
    public static void contarProcesadores(){
        
    }

    public static boolean comprobarNumeroSerie(int n) {
        Ordenador o = new Ordenador();
        o.setNs(n);
        if(tr.contains(o)){
            return true;
        }else{
            System.out.println("Un ordenador ya utiliza este numero de serie, usa otro");
            return false;
        }
    }
    
    public static Procesador elegirProcesador(){
        int n;
        System.out.println("Introduce el procesador que desea para su ordenador");
        System.out.println("""
                           1-> I3
                           2-> I5
                           3-> I7
                           4-> I9
                           """);
        
        do{
            n = leerEntero();
            if(n>4){
                System.out.println("Introduce una cifra valida, de 1 a 4");
            }
        }while(n<1 || n>4);
        
        return switch(n){
            case 1 -> Procesador.I3;
            case 2 -> Procesador.I5;
            case 3 -> Procesador.I7;
            case 4 -> Procesador.I9;
            default -> Procesador.I3;
        };
    }

    public static int leerEntero() {
        int n=0;
        boolean correcto;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                correcto = true;
                do {
                    System.out.print("numero -> ");
                    n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Debes introducir un numero entero");
                        correcto = false;
                    }
                } while (n < 1);
            } catch (InputMismatchException ex) {
                correcto = false;
                sc.nextLine();
                System.out.println("Debes introducir un numero entero");
            }
        } while (!correcto);
        return n;
    }
    
    public static double leerDouble() {
        double n=0;
        boolean correcto;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                correcto = true;
                do {
                    System.out.print("numero -> ");
                    n = sc.nextDouble();
                    if (n < 1) {
                        System.out.println("Debes introducir un numero entero");
                        correcto = false;
                    }
                } while (n < 1);
            } catch (InputMismatchException ex) {
                correcto = false;
                sc.nextLine();
                System.out.println("Debes introducir un numero double");
            }
        } while (!correcto);
        return n;
    }
    
    public static ArrayList<Ordenador> copiarSet(TreeSet<Ordenador> tr){
        ArrayList <Ordenador> copia = new ArrayList<>();
        for (Ordenador o:tr) {
            copia.add(o);
        }
        Collections.sort(copia, new Comparator<Ordenador>() {
            @Override
            public int compare(Ordenador o1, Ordenador o2) {
                return Double.compare(o1.getPrecio(), o2.getPrecio());
            }
        });
        return copia;
    }

}
