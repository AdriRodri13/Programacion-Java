
package tienda.de.mascotas;


public class Gato extends Animal{
    
    private RazaGato raza;

    public Gato(RazaGato raza, int codigo, double precio) {
        super(codigo, precio);
        this.raza = raza;
    }
    
    public Gato(){
        
    }

    public RazaGato getRaza() {
        return raza;
    }

    public void setRaza(RazaGato raza) {
        this.raza = raza;
    }

    @Override
    public double obtenerPrecio() {
        if(this.enOferta()){
            return this.getPrecio()*0.75;
        }else{
            return this.getPrecio();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Gato: ");
        sb.append("raza: ").append(raza);
        return sb.toString();
    }
    
}
