public class ItemForSale
{
    private double price;
    private String title;
    private Author creator;
    private String releaseDay;

    public ItemForSale(){
        public double getPrice(){
           return price;
        }
        public String getTitle(){
           return title;   
        }
        public Author getCreator(){
           return creator; 
        }
        public String getReleaseDay(){
           return releaseDay; 
        }
        public String getBday(){
           return creator.getBday();
        }
}
