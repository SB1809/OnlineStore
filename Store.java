//Sophia Babayev, 10/21/2025, Represents a store that holds items for sale, tracks profit, and provides methods to manage and sell items.
import java.util.ArrayList;
public class Store
{
  double profit;
  ArrayList<ItemForSale> items = new ArrayList<>();
    public Store(){
      profit = 0.0;
    }

    //Precondition: store has been created
    //Postcondition: Shows all items in the store
    public void showItems(){
      for(int i = 0; i < items.size(); i++){
          System.out.println(items.get(i).getTitle());
      }
    }

    //Precondition: item is not already in the store
    //Postcondition: Adds an item to the store's inventory in alphabetical order by titl
    public void addItem(ItemForSale item){
      items.add(item);
      for(int i = 0; i < items.size(); i++){
        if(items.get(i).getTitle().compareTo(item.getTitle()) > 0){
          items.remove(item);
          items.add(i, item);
        }
      }
    }

    //Precondition: item is in the store
    //Postcondition: Sells an item by its title, removing it from inventory and adding its price to profit
    public void sellItem(String itemName){
      for(int i = 0; i < items.size(); i++){
        if(items.get(i).getCreator().getName().equals(itemName)){
          double temp = items.get(i).getPrice();
          items.remove(i);
          profit += temp;
        }
      }
    }

    //Precondition: item is in the store
    //Postcondition: Prints the creator's name of an item given its title
    public void creator(String itemName){
      for(int i = 0; i < items.size(); i++){
        if(items.get(i).getTitle().equals(itemName)){
          System.out.println(items.get(i).getCreator().getName());
        }
      }
    }

}
