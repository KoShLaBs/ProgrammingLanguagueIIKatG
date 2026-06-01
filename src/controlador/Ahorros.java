package controlador;

// Importar las librerias
import java.util.ArrayList;
import java.util.List;

// Importar las clases
import clases.Meta;
import clases.Cuenta;

public class Ahorros {
    List<Meta> metas;
    List<Cuenta> cuentas;

    // Constructor
    public Ahorros() {
        this.metas = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    // Metodos para Metas
    public void agregarMeta(Meta meta) {
        metas.add(meta);
    }

    public void crearMeta(String descripcion, int montoDeseado, char icono) {
        Meta nuevaMeta = new Meta(descripcion, montoDeseado, icono, "Sin iniciar");
        metas.add(nuevaMeta);
    }

    public Meta obtenerMeta(String descripcionMeta) {
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                return meta;
            }
        }
        return null; // Retorna null si no se encuentra la meta
    }

    public void actualizarMeta(String descripcionMeta, int nuevoMontoDeseado) {
        boolean encontrada = false;

        for (Meta meta : metas) {
            if (meta.getDescripcion().equalsIgnoreCase(descripcionMeta.trim())) {
                meta.setMonto_deseado(nuevoMontoDeseado);
                encontrada = true;
            }
        }
        if (encontrada == false) {
            System.out.println("❗  No se encontró la meta con la descripción proporcionada.");
        } else {
            System.out.println("✅  Meta actualizada exitosamente.");
        }
    }

    public void validarEstado() {
        for (Meta meta : metas) {
            if (meta.getMonto_agregado() >= meta.getMonto_deseado() && !meta.getEstado().equals("Completada")) {
                meta.setEstado("Completada");
                break;
            } else if (meta.getMonto_agregado() < meta.getMonto_deseado() && !meta.getEstado().equals("Completada")) {
                meta.setEstado("En Progreso");
                break;
            }
        }
    }

    public void eliminarMeta(String descripcionMeta) {
        boolean eliminado = metas.removeIf(meta -> meta.getDescripcion().equalsIgnoreCase(descripcionMeta.trim()));

        if (eliminado) {
            System.out.println("✅  Meta eliminada exitosamente.");
        } else {
            System.out.println("❗  No se encontró la meta con la descripción proporcionada.");
        }
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void mostrarMetas() {
        for (Meta meta : metas) {
            System.out.println("📌  Descripcion: " + meta.getDescripcion());
            System.out.println("   Monto Deseado: " + meta.getMonto_deseado());
            System.out.println("   Monto Agregado: " + meta.getMonto_agregado());
            System.out.println("   Estado: " + meta.getEstado());
            System.out.println("   Icono: " + meta.getIcono());
            System.out.println("-----------------------------");
        }
    }

    public void agregarMontoAMeta(String descripcionMeta, int monto, int numeroCuenta) {
        if (monto <= 0) {
            System.out.println("❗  Error: El monto a agregar debe ser mayor a cero.");
            return;
        }
        Cuenta cuenta = obtenerCuenta(numeroCuenta);
        if (cuenta == null) {
            System.out.println("❗  Error: No se encontró la cuenta número: " + numeroCuenta);
            return;
        }
        if (cuenta.getSaldo() < monto) {
            System.out.println("❗  Error: Fondos insuficientes en la cuenta #" + numeroCuenta + " (Saldo actual: $"
                    + cuenta.getSaldo() + ").");
            return;
        }
        Meta metaEncontrada = null;
        for (Meta m : metas) {
            if (m.getDescripcion().equalsIgnoreCase(descripcionMeta.trim())) {
                metaEncontrada = m;
                break;
            }
        }
        if (metaEncontrada == null) {
            System.out.println("❗  Error: No se encontró la meta con la descripción proporcionada.");
            return;
        }
        if (metaEncontrada.getEstado().equalsIgnoreCase("Completada")) {
            System.out.println(
                    "✅  La meta '" + metaEncontrada.getDescripcion()
                            + "' ya está completada. ¡No necesita más fondos!");
            return;
        }
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        int nuevoMontoAgregado = metaEncontrada.getMonto_agregado() + monto;
        metaEncontrada.setMonto_agregado(nuevoMontoAgregado);
        if (nuevoMontoAgregado >= metaEncontrada.getMonto_deseado()) {
            metaEncontrada.setEstado("Completada");
            System.out.println(
                    "🎉  ¡Felicitaciones! Has alcanzado el 100% de tu meta: " + metaEncontrada.getDescripcion());
        } else {
            metaEncontrada.setEstado("En Progreso");
            System.out.println("➡️  Se trasladaron $" + monto + " de la cuenta #" + numeroCuenta + " a la meta '"
                    + metaEncontrada.getDescripcion() + "'.");
        }
        validarEstado();
    }

    // Metodos para Cuentas
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void crearCuenta(int saldo, int numeroCuenta, String nombreTitular) {
        Cuenta nuevaCuenta = new Cuenta(saldo, numeroCuenta, nombreTitular);
        cuentas.add(nuevaCuenta);
    }

    public Cuenta obtenerCuenta(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero_cuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    public void eliminarCuenta(int numeroCuenta) {
        boolean eliminado = cuentas.removeIf(cuenta -> cuenta.getNumero_cuenta() == numeroCuenta);

        if (eliminado) {
            System.out.println("✅  Cuenta eliminada exitosamente.");
        } else {
            System.out.println("❗  No se encontró la cuenta con el número proporcionado.");
        }
    }

    public void actualizarCuenta(int numeroCuenta, int nuevoSaldo, String nuevoNombreTitular) {

        boolean encontrada = false;

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero_cuenta() == numeroCuenta) {
                cuenta.setSaldo(nuevoSaldo);
                cuenta.setNombre_titular(nuevoNombreTitular);
                encontrada = true;
                break;
            }
        }
        if (encontrada == false) {
            System.out.println("❗  No se encontró la cuenta con el número proporcionado.");
        } else {
            System.out.println("✅  Cuenta actualizada exitosamente.");
        }
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println("🏦  Numero de Cuenta: " + cuenta.getNumero_cuenta());
            System.out.println("   Nombre del Titular: " + cuenta.getNombre_titular());
            System.out.println("   Saldo: " + cuenta.getSaldo());
            System.out.println("-----------------------------");
        }
    }

    public void retirarMontoDeCuenta(int numeroCuenta, int monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero_cuenta() == numeroCuenta) {
                int nuevoSaldo = cuenta.getSaldo() - monto;
                cuenta.setSaldo(nuevoSaldo);
                break;
            }
        }
    }

    public void depositarMontoEnCuenta(int numeroCuenta, int monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero_cuenta() == numeroCuenta) {
                int nuevoSaldo = cuenta.getSaldo() + monto;
                cuenta.setSaldo(nuevoSaldo);
                break;
            }
        }
    }

}
