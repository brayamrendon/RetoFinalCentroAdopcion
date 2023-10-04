public class Perro extends Animal {
    private String size;
    private String furColor;
    private String behavior;

    public Perro(String name, int age, String race, String healthStatus,
                 String description, String size, String furColor, String behavior) {
        super(name, age, "Perro", race, healthStatus, description);
        this.size = size;
        this.furColor = furColor;
        this.behavior = behavior;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tamanio: " + size);
        System.out.println("Color del Pelaje: " + furColor);
        System.out.println("Comportamiento: " + behavior);
    }
}
