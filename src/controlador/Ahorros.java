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

    public void crearMeta(String descripcion, int montoDeseado) {
        Meta nuevaMeta = new Meta(descripcion, montoDeseado);
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
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                meta.setMonto_deseado(nuevoMontoDeseado);
                break;
            }
        }
    }

    public void marcarMetaComoCompletada(String descripcionMeta) {
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                meta.setEstado("Completada");
                break;
            }
        }
    }

    public void marcarMetaComoEnProgreso(String descripcionMeta) {
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                meta.setEstado("En Progreso");
                break;
            }
        }
    }

    public void asignarIconoAMeta(String descripcionMeta, char icono) {
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                meta.setIcono(icono);
                break;
            }
        }
    }

    public void eliminarMeta(String descripcionMeta) {
        metas.removeIf(meta -> meta.getDescripcion().equals(descripcionMeta));
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void mostrarMetas() {
        for (Meta meta : metas) {
            System.out.println("Descripcion: " + meta.getDescripcion());
            System.out.println("Monto Deseado: " + meta.getMonto_deseado());
            System.out.println("Monto Agregado: " + meta.getMonto_agregado());
            System.out.println("Estado: " + meta.getEstado());
            System.out.println("Icono: " + meta.getIcono());
            System.out.println("-----------------------------");
        }
    }

    public void agregarMontoAMeta(String descripcionMeta, int monto) {
        for (Meta meta : metas) {
            if (meta.getDescripcion().equals(descripcionMeta)) {
                int nuevoMontoAgregado = meta.getMonto_agregado() + monto;
                meta.setMonto_agregado(nuevoMontoAgregado);
                if (nuevoMontoAgregado >= meta.getMonto_deseado()) {
                    meta.setEstado("Completada");
                } else {
                    meta.setEstado("En Progreso");
                }
                break;
            }
        }
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
        return null; // Retorna null si no se encuentra la cuenta
    }

    public void eliminarCuenta(int numeroCuenta) {
        cuentas.removeIf(cuenta -> cuenta.getNumero_cuenta() == numeroCuenta);
    }

    public void actualizarCuenta(int numeroCuenta, int nuevoSaldo, String nuevoNombreTitular) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero_cuenta() == numeroCuenta) {
                cuenta.setSaldo(nuevoSaldo);
                cuenta.setNombre_titular(nuevoNombreTitular);
                break;
            }
        }
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println("Numero de Cuenta: " + cuenta.getNumero_cuenta());
            System.out.println("Nombre del Titular: " + cuenta.getNombre_titular());
            System.out.println("Saldo: " + cuenta.getSaldo());
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
