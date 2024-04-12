// Definición de la clase Grua
public class Grua extends Vehiculo {
    // Atributos específicos de Grua
    private double capacidadCarga;

    // Constructor de la clase Grua
    public Grua(String matricula, String color, String marca, double capacidadCarga) {
        super(matricula, color, marca);
        this.capacidadCarga = capacidadCarga;
    }
}

