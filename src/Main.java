import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RegistroAnimales registro = new RegistroAnimales();

        System.out.println("Ingrese los datos del animal:");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        System.out.print("Raza: ");
        String race = scanner.nextLine();

        System.out.print("Estado de Salud: ");
        String healthStatus = scanner.nextLine();

        System.out.print("Descripción: ");
        String description = scanner.nextLine();

        System.out.print("Elija el tipo de animal (1 para Perro, 2 para Gato): ");
        int tipoAnimal = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        Animal animal;
        if (tipoAnimal == 1) {
            System.out.print("Tamaño del Perro (Pequeño, Mediano, Grande): ");
            String size = scanner.nextLine();
            System.out.print("Color del Pelaje: ");
            String furColor = scanner.nextLine();
            System.out.print("Comportamiento: ");
            String behavior = scanner.nextLine();
            animal = new Perro(name, age, race, healthStatus, description, size, furColor, behavior);
        } else if (tipoAnimal == 2) {
            System.out.print("Tamaño del Gato (Pequeño, Mediano, Grande): ");
            String size = scanner.nextLine();
            System.out.print("Color del Pelaje: ");
            String furColor = scanner.nextLine();
            System.out.print("Nivel de Actividad: ");
            String activityLevel = scanner.nextLine();
            animal = new Gato(name, age, race, healthStatus, description, size, furColor, activityLevel);
        } else {
            System.out.println("Tipo de animal no válido.");
            return;
        }

        registro.agregarAnimal(animal);

        System.out.println("Animal registrado con éxito.");
        System.out.println("Lista de animales en la base de datos:");
        registro.imprimirListaAnimales();


    }
}