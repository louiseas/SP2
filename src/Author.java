import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title>titles;


    public Author(String name){
    this.name = name;
    this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
    titles.add(title);
    }

    public double calculateRoyalties(){
        double total = 0;
        for(Title t: titles){
            total += calculateRoyalties();
        }
        return Math.round(total*100.0)/100.0;
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
