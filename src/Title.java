public abstract class Title {

    private String title;
    private String literatureType;
    private double rate;

    //protected static final double RATE = 0.067574; //?

    public Title(String title, String literatureType){
    this.title = title;
    this.literatureType = literatureType;
    }

    public double calculateRoyalties(){
        return 0;
    }


    protected double convertLiteratureType(){
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }

    protected abstract double calculatePoint();
}
