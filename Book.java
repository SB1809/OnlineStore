
public class Book extends ItemForSale
{
    private String title;
    private String releaseDay;
    private Author creator;
    private String publisher;
    private double price;

    public Book(String title, String releaseDay, Author creator, String publisher, double price){
        this.title = title;
        this.releaseDay = releaseDay;
        this.creator = creator;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle(){
        return title; 
    }

    public String getReleaseDay(){
        return releaseDay; 
    }

    public Author getCreator(){
        return creator;
    }

    public int getPublisher(){
        return publisher; 
    }

    public double getPrice(){
        return price;  
    }

    public String getBday(){
        return creator.getBday();
    }
}
