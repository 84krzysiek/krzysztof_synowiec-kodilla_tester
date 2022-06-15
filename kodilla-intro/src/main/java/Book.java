public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
        public static Book of(String author, String title) {//metoda of
        Book book = new Book(author, title);//parametry metody of
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");//obiekt book
        System.out.println(book.author+ " " + book.title);//wyswietla utworzony obiekt


    }
}
