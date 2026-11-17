package lms;
import lms.model.Book;
import lms.model.DVD;
import lms.model.Staff;
import lms.service.Library;
import lms.model.LibraryItem;
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book b1 = new Book("B001", "Clean Code", "Robert C. Martin"
        );
        Book b2 = new Book("B002", "Effective Java", "Joshua Bloch"
        );
        DVD d1 = new DVD("D001", "Introduction to Algorithms", 120
        );
        library.addItem(b1);
        library.addItem(b2);
        library.addItem(d1);
        Book b = new Book("B009", "Test Book", "Someone");
        LibraryItem same = b;
        LibraryItem item = d1;
        DVD dvd = (DVD) item;
        System.out.println(dvd.getDurationMinutes());
        library.addItem(b);
        library.addItem(same);
        Staff staff = new Staff("S001", "Nadeesha Perera"
        );
        library.addMember(staff);
        library.listItems();

        System.out.println();
        library.listMembers();

        System.out.println();
        library.printAllLateFees(3);
        System.out.println();
        library.streamIfPossible(d1);
        library.streamIfPossible(b1);
    }

}