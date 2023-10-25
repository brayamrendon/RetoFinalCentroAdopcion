import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private int id;
    private String name;
    private String rol;
    private String password;

    // Constructor y métodos getters y setters


    public Administrador() {
        this.id = id;
        this.name = name;
        this.rol = rol;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<Administrador> adminList = new ArrayList<>();