public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Stock insuficiente. Disponible: " + stock);
            return;
        }
        stock = stock - cantidad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + "\nPrecio: " + precio + "\nStock: " + stock);
    }
}
