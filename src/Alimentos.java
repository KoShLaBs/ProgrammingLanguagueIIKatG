//clase hija, extends producto add variables unique for this clase, alimentos
class Alimentos extends Producto {
    private String vencimiento;

    public Alimentos(String id, String nombre, double precio, int cantidad, String vencimiento) {
        super(id, nombre, precio, cantidad);
        this.vencimiento = vencimiento;

    }

    @Override
    public String mostrarDetalles() {
        return super.toString() + "\n   📅 Fecha de vencimiento: " + vencimiento;
    }

}