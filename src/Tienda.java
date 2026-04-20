import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Producto> inventario;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("=== " + nombre + " ===");
        for (Producto p : inventario) {
            p.mostrarInfo();
            System.out.println("----------");
        }
    }

    public void venderProducto(String nombreProducto, int cantidad) {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                p.vender(cantidad);
                return;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
    }
}