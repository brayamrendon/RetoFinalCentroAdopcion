public class Administrador {

String nombre;
int edad;
String rol;

String direccion;

int numtelefono;
    public Administrador(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Administrador(String nombre, int edad, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.rol = rol;
        this.numtelefono = numtelefono;


    }

    public String getNombre() {
        return nombre;
    }

    public int getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(int numtelefono) {
        this.numtelefono = numtelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
