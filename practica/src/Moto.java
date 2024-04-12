// Definición de la clase Moto
public class Moto extends Vehiculo {
    // Atributos específicos de Moto
    private int cilindrada;

    // Constructor de la clase Moto
    public Moto(String matricula, String color, String marca, int cilindrada) {
        super(matricula, color, marca);
        this.cilindrada = cilindrada;
    }
}
