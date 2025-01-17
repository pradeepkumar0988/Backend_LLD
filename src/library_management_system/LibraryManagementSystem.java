package library_management_system;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    List<Book> bookInventory;
    List<User> registeredUsers;

    LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public Book searchBook(String criteria) {
        for (Book book : bookInventory) {
            if(book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBook(String criteria, String type) {
        for (Book book : bookInventory) {
            if((book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria)) && book.getType().equalsIgnoreCase(type)) {
                return book;
            }
        }
        return null;
    }
}
