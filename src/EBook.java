public class EBook extends NetTitle{

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages(){
        double pages = (characters / 1800.0)+20;
        if(illustrated){
            pages *=  1.10;
        }
        return pages;

    }

    @Override
    protected double calculatePoints(){
        return calculatePages() * convertLiteratureType() * (getReach() * 5) + (getAvailability()* 0.5) + getUse();
        //Beregnede sider × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
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
