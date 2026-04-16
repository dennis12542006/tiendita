public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método concreto — todas las hijas lo heredan igual
    public void vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Stock insuficiente. Disponible: " + stock);
            return;
        }
        stock = stock - cantidad;
    }

    // Método abstracto — cada hija DEBE implementarlo a su manera
    public abstract void mostrarInfo();

    // Getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}