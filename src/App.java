
//imports
import validaciones.validar;
import print_consola.menu;
import controlador.Ahorros;

public class App {
    public static void main(String[] args) throws Exception {
        // creación objetos
        menu menu = new print_consola.menu();
        validar validar = new validaciones.validar();
        Ahorros ahorros = new controlador.Ahorros();

        // variables
        int opcion, opcionMetas, opcionCuenta;
        String descripcionMeta;
        int montoDeseado;
        char icono;

        do {
            menu.menuPrincipal();
            opcion = validar.validarOpcion("0 y 2", 0, 2);
            switch (opcion) {
                case 0:
                    System.out.println("✨  Saliendo del programa...");
                    break;
                case 1:
                    do {
                        menu.menuMetas();
                        opcionMetas = validar.validarOpcion("0 y 5", 0, 5);
                        switch (opcionMetas) {
                            case 0:
                                System.out.println("🔙  Volviendo al menú principal...");
                                continue;
                            case 1:
                                descripcionMeta = validar.descripcionMeta("Ingrese la descripción de la meta:");
                                montoDeseado = validar.validarMonto("Ingrese el monto deseado para la meta:");
                                icono = validar.validarIcono("Ingrese el icono para la meta (1-8):");
                                ahorros.crearMeta(descripcionMeta, montoDeseado, icono);
                                break;
                            case 2:
                                ahorros.mostrarMetas();
                                break;
                            case 3:
                                System.out.println("🗑️  Eliminar Meta");
                                descripcionMeta = validar
                                        .descripcionMeta("Ingrese la descripción de la meta a eliminar:");
                                ahorros.eliminarMeta(descripcionMeta);
                                break;
                            case 4:
                                System.out.println("🔧  Actualizar Meta");
                                descripcionMeta = validar
                                        .descripcionMeta("Ingrese la descripción de la meta a actualizar:");
                                montoDeseado = validar.validarMonto("Ingrese el nuevo monto deseado para la meta:");
                                ahorros.actualizarMeta(descripcionMeta, montoDeseado);
                                break;
                            case 5:
                                System.out.println("➕  Agregar monto a Meta");
                                descripcionMeta = validar
                                        .descripcionMeta(
                                                "Ingrese la descripción de la meta a la que desea agregar monto:");
                                montoDeseado = validar.validarMonto("Ingrese el monto a agregar para la meta:");
                                int cuentaNumeroMeta = validar.validarMonto(
                                        "Ingrese el número de cuenta desde la cual desea agregar el monto:");
                                ahorros.agregarMontoAMeta(descripcionMeta, montoDeseado, cuentaNumeroMeta);
                                break;
                            default:
                                System.out.println("⚠️  Opción no válida.");
                        }
                    } while (opcionMetas != 0);
                    break;
                case 2:
                    do {
                        menu.menuCuentas();
                        opcionCuenta = validar.validarOpcion("0 y 4", 0, 4);
                        switch (opcionCuenta) {
                            case 0:
                                System.out.println("🔙  Volviendo al menú principal...");
                                break;
                            case 1:
                                int saldo = validar.validarMonto("Ingrese el saldo inicial para la cuenta:");
                                int numeroCuenta = validar.validarMonto("Ingrese el número de cuenta:");
                                String nombreTitular = validar
                                        .descripcionMeta("Ingrese el nombre del titular de la cuenta:");
                                ahorros.crearCuenta(saldo, numeroCuenta, nombreTitular);
                                break;
                            case 2:
                                System.out.println("📋  Mostrar Cuentas");
                                ahorros.mostrarCuentas();
                                break;
                            case 3:
                                int numeroCuentaEli = validar.validarMonto("Ingrese el número de cuenta a eliminar:");
                                ahorros.eliminarCuenta(numeroCuentaEli);
                                break;
                            case 4:
                                System.out.println("🔧  Actualizar Cuenta");
                                int numeroCuentaActualizar = validar
                                        .validarMonto("Ingrese el número de cuenta a actualizar:");
                                int nuevoSaldo = validar.validarMonto("Ingrese el nuevo saldo para la cuenta:");
                                String nuevoNombreTitular = validar
                                        .descripcionMeta("Ingrese el nuevo nombre del titular de la cuenta:");
                                ahorros.actualizarCuenta(numeroCuentaActualizar, nuevoSaldo, nuevoNombreTitular);
                                break;
                            default:
                                System.out.println("⚠️  Opción no válida.");
                        }
                    } while (opcionCuenta != 0);
                    break;
                default:
                    System.out.println("⚠️  Opción no válida.");
            }
        } while (opcion != 0);
    }
}
