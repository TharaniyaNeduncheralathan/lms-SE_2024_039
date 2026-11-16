package lms;
import lms.model.Book;
import lms.model.Member;
import lms.service.Library;

    public class Main {

        public static void main(String[] args) {


            Library library = new Library();


            Book book1 = new Book(
                    "Clean Code",
                    "Robert C. Martin",
                    "978-0132350884"
            );

            Book book2 = new Book(
                    "Effective Java",
                    "Joshua Bloch",
                    "978-0134685991"
            );

            Book book3 = new Book(
                    "The Pragmatic Programmer",
                    "Hunt & Thomas",
                    "978-0135957059"
            );


            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);


            Member member1 = new Member(
                    "M001",
                    "Nadeesha Perera"
            );

            Member member2 = new Member
                    ( "M002",
                    "Kasun Silva"
            );


            library.addMember(member1);
            library.addMember(member2);


            library.listBooks();

            System.out.println();


            library.listMembers();

            System.out.println();


            try {
                Book invalidBook = new Book(
                        "",
                        "Nobody",
                        "000-0000000000"
                );

                library.addBook(invalidBook);

            } catch (IllegalArgumentException e) {
                System.out.println("Rejected invalid book: " + e.getMessage());
            }
        }
    }


