// Definición de la clase Coche
public class Coche extends Vehiculo {
    // Atributos específicos de Coche
    private String tipo;

    // Constructor de la clase Coche
    public Coche(String matricula, String color, String marca, String tipo) {
        super(matricula, color, marca);
        this.tipo = tipo;
    }
}
