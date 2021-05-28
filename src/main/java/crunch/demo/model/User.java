package crunch.demo.model;

public class User {

    private long ID;
    private String name;
    private String userType;


    public User(long ID, String name, String userType) {
        this.ID = ID;
        this.name = name;
        this.userType = userType;
    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
