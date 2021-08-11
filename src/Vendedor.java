public abstract class Vendedor {
    private String nombre;
    private int cantidadVentas;
    private String categoria;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        cantidadVentas = 0;
        categoria = "novato";
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void vender() {
        System.out.println("Nueva venta!");
        cantidadVentas++;
    }

    public void mostrarCategoria() {
        int puntos = calcularPuntos();
        recategorizar(puntos);
        System.out.println(nombre + " tiene un total de " + puntos + " puntos, categoriza como " + categoria);
    }

    protected void recategorizar(int puntos) {
        if (puntos > 40) {
            categoria = "maestro";
        } else if (puntos > 30) {
            categoria = "bueno";
        } else if (puntos > 19) {
            categoria = "aprendiz";
        } else {
            categoria = "novato";
        }
    }

    protected abstract int calcularPuntos();
}
