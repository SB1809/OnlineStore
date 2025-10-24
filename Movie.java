public class Movie extends ItemForSale
{
    private String title;
    private String releaseDay;
    private Author creator;
    private double duration;
    private double price;

    public Movie(String title, String releaseDay, Author creator, double duration, double price){
        this.title = title;
        this.releaseDay = releaseDay;
        this.creator = creator;
        this.duration = duration;
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

    public double getDuration(){
        return duration; 
    }

    public double getPrice(){
        return price;  
    }

    public String getBday(){
        return creator.getBday();
    }

}
