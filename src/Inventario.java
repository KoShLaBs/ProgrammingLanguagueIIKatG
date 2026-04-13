//clase controladora

//imports
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("✅ Producto agregado con éxito a la base de datos!");
    }

    // Mopstrar inventario
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("📭 El inventario está vacío.");
        } else {
            System.out.println("📦 Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto.mostrarDetalles());
                System.out.println("---");
            }
        }
    }

    // Buscar Id en la lista inventario
    public Producto buscarPorId(String id) {
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar producto por ID
    public boolean eliminarProducto(String id) {
        return productos.removeIf(producto -> producto.getId().equalsIgnoreCase(id));
    }
}
