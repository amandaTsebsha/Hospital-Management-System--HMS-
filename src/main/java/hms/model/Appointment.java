import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long doctorId;
    private Long patientId;
    private String date;
    private String time;


    // Getters and Setters.
    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    
    }

    public Long getDoctorId() { return doctorId; }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() { return patientId; }

    public void setPatientId(Long patientId) {
        this.patientId = patientId; 
    }

    public String getDate() { return date; }

    public void setDate(String date) {
        this.date = date;

    }

    public String getTime() { return time; }

    public void setTime(String time) {
        this.time = time;
    }


}