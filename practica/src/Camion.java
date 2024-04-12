// Definición de la clase Camion
public class Camion extends Vehiculo {
    // Atributos específicos de Camion
    private int cargaMaxima;

    // Constructor de la clase Camion
    public Camion(String matricula, String color, String marca, int cargaMaxima) {
        super(matricula, color, marca);
        this.cargaMaxima = cargaMaxima;
    }
}

