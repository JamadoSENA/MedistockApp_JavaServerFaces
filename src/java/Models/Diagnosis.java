package Models;

public class Diagnosis {
    
    private String idDiagnosis, description, fkIdAppointment;

    public String getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(String idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFkIdAppointment() {
        return fkIdAppointment;
    }

    public void setFkIdAppointment(String fkIdAppointment) {
        this.fkIdAppointment = fkIdAppointment;
    }
}
