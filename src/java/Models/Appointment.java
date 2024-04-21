package Models;

import java.time.format.DateTimeFormatter;

public class Appointment {

    private String idAppointment, fkIdScheduling, fkIdDoctor;

    private DateTimeFormatter dateHour;

    public String getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(String idAppointment) {
        this.idAppointment = idAppointment;
    }

    public DateTimeFormatter getDateHour() {
        return dateHour;
    }

    public void setDateHour(DateTimeFormatter dateHour) {
        this.dateHour = dateHour;
    }   

    public String getFkIdScheduling() {
        return fkIdScheduling;
    }

    public void setFkIdScheduling(String fkIdScheduling) {
        this.fkIdScheduling = fkIdScheduling;
    }

    public String getFkIdDoctor() {
        return fkIdDoctor;
    }

    public void setFkIdDoctor(String fkIdDoctor) {
        this.fkIdDoctor = fkIdDoctor;
    }

}
