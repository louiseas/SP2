public abstract class NetTitle extends Title{

    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use){
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    @Override
    protected double calculatePoint(){
        return 0;
    }


    protected double getPseudoCopies(){
        return 0;
    }

    private int getUseFactor(){
        return 0;
    }

    public int getAvailability() {
        return availability;
    }

    public int getReach() {
        return reach;
    }

    public int getUse() {
        return use;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public void setUse(int use) {
        this.use = use;
    }
}
