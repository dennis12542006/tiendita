public class Producto {
    private String nombre;    // private = solo accesible desde dentro de la clase
    private double precio;
    private int stock;

    // Constructor — la forma correcta de crear objetos con datos iniciales
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters — la única forma de leer los atributos desde afuera
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
