package clases;

public class Cuenta {
    // Atributos
    private int saldo;
    private int numero_cuenta;
    private String nombre_titular;

    // Constructor
    public Cuenta(int saldo, int numero_cuenta, String nombre_titular) {
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
        this.nombre_titular = nombre_titular;
    }

    // Getters y Setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

}
