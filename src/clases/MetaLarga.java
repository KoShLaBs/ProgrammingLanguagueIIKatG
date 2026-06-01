package clases;

public class MetaLarga extends Meta {
    // Atributos adicionales
    private String fecha_limite;

    // Constructor
    public MetaLarga(String descripcion, int monto_deseado, String fecha_limite, char icono) {
        super(descripcion, monto_deseado, icono, "Sin iniciar");
        this.fecha_limite = fecha_limite;
    }

    // Getters y Setters
    public String getFecha_limite() {
        return fecha_limite;
    }

    // validaciones para la fecha limite
    public boolean validarFechaLimite(String fecha_limite) {
        // Validar el formato de la fecha (dd/MM/yyyy)
        if (!fecha_limite.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false; // Formato incorrecto
        }

        // Validar que la fecha no sea anterior a la fecha actual
        String[] partes = fecha_limite.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        java.util.Calendar fechaActual = java.util.Calendar.getInstance();
        java.util.Calendar fechaLimite = java.util.Calendar.getInstance();
        fechaLimite.set(anio, mes - 1, dia); // Mes es 0-indexado

        return !fechaLimite.before(fechaActual); // Retorna true si la fecha límite es válida
    }

    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

}
