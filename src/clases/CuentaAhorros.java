package clases;

public class CuentaAhorros extends Cuenta {
    private String dineroAhorrado;

    public CuentaAhorros(int saldo, int numero_cuenta, String nombre_titular, String dineroAhorrado) {
        super(saldo, numero_cuenta, nombre_titular);
        this.dineroAhorrado = dineroAhorrado;
    }

    public String getDineroAhorrado() {
        return dineroAhorrado;
    }

    // Validación para el dinero ahorrado
    public boolean validarDineroAhorrado(String dineroAhorrado) {
        try {
            double monto = Double.parseDouble(dineroAhorrado);
            return monto >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setDineroAhorrado(String dineroAhorrado) {
        this.dineroAhorrado = dineroAhorrado;
    }
}
