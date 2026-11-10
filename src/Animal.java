
public abstract class Animal {
    // Atributos protected para que las subclases accedan directamente
    protected String nombre;
    protected int edad;
    protected String nombreDuenio;

    public Animal(String nombre, int edad, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenio = nombreDuenio;
    }

    // Método abstracto: cada especie sabe cómo calcularlo
    public abstract double calcularCostoConsulta();

    // Método concreto heredado igual por todas las subclases
    public void imprimirFicha() {
        System.out.println("====================================");
        System.out.println("FICHA MÉRICA VETCARE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDuenio);
        // Llamada polimórfica al método abstracto
        System.out.println("Costo Consulta: $" + String.format("%.2f", calcularCostoConsulta()));
        System.out.println("====================================\n");
    }
}