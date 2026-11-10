

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private int cantidadVacunas;

    public Perro(String nombre, int edad, String nombreDuenio, String raza) {
        super(nombre, edad, nombreDuenio);
        this.raza = raza;
        this.cantidadVacunas = 0;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000.0 + (3000.0 * edad);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        this.cantidadVacunas++;
        System.out.println("Vacuna '" + nombreVacuna + "' registrada para el perro " + nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return cantidadVacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000.0 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre.toUpperCase();
    }
}