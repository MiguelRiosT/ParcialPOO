package parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeMercado {
    public static final byte CAPACIDAD = 20;
    private String supermercado;
    private List<Producto> productos;
    //constructor
    public CarritoDeMercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();;
    }

    //Operaciones

    //Agregar
    public boolean agregar(Producto producto){
        if(this.productos.size()< CAPACIDAD){
            this.productos.add(producto);
            producto.setCantidadDeProducto(producto.getCantidadDeProducto()+1);
            return true;
        }else{
            return false;
        }

    }

    //Buscar por nombre
    public Producto buscar(String nombre){
        Producto nombreABuscar = null;
        for(Producto name: this.productos){
            if(nombreABuscar.getNombre().equalsIgnoreCase(nombre)){
                nombreABuscar = name;
            }
        }
        return nombreABuscar;
    }

    //Buscar por tipo
    public Producto buscarPorTipo(String tipo){
        Producto tipoABuscar = null;
        for(Producto producto: this.productos){
            if(tipoABuscar.getTipo().equalsIgnoreCase(tipo)){
                tipoABuscar = producto;
            }
        }
        return tipoABuscar;
    }


    //Sacar
    public boolean sacar(Producto producto){
        if(producto != null){
            //calcularValorTotal(producto)-producto.getPrecio();
            producto.setCantidadDeProducto(producto.getCantidadDeProducto()-1);
            return true;
        }else{
            return false;
        }
    }

    //Calcular Valor total de compra
    public int calcularValorTotal(){
        int precioTotal= 0;
        for(Producto p:this.productos){
            precioTotal += p.getPrecio();
        }
        return precioTotal;
    }

    //Obtener producto mas caro
    public int obtenerProductoMasCaro(){
        return 0;
    }

}


