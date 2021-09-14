package parcial.dominio;

public class Producto {
    private String nombre;
    private int precio;
    private String tipo;
    private int cantidadDeProducto;

    public Producto(String nombre,String tipo, int precio, int cantidadDeProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.cantidadDeProducto = cantidadDeProducto;
    }

    /*public Producto(String nombre, int codigo, String tipo, int cantidadDeProducto) {
        this.nombre = nombre;
        this.precio = codigo;
        this.tipo = tipo;
        this.cantidadDeProducto = cantidadDeProducto;
    }*/

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadDeProducto(int cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }
}
