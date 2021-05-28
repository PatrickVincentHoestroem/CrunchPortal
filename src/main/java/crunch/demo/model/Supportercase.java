package crunch.demo.model;

public class Supportercase {

    private long id;
    private long supportNameID;
    private String name;
    private String description;
    private long chatID;


    public Supportercase(long id, long supportNameID, String name, String description, long chatID) {
        this.id = id;
        this.supportNameID = supportNameID;
        this.name = name;
        this.description = description;
        this.chatID = chatID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSupportNameID() {
        return supportNameID;
    }

    public void setSupportNameID(long supportNameID) {
        this.supportNameID = supportNameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getChatID() {
        return chatID;
    }

    public void setChatID(long chatID) {
        this.chatID = chatID;
    }
}
