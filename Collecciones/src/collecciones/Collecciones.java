
package collecciones;

import java.util.HashSet;


public class Collecciones {

    
    public static void main(String[] args) {
       
        HashSet <Persona> h = new HashSet<>();
        Persona e = new Persona();
        Persona a = new Persona();
        Persona b = new Persona();
        
        e.setId("1");
        a.setId("2");

        
        System.out.println(h.add(e));
        
        System.out.println(h.add(a));

        
        System.out.println(h);
        
    }
    
}
