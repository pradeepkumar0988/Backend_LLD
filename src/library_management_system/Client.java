package library_management_system;

public class Client{

    public static void main(String[] args) {

        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        Book book1 = new TextBook("123", "NCERT", "Author1", "Science", 1);
        Book book2 = new NovelBook("456", "Champak", "Author2", "comics");

        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);

        User user1 = new Member("M1", "0987654321");
        User user2 = new Librarian("55", "L1", "1234567890");

        libraryManagementSystem.registerUser(user1);
        libraryManagementSystem.registerUser(user2);

        if(book1.lend(user1)) {
            System.out.println("Book Lend Successfully");
        }

        if(book1.lend(user2)) {
            System.out.println("Book Lend Successfully");
        } else {
            System.out.println("Book is already lend");
        }

        book1.returnBook(user1);

        if(book1.lend(user2)) {
            System.out.println("Book Lend Successfully");
        } else {
            System.out.println("Book is already lend");
        }
    }

}
