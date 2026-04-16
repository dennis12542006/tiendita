public class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    public void mostrarGarantia(){
        System.out.println("Garantia de: " + garantiaMeses );
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}
