public class SolicitudAdopcion {
    private Adoptante adoptante;
    private Animal animal;

    public SolicitudAdopcion(Adoptante adoptante, Animal animal) {
        this.adoptante = adoptante;
        this.animal = animal;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public Animal getAnimal() {
        return animal;
    }
}
