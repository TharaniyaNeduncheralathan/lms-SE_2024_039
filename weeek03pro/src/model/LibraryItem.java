package model;

public abstract class LibraryItem implements Loanable {

    protected String title;
    protected String author;
    protected boolean isBorrowed;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void loan(Member member) {

        if (isBorrowed) {
            System.out.println(title + " is already on loan.");
            return;
        }

        if (member.getBorrowedCount() >= member.getMaxBorrowLimit()) {
            System.out.println(member.getName() + " has reached maximum borrow limit.");
            return;
        }

        isBorrowed = true;
        member.incrementBorrowedCount();

        System.out.println(title + " loaned to " + member.getName());
    }

    @Override
    public void returnItem() {
        isBorrowed = false;
        System.out.println(title + " returned.");
    }

    public abstract double calculateLateFee(int daysLate);
}