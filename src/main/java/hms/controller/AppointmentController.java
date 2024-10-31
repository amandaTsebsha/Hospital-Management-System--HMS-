import hms.model.Appointment;
import hms.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping
    public String listAppointments(Model model) {

        List<Appointment> appointments =
        appointmentService.getAllAppointments();
        model.addAttribute("appointments", appointments);
        return "appointment/appointment_list";
    }


    @GetMapping("/new")
    public String showAppointmentForm(Model model) {

        model.addAttribute("appointment", new Appointment());
        return "appointment/appointment_form";
    }


    @PostMapping
    public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {

        appointmentService.saveAppointment(appointment);
        return "redirect:/appointments";
    }


    @GetMapping("/edit/{id}")
    public String editAppointment(@PathVariable Long id, Model model)  {

        Appointment appointment = appointmentService.getAppointmentById(id);
        model.addAttribute("appointment", appointment);
        return "appointment/appointment_form";
    }


    @GetMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable Long id) {

        appointmentService.deleteAppointment(id);
        return "redirect:/appointments";
    }
}