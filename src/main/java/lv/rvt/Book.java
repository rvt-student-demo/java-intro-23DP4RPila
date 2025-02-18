package lv.rvt;


public class Book {

    String author;
    String book;
    double weight;
    public Book(String author, String book, double weight) {
        author = this.author;
        book = this.book;
        weight = this.weight;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getBook() {
        return book;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return getAuthor() + ": " + getBook();
    }
}
