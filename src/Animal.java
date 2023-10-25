import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    //Atributos de los animales
    private String name;
    private int age;
    private String species;
    private String race;
    private String healthStatus;
    private String description;
    private int id; // Agregar un ID único para cada animal


    //Creacion de  constructor con parametros definidos.

    public Animal(String name, int age, String race, String healthStatus, String description, int id) {
    }

    public Animal() {
        this.name = name;
        this.age = age;
        this.species = species;
        this.race = race;
        this.healthStatus = healthStatus;
        this.description = description;
        this.id= id;
    }

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

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
