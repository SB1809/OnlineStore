//Sophia Babayev, 10/21/2025, Your main method to test the Store, ItemForSale, Book, Movie, and Author classes
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        // public Book(String title, String releaseDay, Author creator, String publisher, double price)
         Book b = new Book("No Longer Human", "1909", new Author("Osamu Dazai", "June 19, 1909"), "hi",15.00 );
         s.addItem(b);
         s.creator("Osamu Dazai");
         //public Movie(String title, String releaseDay, Author creator, double duration, double price)
         s.addItem(new Movie("Inception", "2010", new Author("Christopher Nolan", "July 30, 1970"), 148, 12.00));
         s.creator("Christopher Nolan");
        
     }
}
