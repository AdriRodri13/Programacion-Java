
package tienda.de.mascotas;


public class Perro extends Animal{
    
    private RazaPerro raza;

    public Perro(RazaPerro raza, int codigo, double precio) {
        super(codigo, precio);
        this.raza = raza;
    }
    
    public Perro(){
        
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    @Override
    public double obtenerPrecio() {
         if(this.enOferta()){
             if(this.getRaza().equals(RazaPerro.PASTORALEMAN)){
                 return this.getPrecio() * 0.75;
             }else{
                 return this.getPrecio() * 0.80;
             }
         }else{
             return this.getPrecio();
         }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Perro: ");
        sb.append("raza: ").append(raza);
        return sb.toString();
    }

    
    
}
