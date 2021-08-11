public class Afiliado extends Vendedor {
    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    protected int calcularPuntos() {
        return getCantidadVentas() * 15;
    }
}
