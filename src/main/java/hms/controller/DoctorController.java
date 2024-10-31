import hms.model.Doctor;
import hms.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public String listDoctors(Model model) {

        List<Doctor> doctor = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);

        return "doctor/doctor_list";
    }

    @GetMapping("/new")
    public String showDoctorForm(Model model) {

        model.addAttribute("doctor", new Doctor());
        return "doctor/doctor_form"

    }

    @PostMapping
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {

        doctorService.saveDoctor(doctor);
        return "redirect:/doctors";

    }

    @GetMapping("/edit/{id}")
    public String editDoctor(@PathVariable Long id, Model model) {

        Doctor doctor = doctorService.getDoctorById(id);
        model.addAttribute("doctor", doctor);
        return "doctor/doctor_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteDoctor(@PathVariable Long id) {

        doctorService.deleteDoctor(id);
        return "redirect:/doctors";
    }


}