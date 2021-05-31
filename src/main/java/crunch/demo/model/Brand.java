package crunch.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {
    /*
    Entity anotation means that its a entity class, wich means that that this class can counicate with the databse.
    Id anotation means that the colum ID chosen.
    @GeneratedValue anotation means that the Id colum is the primary key.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String logo;

    public Brand(long id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public Brand(){

    }

    public long getId(){
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
