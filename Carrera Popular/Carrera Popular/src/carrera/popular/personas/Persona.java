
package carrera.popular.personas;


public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(Persona persona){
        this.edad = persona.getEdad();
        this.nombre = persona.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: ");
        sb.append("nombre: ").append(nombre);
        sb.append(" edad: ").append(edad);
        return sb.toString();
    }
    
    
    
    
}
