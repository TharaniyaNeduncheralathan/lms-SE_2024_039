package model;

public class DVD extends LibraryItem {

    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 25.0;
    }
}