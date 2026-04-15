
public class Main {
    public static void main(String[] args) {
        Producto salsa = new Producto("Salsa de tomate FRUCO", 9500.0, 50);
        Producto arroz = new Producto("Arroz DIANA", 2500.0, 100);

        arroz.vender(10);
        arroz.mostrarInfo();
        // intenta vender más del stock
    }
}