
package carrera.popular.vehiculos;

import carrera.popular.personas.Persona;


public abstract class Vehiculo {
    private int dorsal;
    private Persona conductor;
    private double peso;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;
    
    public Vehiculo(){}

    public Vehiculo(int dorsal, Persona conductor, double peso, int distanciaRecorrida, int contadorAmonestaciones, boolean enCarrera) {
        this.dorsal = dorsal;
        this.conductor = new Persona(conductor);
        this.peso = peso;
        this.distanciaRecorrida = distanciaRecorrida;
        this.contadorAmonestaciones = contadorAmonestaciones;
        this.enCarrera = enCarrera;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getContadorAmonestaciones() {
        return contadorAmonestaciones;
    }

    public void setContadorAmonestaciones(int contadorAmonestaciones) {
        this.contadorAmonestaciones = contadorAmonestaciones;
    }

    public boolean isEnCarrera() {
        return enCarrera;
    }

    public void setEnCarrera(boolean enCarrera) {
        this.enCarrera = enCarrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo: ");
        sb.append("dorsal: ").append(dorsal);
        sb.append(" conductor: ").append(conductor);
        sb.append(" peso: ").append(peso);
        sb.append(" distanciaRecorrida: ").append(distanciaRecorrida);
        sb.append(" contadorAmonestaciones: ").append(contadorAmonestaciones);
        sb.append(" en Carrera: ").append(enCarrera);
        return sb.toString();
    }
    
    
    
    
}
