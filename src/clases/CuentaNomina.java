package clases;

public class CuentaNomina extends Cuenta {
    private String empresa_empleadora;

    public CuentaNomina(int saldo, int numero_cuenta, String nombre_titular, String empresa_empleadora) {
        super(saldo, numero_cuenta, nombre_titular);
        this.empresa_empleadora = empresa_empleadora;
    }

    public String getEmpresa_empleadora() {
        return empresa_empleadora;
    }

    // Validación para dinero agregado
    public boolean validarDineroAgregado(String dineroAgregado) {
        try {
            double monto = Double.parseDouble(dineroAgregado);
            return monto >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setEmpresa_empleadora(String empresa_empleadora) {
        this.empresa_empleadora = empresa_empleadora;
    }

}
