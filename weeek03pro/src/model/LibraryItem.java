package model;
public class LibraryItem {

    private String id;
    private String title;
    private boolean borrowed;

    public LibraryItem(String id, String title) {
        setId(id);
        setTitle(title);
        this.borrowed = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null && !id.trim().isEmpty()) {
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public double calculateLateFee(int daysLate) {
        return daysLate * 10.0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{id='" + id
                + "', title='" + title
                + "', borrowed=" + borrowed + "}";
    }
}
