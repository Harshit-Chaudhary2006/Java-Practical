class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}
 public class Constructor {
    public static void main(String[] args) {
     System.out.println(" Default Construtor ");
       Book book1 = new Book();
        book1.display();

     System.out.println(" Parameterized Construtor ");
       Book book2 = new Book("Java Programming", "James Gosling", 550);
        book2.display();
        
     System.out.println(" Copy Construtor ");
        Book book3 = new Book(book2);
        book3.display();
        book3.title = "Advanced Java";
        book3.price = 750;
        
     System.out.println("Original Book:");
        book2.display();
     System.out.println("Copied Book:");
        book3.display();
    }
}

