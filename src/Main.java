

public class Main {
    public static void main(String[] args) {
        System.out.println("--- BLOQUE 1: FICHAS CON REFERENCIA POLIMÓRFICA ---");
        // Arreglo polimórfico de tipo Animal[]
        Animal[] animales = {
                new Perro("Rex", 4, "Carlos", "Pastor Alemán"),
                new Gato("Michi", 2, "Ana", true),
                new Ave("Paco", 1, "Luisa", 350.0),
                new Conejo("Tambor", 2, "Sofia") // Verificación de extensibilidad
        };

        for (Animal animal : animales) {
            animal.imprimirFicha();
        }

        System.out.println("--- BLOQUE 2: VACUNAR LOS QUE APLICAN ---");
        // Tipos concretos para llamar métodos del contrato Vacunable
        Perro perro1 = new Perro("Firulais", 3, "Pedro", "Labrador");
        Gato gato1 = new Gato("Pelusa", 5, "Elena", false);

        perro1.registrarVacuna("Rabia");
        perro1.registrarVacuna("Parvovirus");
        gato1.registrarVacuna("Triple Felina");

        System.out.println(perro1.nombre + " tiene " + perro1.getVacunasAplicadas() + " vacunas aplicadas.");
        System.out.println(gato1.nombre + " tiene " + gato1.getVacunasAplicadas() + " vacunas aplicadas.\n");

        System.out.println("--- BLOQUE 3: CALCULAR LAS PÓLIZAS ---");
        Clinica clinicaVet = new Clinica("VetCare Central", "Calle 10 # 45-20");

        // Arreglo del tipo de la Interfaz Asegurable[]
        Asegurable[] asegurables = {
                perro1,
                gato1,
                clinicaVet
        };

        for (Asegurable elemento : asegurables) {
            System.out.println("Póliza: " + elemento.obtenerNumeroPoliza() +
                    " | Prima Anual: $" + String.format("%.2f", elemento.calcularPrimaSeguro()));
        }
    }
}