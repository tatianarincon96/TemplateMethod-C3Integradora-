public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Julieta",5);
        Afiliado afiliado = new Afiliado("Tatiana");
        Pasante pasante = new Pasante("Lucas");

        empleado.vender();
        empleado.conseguirAfiliado(afiliado);
        empleado.mostrarCategoria(); // 40 - "bueno"

        afiliado.vender();
        afiliado.vender();
        afiliado.vender();
        afiliado.mostrarCategoria(); // 45 - "maestro"

        pasante.vender();
        pasante.vender();
        pasante.mostrarCategoria(); // 10 - "pasante novato"
    }
}
