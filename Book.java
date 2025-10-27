//Sophia Babayev, 10/21/2025, Represents a book item for sale in the store
public class Book extends ItemForSale
{
   
    private String publisher;

    public Book(String title, String releaseDay, Author creator, String publisher, double price){
        super(price, title, creator, releaseDay);
        this.publisher = publisher;

    }

    

    public String getPublisher(){
        return publisher; 
    }

    public String getBday(){
        return getCreator().getBday();
    }
}
