package model;

public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 5.0;
    }
}