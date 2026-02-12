public class Proveedor {
    // variables
    int nit;
    String nombre, direccion, telefono;
    char tipo;

    // constructor
    public Proveedor(int nit, String nombre, String direccion, String telefono, char tipo) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    // metodo para mostrar los datos del proveedor
    public void mostrarDatos() {
        System.out.println("NIT: " + nit);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Tipo: " + tipo);
    }

}