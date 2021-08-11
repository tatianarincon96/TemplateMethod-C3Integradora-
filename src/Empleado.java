import java.util.ArrayList;

public class Empleado extends Vendedor {
    private int aniosAntiguedad;
    private ArrayList<Afiliado> afiliados;

    public Empleado(String nombre, int aniosAntiguedad) {
        super(nombre);
        this.aniosAntiguedad = aniosAntiguedad;
        this.afiliados = new ArrayList<>();
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Afiliado> afiliados) {
        this.afiliados = afiliados;
    }

    public void conseguirAfiliado(Afiliado a) {
        afiliados.add(a);
    }

    @Override
    protected int calcularPuntos() {
        return afiliados.size() * 10 + getCantidadVentas() * 5 + aniosAntiguedad * 5;
    }
}
