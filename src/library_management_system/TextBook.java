package library_management_system;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author, "TextBook");
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Subject : " + subject + "\nEdition : " + edition);
    }
}
