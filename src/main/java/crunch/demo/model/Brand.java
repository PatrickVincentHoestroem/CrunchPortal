package crunch.demo.model;

public class Brand {

    private long id;
    private String name;
    private String logo;

    public Brand(long id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public long getId() {
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
