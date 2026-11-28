package model;

public class Book extends LibraryItem implements Reservable {

    private Member reservedBy;

    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 10.0;
    }

    @Override
    public void reserve(Member m) {
        reservedBy = m;
        System.out.println(title + " reserved for " + m.getName());
    }

    @Override
    public void cancelReservation() {
        reservedBy = null;
    }

    @Override
    public boolean isReserved() {
        return reservedBy != null;
    }
}