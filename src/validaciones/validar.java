package validaciones;

//imports
import java.util.InputMismatchException;
import java.util.Scanner;

public class validar {
    // creación objetos
    Scanner entrada = new Scanner(System.in);

    public int validarOpcion(String mensaje) {
        int opcionVerificar = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Elija una opción: ");
            try {
                String opcion = entrada.nextLine();
                opcionVerificar = Integer.parseInt(opcion);

                if (opcionVerificar >= 0 && opcionVerificar <= 2) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: La opcion debe ser un número entre " + mensaje + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        return opcionVerificar;
    }
}
