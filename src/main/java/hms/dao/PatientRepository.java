import org.springframework.data.jpa.repository.JpaRepository;
import hms.model.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
