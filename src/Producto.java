//clase padre abstracta para herencia
public abstract class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Abstacto
    public abstract String mostrarDetalles();

    @Override
    public String toString() {
        return "📦 Producto:\n" +
                "   🆔 ID: " + id + "\n" +
                "   📝 Nombre: " + nombre + "\n" +
                "   💰 Precio: $" + precio + "\n" +
                "   🔢 Cantidad: " + cantidad;
    }

}
