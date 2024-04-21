package Models;

public class MedicinesPrescriptions {
    
    private String id, amount, fkIdMedicine, fkIdPrescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFkIdMedicine() {
        return fkIdMedicine;
    }

    public void setFkIdMedicine(String fkIdMedicine) {
        this.fkIdMedicine = fkIdMedicine;
    }

    public String getFkIdPrescription() {
        return fkIdPrescription;
    }

    public void setFkIdPrescription(String fkIdPrescription) {
        this.fkIdPrescription = fkIdPrescription;
    }
}
