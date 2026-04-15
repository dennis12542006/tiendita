
public class Main {
    public static void main(String[] args) {
        Producto salsa = new Producto("Salsa de tomate FRUCO", 9500.0, 50);
        Producto arroz = new Producto("Arroz DIANA", 2500.0, 100);
        ProductoElectronico cafetera = new ProductoElectronico("cafetera de cafe", 100000.0, 5, 24);
        ProductoPerecible atunEnLata = new ProductoPerecible("atun Isabell", 5500.0, 50, "20/12/2026");

        arroz.vender(10);
        arroz.mostrarInfo();
        cafetera.mostrarGarantia();
        cafetera.vender(2);
        cafetera.mostrarInfo();
        System.out.println( atunEnLata.estaVencido("20/12/2025"));
        atunEnLata.vender(10);
        atunEnLata.mostrarInfo();
    }
}