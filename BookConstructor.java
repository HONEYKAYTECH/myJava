class Book{
    String title;
    String author;
    double price;

    Book(){
    title = "Untitled";
    author = "Unknown";
    price = 0;

}
   Book(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
   }
}
public class BookConstructor{
    public static void main(String[] args){
        Book book = new Book("Things Fall Apart", "Chinua Achebe" , 50);

        System.out.println(book.title);
    }
}

