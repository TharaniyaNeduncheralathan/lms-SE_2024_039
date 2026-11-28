package lms;

import model.*;
import service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book(
                "Clean Code",
                "Robert C. Martin"
        );

        DVD dvd = new DVD(
                "Introduction to Algorithms",
                "CLRS"
        );

        Magazine magazine = new Magazine(
                "Software Weekly",
                "Editorial Team",
                10
        );

        Student student =
                new Student("Nadeesha Perera");

        Staff staff =
                new Staff("Mr. Kasun Silva");

        library.addItem(book);
        library.addItem(dvd);
        library.addItem(magazine);

        library.addMember(student);
        library.addMember(staff);

        System.out.println("--- Late fees if 3 day(s) late ---");
        System.out.println(book.getTitle() + ": " + book.calculateLateFee(3));
        System.out.println(dvd.getTitle() + ": " + dvd.calculateLateFee(3));
        System.out.println(magazine.getTitle() + ": " + magazine.calculateLateFee(3));

        System.out.println("\n--- Loans ---");
        library.lend(book, student);
        library.lend(book, staff);
        library.lend(dvd, staff);
        library.lend(magazine, staff);

        System.out.println("\n--- Reservations ---");
        library.reserveIfPossible(book, staff);
        library.reserveIfPossible(dvd, staff);

        System.out.println("\n--- Members ranked by activity ---");
        library.printMembersByActivity();
    }
}