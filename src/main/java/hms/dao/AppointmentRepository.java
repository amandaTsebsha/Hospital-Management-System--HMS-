import org.springframework.data.jpa.repository.JpaRepository;
import hms.model.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    
}