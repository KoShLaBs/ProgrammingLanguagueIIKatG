package validaciones;

//imports
import java.util.InputMismatchException;
import java.util.Scanner;

public class validar {
    // creación objetos
    Scanner entrada = new Scanner(System.in);

    public int validarOpcion(String mensaje, int min, int max) {
        int opcionVerificar = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("👉  Elija una opción: ");
            try {
                String opcion = entrada.nextLine();
                opcionVerificar = Integer.parseInt(opcion);

                if (opcionVerificar >= min && opcionVerificar <= max) {
                    entradaValida = true;
                } else {
                    System.out.println("❗  Error: La opcion debe ser un número entre " + mensaje + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("❗  Error: Debe ingresar un número entero válido.");
            }
        }
        return opcionVerificar;
    }

    public int validarMonto(String mensaje) {
        int montoVerificar = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("💰  " + mensaje);
            try {
                String monto = entrada.nextLine();
                montoVerificar = Integer.parseInt(monto);

                if (montoVerificar >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("❗  Error: El monto debe ser un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❗  Error: Debe ingresar un número entero válido.");
            }
        }
        return montoVerificar;
    }

    public String descripcionMeta(String mensaje) {
        System.out.println("📝  " + mensaje);
        String descripcion = entrada.nextLine();
        if (descripcion.isEmpty()) {
            System.out.println("❗  Error: La descripción no puede estar vacía.");
        } else {
            System.out.println("✅  Descripción de la meta: " + descripcion);
        }
        return descripcion;
    }

    public char validarIcono(String mensaje) {
        char iconoVerificar = ' ';
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("🎨  " + mensaje);
            String input = entrada.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("❗  Error: El campo no puede estar vacío.");
            } else if (input.length() == 1) {
                char caracter = input.charAt(0);
                if (caracter >= '1' && caracter <= '8') {
                    iconoVerificar = caracter;
                    entradaValida = true;
                } else {
                    System.out.println("❗  Error: El número debe ser mayor a 0 y menor a 9 (Rango: 1 al 8).");
                }
            } else {
                System.out.println("❗  Error: Debe ingresar un solo carácter numérico.");
            }
        }
        return iconoVerificar;
    }

}
