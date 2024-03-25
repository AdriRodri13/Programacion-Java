
package tienda.de.mascotas;


public abstract class Animal implements Tienda{
    
    private int codigo;
    private double precio;
    private boolean oferta = false;

    public Animal(){
        
    } 
    
    public Animal(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    @Override
    public boolean enOferta(){
       return oferta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: ");
        sb.append("codigo: ").append(codigo);
        sb.append(" precio: ").append(precio);
        sb.append(" oferta: ").append(oferta);
        return sb.toString();
    }
        
    
    
}
