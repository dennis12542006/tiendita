
public class ProductoPerecible extends Producto {
    private String fechaVencimiento;

    public ProductoPerecible(String nombre, double precio, int stock, String fechaVencimiento) {
        super(nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean estaVencido(String fechaHoy) {
        return fechaVencimiento.compareTo(fechaHoy) < 0;
    }
}