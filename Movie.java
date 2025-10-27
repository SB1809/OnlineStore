//Sophia Babayev, 10/21/2025, Represents a movie item for sale in the store
public class Movie extends ItemForSale
{
   
    private double duration;
   
    public Movie(String title, String releaseDay, Author creator, double duration, double price){
        super(price, title, creator, releaseDay);
        this.duration = duration;
    }

    public double getDuration(){
        return duration; 
    }

    public String getBday(){
        return getCreator().getBday();
    }

}
