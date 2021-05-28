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
    private long supportName;
    private String notification;
    private String name;


    public Product(long id, long supportName, String notification, String name) {
        this.id = id;
        this.supportName = supportName;
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

    public long getSupportName() {
        return supportName;
    }

    public void setSupportName(long supportName) {
        this.supportName = supportName;
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
