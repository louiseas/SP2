public class EAudioBook extends NetTitle implements IAudioBook{

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints(){
        return (durationInMinutes/2.0) * convertLiteratureType() * (getReach() * 5) + (getAvailability()* 0.5) + getUse();
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
