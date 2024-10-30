import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    private String contact;
    private String email;

    //Getters and Setters

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() { return specialization; }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContact() { return contact; }

    public void setContact(String contact) {
        this.contact = contact;

    }

    public getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

}