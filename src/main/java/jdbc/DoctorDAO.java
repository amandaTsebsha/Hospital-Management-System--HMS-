import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {

    public void addDoctor(Doctor doctor) {

        String sql = "INSERT INTO doctors (name, specialization, contact) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setString(1, doctor.getName());
                statement.setSpecialization(2, doctor.getSpecialization());
                statement.setContact(3, doctor.getContact());
                statement.executeUpdate();

            }
            catch (SQLException e) {
                e.printStackTrace();
            }
    }


    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        String sql = "SELECT * FROM doctors";
        try (Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    Doctor doctor = new Doctor(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("specialization"),
                        resultSet.getString("contact")
                        
                        );

                        doctors.add(doctor);
                    
                }
            }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            return doctors;
    }

    public void updateDoctor(Doctor doctor) {

        String sql = "UPDATE doctors SET name = ?, specialization = ?, contact = ? WHERE id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, doctor.getName());
                statement.setString(2, doctor.getSpecialization());
                statement.setString(3, doctor.getContact());
                statement.setInt(4, doctor.getId());
                            statement.executeUpdate();
            } 
            catch (SQLException e) {
            e.printStackTrace();

            }

    }

    public void deleteDoctor(int id) {

        String sql = "DELETE FROM doctors WHERE id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
            
            PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();

            }
            catch (SQLException e) {
                e.printStackTrace();
            }

    }

}
