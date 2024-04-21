package Models;

public class Prescription {
    
    private String idPrescription, medicines, fkIdDiagnosis;

    public String getIdPrescription() {
        return idPrescription;
    }

    public void setIdPrescription(String idPrescription) {
        this.idPrescription = idPrescription;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getFkIdDiagnosis() {
        return fkIdDiagnosis;
    }

    public void setFkIdDiagnosis(String fkIdDiagnosis) {
        this.fkIdDiagnosis = fkIdDiagnosis;
    }
}
