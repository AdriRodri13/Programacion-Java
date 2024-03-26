
package carrera.popular.vehiculos;

import carrera.popular.Carrera;
import carrera.popular.personas.Persona;


public class Bicicleta extends Vehiculo implements Carrera{
    
    private TipoBicicleta tipo;

    public Bicicleta() {
    }

    public Bicicleta(TipoBicicleta tipo, int dorsal, Persona conductor, double peso, int distanciaRecorrida, int contadorAmonestaciones, boolean enCarrera) {
        super(dorsal, conductor, peso, distanciaRecorrida, contadorAmonestaciones, enCarrera);
        this.tipo = tipo;
    }

    public TipoBicicleta getTipo() {
        return tipo;
    }

    public void setTipo(TipoBicicleta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bicicleta: ");
        sb.append(super.toString());
        sb.append("tipo: ").append(tipo);
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
