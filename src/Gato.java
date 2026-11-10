

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private int cantidadVacunas;

    public Gato(String nombre, int edad, String nombreDuenio, boolean esEsterilizado) {
        super(nombre, edad, nombreDuenio);
        this.esEsterilizado = esEsterilizado;
        this.cantidadVacunas = 0;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000.0;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        this.cantidadVacunas++;
        System.out.println("Vacuna '" + nombreVacuna + "' registrada para el gato " + nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return cantidadVacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return esEsterilizado ? 120000.0 : 200000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }
}