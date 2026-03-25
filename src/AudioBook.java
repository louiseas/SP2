public class AudioBook extends PhysicalTitle implements IAudioBook{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }


    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoint() {
        return (getDurationInMinutes()*0.5) * convertLiteratureType() * copies;
    }

}
