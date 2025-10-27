//Sophia Babayev, 10/21/2025, Represents a generic item for sale in the store
public class ItemForSale
{
    private double price;
    private String title;
    private Author creator;
    private String releaseDay;
      
      public ItemForSale(double price, String title, Author creator, String releaseDay){
         this.price = price;
         this.title = title;
         this.creator = creator;
         this.releaseDay = releaseDay;
      }
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
