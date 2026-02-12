public class Docente {
    // atributos
    int id;
    String nombre, apellidos, correo;
    double salario;

    // constructor
    public Docente(int id, String nombre, String apellidos, String correo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.salario = salario;
    }

    // metodo para mostrar los datos del docente
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Salario: " + salario);
    }

}
