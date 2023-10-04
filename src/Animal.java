// Clase para registro de animales
public class Animal {
    //Atributos de los animales
    private String name;
    private int age;
    private String species;
    private String race;
    private String healthStatus;
    private String description;

    //Creacion de un constructor vacio y constructor con parametros definidos.

    public Animal(String name, int age, String race, String healthStatus, String description) {
    }

    public Animal(String name, int age, String species, String race, String healthStatus, String description) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.race = race;
        this.healthStatus = healthStatus;
        this.description = description;
    }

    // Creacion de los metodos  Getters y setters de esta clase


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEstadoSalud() {
        return healthStatus;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.healthStatus = estadoSalud;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }

    // Método para imprimir la información del animal
    public void imprimirInformacion() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Especie: " + species);
        System.out.println("Raza: " + race);
        System.out.println("Estado de Salud: " + healthStatus);
        System.out.println("Descripción: " + description);
    }
}
