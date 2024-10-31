import hms.model.Patient;
import hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;


    @GetMapping
    public String listPatients(Model model) {

        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patient/patient_list";
    }

    @GetMapping("/new")
    public String showPatientForm(Model model)  {

        model.addAttribute("patient", new Patient());
        return "patient/patient_form";
    }

    @PostMapping
    public String savePatient(@ModelAttribute("patient") Patient patient)  {

        patientService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("edit/{id}")
    public StringeditPatient(@PathVariable long id, Model model)  {
        
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);

        return "patient/patient_form";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {

        patientService.deletePatient(id);
    }


}