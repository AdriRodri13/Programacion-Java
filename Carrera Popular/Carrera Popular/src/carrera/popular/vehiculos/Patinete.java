
package carrera.popular.vehiculos;

import carrera.popular.Carrera;
import carrera.popular.personas.Persona;


public class Patinete extends Vehiculo implements Carrera{
    
    private int numeroDeRuedas;

    public Patinete() {
    }

    public Patinete(int numeroDeRuedas, int dorsal, Persona conductor, double peso, int distanciaRecorrida, int contadorAmonestaciones, boolean enCarrera) {
        super(dorsal, conductor, peso, distanciaRecorrida, contadorAmonestaciones, enCarrera);
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patinete: ");
        sb.append(super.toString());
        sb.append("numeroDeRuedas: ").append(numeroDeRuedas);
        return sb.toString();
    }

    @Override
    public void avanzar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void amonestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void obtenerDistanciaRecorrida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
