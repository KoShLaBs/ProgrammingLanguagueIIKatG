// clase hija, extends producto add variables unique for this clase, electronicos
class Electronico extends Producto {
    private int garantia;

    public Electronico(String id, String nombre, double precio, int cantidad, int garantia) {
        super(id, nombre, precio, cantidad);
        this.garantia = garantia;
    }

    @Override
    public String mostrarDetalles() {
        return super.toString() + "\n   🛡️ Garantía: " + garantia + " meses";
    }
}
