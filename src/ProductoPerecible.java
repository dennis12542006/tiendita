
public class ProductoPerecible extends Producto implements Vendible, Notificable {
    private String fechaVencimiento;
    private boolean proximoAVencer;

    public ProductoPerecible(String nombre, double precio, int stock,
                             String fechaVencimiento, boolean proximoAVencer) {
        super(nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
        this.proximoAVencer = proximoAVencer;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean estaVencido(String fechaHoy) {
        return fechaVencimiento.compareTo(fechaHoy) < 0;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("fecha de vencimiento: " + fechaVencimiento);
        System.out.println(getNombre() + " - $" + getPrecio() + " - Stock: " + getStock());
    }

    @Override
    public void enviarAlertaStockBajo(){
        if (getStock() < 3) {
            System.out.println("YA CASI SE ACABA");
        }
    }
    @Override
    public double calcularPrecioFinal() {
        if (proximoAVencer) {
            return getPrecio() * 0.85; // 15% descuento
        }
        return getPrecio() * 1.19; // precio normal + IVA
    }

    @Override
    public boolean estaDisponible(){
        return getStock() > 0;
    }

}