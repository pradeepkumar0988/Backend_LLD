package library_management_system;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author, "NovelBook");
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {

    }
}
