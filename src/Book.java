import java.time.LocalDate;

public class Book {
    private String nameBook;
    private Author author;
    private int publicationYear;

    public Book (String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        if (publicationYear > LocalDate.now().getYear()) {
            System.out.println("В книге " + getNameBook() + " неверно указан год публикации " + publicationYear + " , этот год ещё не наступил");
            return;
        }
        this.publicationYear = publicationYear;
    }
    public String toString() {
        return "Название книги: " + nameBook + ", Автор: " + author + ", Год публикации: " + publicationYear;
    }
}
