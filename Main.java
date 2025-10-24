//Sophia Babayev, 10/21/2025
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book("No Longer Human", new Author("Osamu Dazai", "June 19, 1909"), "1909", 15.00, "something");
         s.addItem(b);
         s.creator("Osamu Dazai");
         s.addItem(new Movie("Inception", new Author("Christopher Nolan", "July 30, 1970"), "2010", 12.00, 148));
         s.creator("Christopher Nolan");
        System.out.println(b instanceof ItemForSale);
     }
}
