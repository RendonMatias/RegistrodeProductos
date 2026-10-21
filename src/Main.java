
public class Main {
    public static void main(String[] args) {

        // Crear cinco productos
        Producto producto1 = new Producto("Mouse", 25.50, 10);
        Producto producto2 = new Producto("Teclado", 35.00, 15);
        Producto producto3 = new Producto("Monitor", 150.00, 5);
        Producto producto4 = new Producto("Laptop", 650.00, 8);
        Producto producto5 = new Producto("Audifonos", 20.00, 20);

        // Mostrar productos
        System.out.println("REGISTRO DE PRODUCTOS");

        System.out.println("ID: " + producto1.getId());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());

        System.out.println("----------------");

        System.out.println("ID: " + producto2.getId());
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Stock: " + producto2.getStock());

        System.out.println("----------------");

        System.out.println("ID: " + producto3.getId());
        System.out.println("Nombre: " + producto3.getNombre());
        System.out.println("Precio: " + producto3.getPrecio());
        System.out.println("Stock: " + producto3.getStock());

        System.out.println("----------------");

        System.out.println("ID: " + producto4.getId());
        System.out.println("Nombre: " + producto4.getNombre());
        System.out.println("Precio: " + producto4.getPrecio());
        System.out.println("Stock: " + producto4.getStock());

        System.out.println("----------------");

        System.out.println("ID: " + producto5.getId());
        System.out.println("Nombre: " + producto5.getNombre());
        System.out.println("Precio: " + producto5.getPrecio());
        System.out.println("Stock: " + producto5.getStock());

        // Total de productos
        System.out.println("----------------");
        System.out.println("Total de productos: "
                + Producto.getTotalProductos());
    }
}

