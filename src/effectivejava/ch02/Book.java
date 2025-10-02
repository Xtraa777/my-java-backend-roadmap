package effectivejava.ch02;

public class Book {
    private final String title;
    private final String author;

    private Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static Book of(String title, String author) {
        if (title == null || author == null) {
            throw new NullPointerException();
        }
        return new Book(title, author);
    }

    public static Book createEbook(String title) {
        if (title == null) {
            throw new NullPointerException();
        }
        return new Book(title, "Ebook");
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            '}';
    }

    public static void main(String[] args) {
        System.out.println("정적 팩토리 메서드 실습");

        Book effectiveJava = Book.of("이펙티브 자바", "조슈아 블로크");
        System.out.println("생성된 책1: " + effectiveJava);

        Book cleanCode = Book.createEbook("Clean Code");
        System.out.println("생성된 책2: " + cleanCode);
    }
}
