package library_management_system;

public class Librarian extends User {

    private String employeeNumber;

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian dashboard");
        System.out.println("Name: "+getName());
        System.out.println("Employee Number: "+ employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBook() {

    }

    public void addBook(Book book) {}
    public void removeBook(Book book) {}
}
