
package ejercicioherencia1;


public class Amateur extends Actor{
    
    private int numeroDeHoras;

    public Amateur(){
        
    }

    public Amateur(String nif, String actor, int edad, Genero genero, int numeroDeHoras) {
        super(nif, actor, edad, genero);
        this.numeroDeHoras = numeroDeHoras;
    }
    
    
    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    @Override
    public double calcularPrecio() {
        return this.numeroDeHoras*Actor.getImporteHoras();
    }
    
    
}
