
public class Conejo extends Animal {
    public Conejo(String nombre, int edad, String nombreDuenio) {
        super(nombre, edad, nombreDuenio);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000.0;
    }
}