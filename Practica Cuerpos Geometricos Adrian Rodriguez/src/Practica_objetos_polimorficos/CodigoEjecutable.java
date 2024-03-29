package Practica_objetos_polimorficos;

//Hay algunas formulas que he decidido cambiar, aunque está indicado en alguna clase la pagina que he usado es: 
//https://www.problemasyecuaciones.com/geometria3D/volumen/tronco/cono/calculadora-area-volumen-formula-demostracion.html
//He decidido cambiarlas ya que algunas me resultaban mas comodas y el resultado es el mismo
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodigoEjecutable {

    static Menu menu = new Menu();
    static ArrayList<CuerpoGeometrico> cuerpos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            menu.mostrar();
            n = menu.leer();

            switch (n) {
                case 1 -> nuevoCuerpoGeometrico();
                case 2 -> mostrarTodos();
                case 3 -> mostrarPrismas();
                case 4 -> mostrarCirculares();
            }
        } while (n != 0);
    }

    public static void nuevoCuerpoGeometrico() {
        int n, contador = 0;
        CuerpoGeometrico c = null;
        do {
            menu.nuevoCuerpo();
            n = menu.selecNuevoCuerpo();

            switch (n) {
                case 1, 2 -> c = crearPrisma(n);
                case 3, 4 -> c = crearCilindro(n);
                case    5 -> c = crearCono();
                case    6 -> c = crearTroncoDeCono();
            }
            contador++;
        } while (n != 0 && contador == 0);
        if (!cuerpos.contains(c)) {
            cuerpos.add(c);
        } else {
            System.out.println("====ESTE CUERPO YA EXISTE====");

        }
    }

    public static void mostrarTodos() {
        if (!cuerpos.isEmpty()) {
            Collections.sort(cuerpos);
            for (CuerpoGeometrico c : cuerpos) {
                System.out.println(c.toString());
            }
        } else {
            System.out.println("====NO HAY NINGUN OBJETO====");
        }

    }

    public static void mostrarPrismas() {
        if (!cuerpos.isEmpty()) {
            int n = 0;
            Collections.sort(cuerpos, (CuerpoGeometrico o1, CuerpoGeometrico o2) -> Double.compare(o1.area(), o2.area()));
            System.out.println("\n====Mostramos Prismas Regulares Triangulares====");
            for (CuerpoGeometrico c : cuerpos) {
                if (c instanceof PrismaRegularTriangular) {
                    System.out.println(c);
                    n++;
                }
            }
            if (n == 0) {
                System.out.println("===No Hay Ningun Prisma Regular Triangular===");
            }
            n = 0;

            Collections.sort(cuerpos, (CuerpoGeometrico o1, CuerpoGeometrico o2) -> Double.compare(o1.volumen(), o2.volumen()));
            System.out.println("\n====Mostramos Prismas Regulares Cuadrangular====");
            for (CuerpoGeometrico c : cuerpos) {
                if (c instanceof PrismaRegularCuadrangular) {
                    System.out.println(c);
                    n++;
                }
            }

            if (n == 0) {
                System.out.println("===No Hay Ningun Prisma Regular Cuadrangular===");
            }
        } else {
            System.out.println("====NO HAY NINGUN OBJETO====");
        }

    }

    public static void mostrarCirculares() {
        if (!cuerpos.isEmpty()) {
            int n = 0;
            Collections.sort(cuerpos, (CuerpoGeometrico o1, CuerpoGeometrico o2) -> Double.compare(o2.area(), o1.area()));
            System.out.println("\n====Mostramos Cilindros====");
            for (CuerpoGeometrico c : cuerpos) {
                if (c instanceof Cilindro) {
                    System.out.println(c);
                    n++;
                }
            }
            if (n == 0) {
                System.out.println("===No Hay Ningun Cilindro===");
            }
            n = 0;

            Collections.sort(cuerpos, (CuerpoGeometrico o1, CuerpoGeometrico o2) -> Double.compare(o2.volumen(), o1.volumen()));
            System.out.println("\n====Mostramos Conos====");
            for (CuerpoGeometrico c : cuerpos) {
                if (c instanceof Cono) {
                    System.out.println(c);
                    n++;
                }
            }

            if (n == 0) {
                System.out.println("===No Hay Ningun Cono===");
            }
        } else {
            System.out.println("====NO HAY NINGUN OBJETO====");
        }

    }

    public static PrismaRegular crearPrisma(int n) {
        PrismaRegular t;
        if (n == 1) {
            System.out.println("\n=====Has decidido Crear un Prisma Regular Triangular=====");
            t = new PrismaRegularTriangular();
        } else {
            System.out.println("\n=====Has decidido Crear un Prisma Regular Cuadrangular=====");
            t = new PrismaRegularCuadrangular();
        }
        t.leer();
        return t;
    }

    public static Cilindro crearCilindro(int n) {
        Cilindro c;
        if (n == 3) {
            System.out.println("\n=====Has decidido Crear un Cilindro Recto=====");
            c = new CilindroRecto();
        } else {
            System.out.println("\n=====Has decidido Crear un Cilindro Oblicuo=====");
            c = new CilindroOblicuo();
        }

        c.leer();
        Circulo circuloBase = crearCirculo();
        c.setCirculoBase(circuloBase);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));

        return c;
    }

    public static Cono crearCono() {
        System.out.println("\n=====Has decidido Crear un Cono=====");
        Cono c = new Cono();
        c.leer();
        Circulo circuloBase = crearCirculo();
        c.setCirculoBase(circuloBase);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));

        return c;
    }

    public static TroncoDeCono crearTroncoDeCono() {
        System.out.println("\n=====Has decidido Crear un Tronco De Cono=====");
        TroncoDeCono c = new TroncoDeCono();
        c.leer();
        System.out.println("====Creamos el circulo base====");
        Circulo circuloBase = crearCirculo();
        System.out.println("====Creamos el circulo pequeño====");
        Circulo circuloPequeño;
        do {
            circuloPequeño = crearCirculo();
            if (circuloPequeño.getRadio() > circuloBase.getRadio()) {
                System.out.println("El radio del circulo pequeño OBVIAMENTE debe de ser menor que el del circulo base");
            }
        } while (circuloPequeño.getRadio() > circuloBase.getRadio());

        c.setCirculoBase(circuloBase);
        c.setCirculoMenor(circuloPequeño);
        c.setGeneratriz(leerGeneratriz(c.getAltura()));

        return c;
    }

    public static Circulo crearCirculo() {
        System.out.println("\n===Hay que crear un circulo para el objeto que estás creando===");
        double n;
        System.out.println("Introduce el radio del circulo: ");
        do {
            System.out.print("-> ");
            n = sc.nextDouble();
            if (n < 0) {
                System.out.println("Introduce un valor valido (>0)");
            }
        } while (n < 0);
        Circulo c = new Circulo(n);
        return c;
    }

    public static double leerGeneratriz(double altura) {
        double g;
        boolean b = false;
        do {
            do {
                System.out.println("Introduce el valor de la generatriz");
                System.out.print("-> ");
                g = sc.nextDouble();
                if (g <= 0) {
                    System.out.println("El valor debe de ser positivo");
                }
            } while (g <= 0);
            if (altura > g) {
                System.out.println("La generatriz debe de ser SIEMPRE mayor o igual a la altura");
                b = false;
            } else {
                b = true;
            }
        } while (!b);
        return g;
    }

}
