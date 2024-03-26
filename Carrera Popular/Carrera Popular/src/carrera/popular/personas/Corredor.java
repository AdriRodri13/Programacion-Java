
package carrera.popular.personas;

import carrera.popular.Carrera;


public class Corredor extends Persona implements Carrera{
    private int dorsal;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;

    public Corredor() {
    }

    public Corredor(int dorsal, int distanciaRecorrida, int contadorAmonestaciones, boolean enCarrera, String nombre, int edad) {
        super(nombre, edad);
        this.dorsal = dorsal;
        this.distanciaRecorrida = distanciaRecorrida;
        this.contadorAmonestaciones = contadorAmonestaciones;
        this.enCarrera = enCarrera;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public int getContadorAmonestaciones() {
        return contadorAmonestaciones;
    }

    public boolean isEnCarrera() {
        return enCarrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Corredor: ");
        sb.append("dorsal: ").append(dorsal);
        sb.append(" distanciaRecorrida: ").append(distanciaRecorrida);
        sb.append(" contadorAmonestaciones: ").append(contadorAmonestaciones);
        sb.append(" enCarrera: ").append(enCarrera);
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
