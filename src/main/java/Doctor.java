public class Doctor {

    private int id;
    private String name;
    private String Specialization;
    private String contact;


    public Doctor(int id, String name, String Specialization, String contact) {

        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;

    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {return name;}

    public void setName(String name) { this.name = name;}

    public String getSpecialization() {return specialization;}

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContact() {return contact;}

    public voice setContact(String contact) {
        this.contact = contact;
    }

}