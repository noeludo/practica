import java.util.Scanner;

// Clase principal que contiene el menú y la lógica del taller
public class Taller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Menú principal
        while (!salir) {
            System.out.println("1. ¿Qué vehículo entra?");
            System.out.println("2. ¿Qué pieza hay que reparar?");
            System.out.println("3. Seguir");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarEntradaVehiculo();
                    break;
                case 2:
                    repararPieza();
                    break;
                case 3:
                    System.out.println("Continuando en el taller...");
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del taller. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
        scanner.close();
    }

    // Método para registrar la entrada de un vehículo
    private static void registrarEntradaVehiculo() {
        System.out.println("Registrando entrada de vehículo...");
        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.next();
        System.out.print("Ingrese el color del vehículo: ");
        String color = scanner.next();
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.next();

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Camión");
        System.out.println("4. Tractor");
        System.out.println("5. Grua");
        int tipo = scanner.nextInt();

        Vehiculo vehiculo;
        switch (tipo) {
            case 1:
                vehiculo = crearCoche(matricula, color, marca);
                break;
            case 2:
                vehiculo = crearMoto(matricula, color, marca);
                break;
            case 3:
                vehiculo = crearCamion(matricula, color, marca);
                break;
            case 4:
                vehiculo = crearTractor(matricula, color, marca);
                break;
            case 5:
                vehiculo = crearGrua(matricula, color, marca);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        vehiculos.put(matricula, vehiculo);
        System.out.println("Vehículo registrado con éxito.");
    }

    // Método para crear un coche
    private static Coche crearCoche(String matricula, String color, String marca) {
        System.out.print("Ingrese el tipo de coche: ");
        String tipo = scanner.next();
        return new Coche(matricula, color, marca, tipo);
    }

    // Método para crear una moto
    private static Moto crearMoto(String matricula, String color, String marca) {
        System.out.print("Ingrese la cilindrada de la moto: ");
        int cilindrada = scanner.nextInt();
        return new Moto(matricula, color, marca, cilindrada);
    }

    // Método para crear un camión
    private static Camion crearCamion(String matricula, String color, String marca) {
        System.out.print("Ingrese la carga máxima del camión: ");
        int cargaMaxima = scanner.nextInt();
        return new Camion(matricula, color, marca, cargaMaxima);
    }

    // Método para crear un tractor
    private static Tractor crearTractor(String matricula, String color, String marca) {
        System.out.print("¿El tractor tiene remolque? (true/false): ");
        boolean tieneRemolque = scanner.nextBoolean();
        return new Tractor(matricula, color, marca, tieneRemolque);
    }

    // Método para crear una grua
    private static Grua crearGrua(String matricula, String color, String marca) {
        System.out.print("Ingrese la capacidad de carga de la grúa: ");
        double capacidadCarga = scanner.nextDouble();
        return new Grua(matricula, color, marca, capacidadCarga);
    }

    // Método para reparar una pieza de un vehículo
    private static void repararPieza() {
        System.out.println("Reparando pieza de vehículo...");
        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.next();

        Vehiculo vehiculo = vehiculos.get(matricula);
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }
        private static void repararPieza () {
            System.out.println("Reparando pieza de vehículo...");

            // Simulamos algunas piezas disponibles para reparar
            String[] piezasDisponibles = {"Motor", "Frenos", "Embrague", "Suspensión", "Luces"};

            // Mostramos las piezas disponibles
            System.out.println("Piezas disponibles para reparar:");
            for (int i = 0; i < piezasDisponibles.length; i++) {
                System.out.println((i + 1) + ". " + piezasDisponibles[i]);
            }

            System.out.print("Ingrese el número de pieza a reparar: ");
            int numeroPieza = scanner.nextInt();

            // Validamos la selección de la pieza
            if (numeroPieza < 1 || numeroPieza > piezasDisponibles.length) {
                System.out.println("Número de pieza no válido.");
                return;
            }
        }
    }
}
