public class PrintedBook extends PhysicalTitle{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoint() {
        return pages*convertLiteratureType()*copies;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
