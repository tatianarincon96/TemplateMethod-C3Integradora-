public class Pasante extends Vendedor {

    public Pasante(String nombre) {
        super(nombre);
    }

    @Override
    protected int calcularPuntos() {
        return getCantidadVentas() * 5;
    }

    @Override
    protected void recategorizar(int puntos) {
        if (puntos >= 50) {
            setCategoria("pasante experimentado");
        } else {
            setCategoria("pasante novato");
        }
    }
}
