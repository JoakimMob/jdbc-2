package se.iths;

public class Album {

    private final Long id;
    private String title;


    public Album(Long id, String name) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String toString() {
        return id + " -> " + title;
    }
}
