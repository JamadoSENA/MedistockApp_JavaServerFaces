package Models;

public class Scheduling {
    
    private String idScheduling, reason, status, fkIdUser;

    public String getIdScheduling() {
        return idScheduling;
    }

    public void setIdScheduling(String idScheduling) {
        this.idScheduling = idScheduling;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFkIdUser() {
        return fkIdUser;
    }

    public void setFkIdUser(String fkIdUser) {
        this.fkIdUser = fkIdUser;
    }    
}
