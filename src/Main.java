//correr programa

//importar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Prints print = new Prints();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            print.menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("💻 Agregando producto electrónico");
                    // Lógica para agregar producto electrónico|
                    System.out.println("   ➡️ ID del producto: ");
                    String id = entrada.next();
                    System.out.println("   ➡️ Nombre del producto: ");
                    String nombre = entrada.next();
                    System.out.println("   ➡️ Precio del producto: ");
                    double precio = entrada.nextDouble();
                    System.out.println("   ➡️ Cantidad del producto: ");
                    int cantidad = entrada.nextInt();
                    System.out.println("   ➡️ Garantía (en meses): ");
                    int garantia = entrada.nextInt();
                    inventario.agregarProducto(new Electronico(id, nombre, precio, cantidad, garantia));
                    System.out.println("✅ Producto electrónico agregado correctamente.");
                    break;
                case 2:
                    System.out.println("🍎 Agregando producto de alimento");
                    // Lógica para agregar producto de alimento
                    System.out.println("   ➡️ ID del producto: ");
                    String idA = entrada.next();
                    System.out.println("   ➡️ Nombre del producto: ");
                    String nombreA = entrada.next();
                    System.out.println("   ➡️ Precio del producto: ");
                    double precioA = entrada.nextDouble();
                    System.out.println("   ➡️ Cantidad del producto: ");
                    int cantidadA = entrada.nextInt();
                    System.out.println("   ➡️ Fecha de vencimiento (YYYY-MM-DD): ");
                    String vencimiento = entrada.next();
                    inventario.agregarProducto(new Alimentos(idA, nombreA, precioA, cantidadA, vencimiento));
                    System.out.println("✅ Producto de alimento agregado correctamente.");
                    break;
                case 3:
                    System.out.println("📦 Mostrando inventario");
                    // Lógica para ver inventario
                    inventario.mostrarInventario();
                    break;
                case 4:
                    System.out.println("🔍 Buscando producto por ID");
                    // Lógica para buscar producto por ID
                    System.out.println("   ➡️ ID del producto a buscar: ");
                    String idBuscar = entrada.next();
                    Producto producto = inventario.buscarPorId(idBuscar);
                    if (producto != null) {
                        System.out.println("✅ Producto encontrado:");
                        System.out.println(producto.mostrarDetalles());
                    } else {
                        System.out.println("❌ Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("🗑️ Eliminando producto");
                    // Lógica para eliminar producto
                    System.out.println("   ➡️ ID del producto a eliminar: ");
                    String idEliminar = entrada.next();
                    if (inventario.eliminarProducto(idEliminar)) {
                        System.out.println("✅ Producto eliminado correctamente.");
                    } else {
                        System.out.println("❌ Producto no encontrado.");
                    }
                    break;
                default:
                    break;
            }

        } while (opcion != 6);

    }

}
