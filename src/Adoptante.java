import java.util.ArrayList;
import java.util.Scanner;
public class Adoptante {
    private int id;
    private String name;
    private String address;
    private String contactNumber;
    private String adoptionPreferences;

    public Adoptante() {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.adoptionPreferences = adoptionPreferences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdoptionPreferences() {
        return adoptionPreferences;
    }

    public void setAdoptionPreferences(String adoptionPreferences) {
        this.adoptionPreferences = adoptionPreferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static ArrayList<Adoptante> adoptanteList = new ArrayList<>();
}
