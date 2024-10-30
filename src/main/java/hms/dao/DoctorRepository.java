import org.springframework.data.jpa.repository.JpaRepository;
import hms.model.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    
}