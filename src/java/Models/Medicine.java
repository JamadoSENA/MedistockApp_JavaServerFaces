package Models;

import java.sql.Date;

public class Medicine {
    
    private String idMedicine, name, format, stock, fkIdCategory, fkIdDiagnosis;

    private Date expirationDate;

    public String getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(String idMedicine) {
        this.idMedicine = idMedicine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFkIdCategory() {
        return fkIdCategory;
    }

    public void setFkIdCategory(String fkIdCategory) {
        this.fkIdCategory = fkIdCategory;
    }

    public String getFkIdDiagnosis() {
        return fkIdDiagnosis;
    }

    public void setFkIdDiagnosis(String fkIdDiagnosis) {
        this.fkIdDiagnosis = fkIdDiagnosis;
    }

}
