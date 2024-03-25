
package tienda.de.mascotas;


public class Articulo implements Tienda{
    
    private int codigo;
    private String descripcion;
    private double precio;
    private boolean oferta = false;

    public Articulo(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Articulo() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public double obtenerPrecio() {
         if(this.enOferta()){
             return this.precio * 0.9;
         }else{
             return this.precio;
         }
    }

    @Override
    public boolean enOferta() {
        return this.oferta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Articulo: ");
        sb.append("codigo: ").append(codigo);
        sb.append(" descripcion: ").append(descripcion);
        sb.append(" precio: ").append(precio);
        sb.append(" oferta: ").append(oferta);
        return sb.toString();
    }
    
    
}
