import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto("Arroz DIANA", 2500.0, 100));
        inventario.add(new ProductoElectronico("Cafetera", 100000.0, 5, 24));
        inventario.add(new ProductoPerecible("Atún Isabell", 5500.0, 50, "2026-12-20"));

        for (Producto p : inventario) {
            p.mostrarInfo();
            System.out.println("----------");
        }
    }
}