// Definición de la clase Vehiculo
public class Vehiculo {
    protected String matricula;
    protected String color;
    protected String marca;

    // Constructor de la clase Vehiculo
    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }

    // Método para obtener la matrícula del vehículo
    public String getMatricula() {
        return matricula;
    }

    // Método para obtener la descripción del vehículo
    public String getDescription() {
        return "Matrícula: " + matricula + ", Color: " + color + ", Marca: " + marca;
    }
}

