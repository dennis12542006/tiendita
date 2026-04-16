public class ProductoElectronico extends Producto implements Vendible, Notificable {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(getNombre() + " - $" + getPrecio() + " - Stock: " + getStock());
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.19; // precio + IVA
    }

    @Override
    public boolean estaDisponible() {
        return getStock() > 0;
    }

    @Override
    public void enviarAlertaStockBajo() {
        if (getStock() < 3) {
            System.out.println("⚠️ ALERTA: Stock bajo de " + getNombre() + " - Quedan: " + getStock());
        }
    }
}