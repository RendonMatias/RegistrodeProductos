
public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    private static int contadorProductos = 0;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Metodo static
    public static int getTotalProductos() {
        return contadorProductos;
    }
}
