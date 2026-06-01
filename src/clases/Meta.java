package clases;

public class Meta {
    // Atributos
    private String descripcion;
    private int monto_deseado;
    private char icono;
    private String estado;
    private int monto_agregado;

    // Constructor
    public Meta(String descripcion, int monto_deseado, char icono, String estado) {
        this.descripcion = descripcion;
        this.monto_deseado = monto_deseado;
        this.icono = icono;
        this.estado = estado;
        this.monto_agregado = 0;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto_deseado() {
        return monto_deseado;
    }

    public void setMonto_deseado(int monto_deseado) {
        this.monto_deseado = monto_deseado;
    }

    public char getIcono() {
        return icono;
    }

    public void setIcono(char icono) {
        this.icono = icono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMonto_agregado() {
        return monto_agregado;
    }

    public void setMonto_agregado(int monto_agregado) {
        this.monto_agregado = monto_agregado;
    }

}
