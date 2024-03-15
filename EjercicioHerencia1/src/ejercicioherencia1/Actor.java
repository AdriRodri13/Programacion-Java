
package ejercicioherencia1;


public abstract class Actor implements Contratable{
    
    private String nif;
    private String actor;
    private int edad;
    private Genero genero;
    private static double importeFijo;
    private static double importeHoras;
    
    public Actor(){
        
    }

    public Actor(String nif, String actor, int edad, Genero genero) {
        this.nif = nif;
        this.actor = actor;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static double getImporteFijo() {
        return importeFijo;
    }

    public static void setImporteFijo(double importeFijo) {
        Actor.importeFijo = importeFijo;
    }

    public static double getImporteHoras() {
        return importeHoras;
    }

    public static void setImporteHoras(double importeHoras) {
        Actor.importeHoras = importeHoras;
    }
    
    
    
    
}
