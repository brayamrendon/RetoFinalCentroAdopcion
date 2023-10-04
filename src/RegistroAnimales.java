import java.util.ArrayList;

class RegistroAnimales {
    private ArrayList<Animal> listaAnimales;

    public RegistroAnimales() {
        listaAnimales = new ArrayList<>();
    }

    // Método o funcion que me permite agregar un nuevo animal a la base de datos
    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    // Método o funcion que me permite imprimir la lista de animales en la base de datos
    public void imprimirListaAnimales() {
        for (Animal animal : listaAnimales) {
            animal.imprimirInformacion();
            System.out.println("----------------------------------------------------------------");
        }
    }
}
