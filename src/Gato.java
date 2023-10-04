public class Gato extends Animal{
    private String size;
    private String furColor;
    private String activityLevel;

    public Gato(String name, int age, String race, String healthStatus,
                String description, String size, String furColor, String activityLevel) {
        super(name, age, "Gato", race, healthStatus, description);
        this.size = size;
        this.furColor = furColor;
        this.activityLevel = activityLevel;
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

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tamaño: " + size);
        System.out.println("Color del Pelaje: " + furColor);
        System.out.println("Nivel de Actividad: " + activityLevel);
    }
}
