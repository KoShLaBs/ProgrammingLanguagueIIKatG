import javax.print.Doc;

public class Main {
    public static void main(String[] args) throws Exception {
        // nombre de la clase , nombre del objeto, operador de asignacion, constructor
        // de la clase

        // Creacion de objetos de la clase Estudiante y utilizacion de su metodo
        // mostrarDatos para imprimir la informacion de cada estudiante en la consola
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", "juan.perez@correo.com", 20);
        estudiante1.mostrarDatos();

        Estudiante estudiante2 = new Estudiante(2, "Maria", "Gomez", "dando@gmai.com#", 22);
        estudiante2.mostrarDatos();

        Estudiante estudiante3 = new Estudiante(3, "Luis", "Rodriguez", "luis.rodriguez@correo.com", 25);
        estudiante3.mostrarDatos();

        Estudiante estudiante4 = new Estudiante(4, "Ana", "Martinez", "ana.martinez@correo.com", 23);
        estudiante4.mostrarDatos();

        Estudiante estudiante5 = new Estudiante(5, "Carlos", "Lopez", "carlos.lopez@correo.com", 24);
        estudiante5.mostrarDatos();

        // Creacion de objetos de la clase Docente y utilizacion de su metodo
        // mostrarDatos para imprimir la informacion de cada docente en la consola
        Docente docente1 = new Docente(1, "Carlos", "Lopez", "carlos@gmail", 3000.50);
        docente1.mostrarDatos();

        Docente docente2 = new Docente(2, "Ana", "Martinez", "ana@gmail", 3500.75);
        docente2.mostrarDatos();

        Docente docente3 = new Docente(3, "Luis", "Rodriguez", "luis@gmail", 4000.00);
        docente3.mostrarDatos();

        Docente docente4 = new Docente(4, "Maria", "Gomez", "maria@gmail", 3200.25);
        docente4.mostrarDatos();

        Docente docente5 = new Docente(5, "Juan", "Perez", "juan@gmail", 2800.00);
        docente5.mostrarDatos();

        // Creacion de objetos de la clase Administrativo y utilizacion de su metodo
        // mostrarDatos para imprimir la informacion de cada administrativo en la
        // consola
        Administrativo administrativo1 = new Administrativo(1, "Sofia", "Garcia", "sofia@gmail", 2500.00);
        administrativo1.mostrarDatos();

        Administrativo administrativo2 = new Administrativo(2, "Diego", "Fernandez", "diego@gmail", 2700.50);
        administrativo2.mostrarDatos();

        Administrativo administrativo3 = new Administrativo(3, "Valentina", "Lopez", "valentina@gmail", 2600.75);
        administrativo3.mostrarDatos();

        Administrativo administrativo4 = new Administrativo(4, "Matias", "Gomez", "matias@gmail", 2400.00);
        administrativo4.mostrarDatos();

        Administrativo administrativo5 = new Administrativo(5, "Camila", "Martinez", "camila@gmail", 2800.25);
        administrativo5.mostrarDatos();

        // Creacion de objetos de la clase Proveedor y utilizacion de su metodo
        // mostrarDatos para imprimir la informacion de cada proveedor en la consola
        Proveedor proveedor1 = new Proveedor(123456789, "Proveedor A", "Calle 123", "555-1234", 'A');
        proveedor1.mostrarDatos();

        Proveedor proveedor2 = new Proveedor(987654321, "Proveedor B", "Avenida 456", "555-5678", 'B');
        proveedor2.mostrarDatos();

        Proveedor proveedor3 = new Proveedor(456789123, "Proveedor C", "Calle 789", "555-9012", 'A');
        proveedor3.mostrarDatos();

        Proveedor proveedor4 = new Proveedor(789123456, "Proveedor D", "Avenida 321", "555-3456", 'B');
        proveedor4.mostrarDatos();

        Proveedor proveedor5 = new Proveedor(321654987, "Proveedor E", "Calle 654", "555-7890", 'A');
        proveedor5.mostrarDatos();
    }

}
