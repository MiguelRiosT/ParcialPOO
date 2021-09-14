package parcial.app;

import parcial.dominio.CarritoDeMercado;
import parcial.dominio.Producto;

public class AppParcial {
    public static void main(String[] args){
        CarritoDeMercado carritoDeMercado = new CarritoDeMercado("EXITO");


        Producto producto1 = new Producto("Frijoles","Enlatado",2000,0);
        Producto producto2 = new Producto("Leche","Lacteo",1000,0);
        Producto producto3 = new Producto("Zanahoria","Verdura",500,0);
        Producto producto4 = new Producto("Manzana","Fruta",500,0);
        Producto producto5 = new Producto("Pan Integral","Pan",2000,0);
        Producto producto6 = new Producto("Helado","Postre",1000,0);

        carritoDeMercado.agregar(producto1);
        carritoDeMercado.agregar(producto1);
        carritoDeMercado.agregar(producto1);
        carritoDeMercado.agregar(producto2);
        carritoDeMercado.agregar(producto2);
        carritoDeMercado.agregar(producto2);
        carritoDeMercado.agregar(producto3);
        carritoDeMercado.agregar(producto4);
        carritoDeMercado.agregar(producto5);
        carritoDeMercado.agregar(producto6);


        carritoDeMercado.sacar(producto2);
        carritoDeMercado.sacar(producto3);

        System.out.println("BIENVENIDO A SUPERMERCADO");


        System.out.println("Cantida de frijoles: ");
        System.out.println(producto1.getCantidadDeProducto());
        System.out.println("Cantida de leche: ");
        System.out.println(producto2.getCantidadDeProducto());
        System.out.println("Cantida de Zanahoria: ");
        System.out.println(producto3.getCantidadDeProducto());
        System.out.println("Cantida de Manzana: ");
        System.out.println(producto4.getCantidadDeProducto());
        System.out.println("Cantida de Pan Integral: ");
        System.out.println(producto5.getCantidadDeProducto());
        System.out.println("Cantida de Helado: ");
        System.out.println(producto6.getCantidadDeProducto());

        System.out.println("VALOR TOTAL DE COMPRA:");
        System.out.println(carritoDeMercado.calcularValorTotal());

        System.out.println("///////////////////");
        System.out.println("Elemento buscado: ");
        //carritoDeMercado.buscar("Frijoles");
       // carritoDeMercado.buscar("friJoles");
        //carritoDeMercado.buscar("friJoleEs");
       // carritoDeMercado.buscar("Helado");
       // carritoDeMercado.buscar("HELAdooooo");




    }

}
