public class Estudiante {
    // atributos
    int id;
    String nombre, apellidos, correo;
    int edad;

    // metodos - metodo constructor - metodo sin retrono - metodo con retorno
    public Estudiante(int id, String nombre, String apellidos, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.edad = edad;
    }

    // metodo para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
    }
}