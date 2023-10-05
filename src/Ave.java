public class Ave extends Animal {

    private String tipoPico;
    private String colorPlumaje;
    private String habitat;

    public Ave(String nombre, int edad, String raza, String estadoSalud, String descripcion,
               String tipoPico, String colorPlumaje, String habitat) {
        super(nombre, edad, "Ave", raza, estadoSalud, descripcion);
        this.tipoPico = tipoPico;

    }
}
