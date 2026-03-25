import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title>titles;


    public Author(String name){
    this.name = name;
    this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){

    }

    public double calculateRoyalties(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = titles;
    }
}
