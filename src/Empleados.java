import java.time.LocalDate;

public class Empleados {
    private int id;
    private String name;
    private String rol;
    private LocalDate dateOfHire;

    public Empleado() {
        this.id = id;
        this.name = name;
        this.rol = rol;
        this.dateOfHire = dateOfHire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
