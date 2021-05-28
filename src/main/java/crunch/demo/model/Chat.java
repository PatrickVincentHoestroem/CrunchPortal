package crunch.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private long supportnameID;
    private String costumer;
    private long supportCaseID;

    public Chat(long ID, long supportnameID, String costumer, long supportCaseID) {
        this.ID = ID;
        this.supportnameID = supportnameID;
        this.costumer = costumer;
        this.supportCaseID = supportCaseID;
    }

    public Chat() {

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getSupportnameID() {
        return supportnameID;
    }

    public void setSupportnameID(long supportnameID) {
        this.supportnameID = supportnameID;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public long getSupportCaseID() {
        return supportCaseID;
    }

    public void setSupportCaseID(long supportCaseID) {
        this.supportCaseID = supportCaseID;
    }
}
