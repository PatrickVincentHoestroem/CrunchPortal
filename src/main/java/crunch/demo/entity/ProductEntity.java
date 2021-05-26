package crunch.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "projects")
@SecondaryTable(name = "users")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer ID;

    /* We want the name of the supporter from a different table!
    @Column(name = "supporterName")
    private String supporter;
    */

    @Column(name = "notification")
    private Boolean notification;

    @Column(name = "name")
    private String name;

    /* Probably not working for a relational database
    @Column(name = "attributes")
    private Map<String, String> attributes;
    */

    public ProductEntity() {}

    public ProductEntity(Boolean notification, String name) {
        this.notification = notification;
        this.name = name;
    }
}
