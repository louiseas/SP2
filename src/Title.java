public abstract class Title {

    private String title;
    private String literatureType;
    //private double rate = 0.067574;

    protected static final double RATE = 0.067574; //?

    public Title(String title, String literatureType){
    this.title = title;
    this.literatureType = literatureType;
    }

    public double calculateRoyalties(){
        return calculatePoint()*RATE;
    }


    protected double convertLiteratureType(){
        double convertedliteratureType = 0;
        switch (literatureType) {
            case "BI": convertedliteratureType = 3;
            break;
            case "TE": convertedliteratureType = 3;
            break;
            case "LYRIK": convertedliteratureType = 6;
            break;
            case "SKØN": convertedliteratureType = 1.7;
            break;
            case "FAG": convertedliteratureType = 1;

        }
        return convertedliteratureType;
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

    protected abstract double calculatePoints();
}
