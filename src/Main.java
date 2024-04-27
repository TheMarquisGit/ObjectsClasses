public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Роззи", "Сброззи");
        Author author2 = new Author("Рэй", "Грэй");
        Book book1 = new Book("Бубль Гум моего детства", author1, 1970);
        Book book2 = new Book("451 градус моего терпения", author2, 1950);

        book1.setPublicationYear(1955);
        System.out.println(book1);
        System.out.println(book2);
    }
}