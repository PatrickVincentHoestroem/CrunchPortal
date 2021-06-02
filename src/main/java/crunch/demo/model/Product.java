package crunch.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long supportnameID;
    private String notification;
    private String name;


    public Product(long id, long supportnameID, String notification, String name) {
        this.id = id;
        this.supportnameID = supportnameID;
        this.notification = notification;
        this.name = name;
    }

    public Product() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSupportnameID() {
        return supportnameID;
    }

    public void setSupportnameID(long supportName) {
        this.supportnameID = supportName;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
