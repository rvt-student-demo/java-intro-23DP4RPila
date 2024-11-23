package lv.rvt;

public class Book {
String author;
String name;
int pages = 0;

public Book(String authorName, String bookName, int bookPages) {
this.author = authorName;
this.name = bookName;
this.pages = bookPages;

}

public String getAuthor() {
return author;
}

public String getName() {
return name;
}

public int getPages() {
return pages;
}

public String toString(){
    return this.author + ", " + this.name + ", " + this.pages;
}

}