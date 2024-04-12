// Definición de la clase Tractor
public class Tractor extends Vehiculo {
    // Atributos específicos de Tractor
    private boolean tieneRemolque;

    // Constructor de la clase Tractor
    public Tractor(String matricula, String color, String marca, boolean tieneRemolque) {
        super(matricula, color, marca);
        this.tieneRemolque = tieneRemolque;
    }
}
