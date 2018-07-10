package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's pancake breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("Regular","Regular Pancakes with fried eggs,sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
