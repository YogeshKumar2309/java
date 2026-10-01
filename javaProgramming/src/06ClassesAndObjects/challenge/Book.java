package challenge;

public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks = 0;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public void borrowBook(){
        System.out.println(title + " borrowd");
    }

    public void returnBook(){
        System.out.println(title + " returned");
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    
}
