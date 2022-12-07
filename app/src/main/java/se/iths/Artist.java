package se.iths;

public class Artist {
    private final Long id;
    private String name;


    public Artist(Long id, String name){
        this.id=id;
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id + " -> " + name;
    }
}
