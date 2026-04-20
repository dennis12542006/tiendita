import java.util.ArrayList;
import java.util.List;

public class Main{
    public  static void main(String[] args){
        List<Producto> inventario = new ArrayList<>();
        inventario.add(new ProductoElectronico("Cafetera", 100000.0, 5, 24 ));
        inventario.add(new ProductoPerecible("Atún Isabell", 5500.0, 50, "2026-12-20", false));


        Tienda tienda = new Tienda("Tienda Don Java");
        tienda.agregarProducto(new ProductoElectronico("Cafetera", 100000.0, 5, 24));
        tienda.agregarProducto(new ProductoPerecible("Atún Isabell", 5500.0, 50, "2026-12-20", false));

        tienda.mostrarInventario();
        tienda.venderProducto("Cafetera", 2);
    }

}