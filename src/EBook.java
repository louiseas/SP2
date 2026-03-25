public class EBook extends NetTitle{

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages(){
        return 0;
    }

    protected double calculatePoints(){
        return 0;
    }

    public int getCharacters() {
        return characters;
    }

    public boolean isIllustrated() {
        return illustrated;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public void setIllustrated(boolean illustrated) {
        this.illustrated = illustrated;
    }
}
