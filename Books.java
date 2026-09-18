class Book{
    String title;
    String author;
    double price;
} 
public class Books{
    public static void main(String[]args){
        Book book1 = new Book();
        book1.title = "My mother";
        book1.author = "Chinua Achebe";
        book1.price = 2000;

        Book book2 = new Book();
        book2.title = "Micky Mouse";
        book2.author = "Mariam";
        book2.price = 3000;

        Book book3 = new Book();
        book3.title = "Cat and Rat";
        book3.author = "Oyin";
        book3.price = 5000;

        System.out.println(book1.title);
        System.out.println("written by " + book1.author);
        System.out.println( "sold at the rate of " + book1.price);

        System.out.println(book2.title);
        System.out.println("written by " + book2.author);
        System.out.println( "sold at the rate of " + book2.price);

        System.out.println(book3.title);
        System.out.println("written by " + book3.author);
        System.out.println( "sold at the rate of " + book3.price);
    }
}