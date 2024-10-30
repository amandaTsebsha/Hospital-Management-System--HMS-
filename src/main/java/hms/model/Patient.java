import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient{

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private String name;
    private String dob;
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

    public void setDob(String dob) {
        this.dob = dob;
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