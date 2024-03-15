
package ejercicioherencia1;


public class Profesional extends Actor{
    
    private int numeroDeRepresentaciones;
    
    public Profesional(){
        
    }

    public Profesional(String nif, String actor, int edad, Genero genero, int numeroDeRepresentaciones) {
        super(nif, actor, edad, genero);
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    public int getNumeroDeRepresentaciones() {
        return numeroDeRepresentaciones;
    }

    public void setNumeroDeRepresentaciones(int numeroDeRepresentaciones) {
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    @Override
    public double calcularPrecio() {
        return this.numeroDeRepresentaciones*Actor.getImporteFijo();
    }
    
    
    
    
}
