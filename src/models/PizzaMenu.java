package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaPolozky> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(PizzaPolozky itemToAdd) {
        menuItems.add(itemToAdd);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzaPolozky itemToRemove) {
        menuItems.remove(itemToRemove);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(String itemToRemove) {
        PizzaPolozky toDelete = null;
        for(PizzaPolozky it : menuItems){
            if(it.getName() == itemToRemove){
                toDelete = it;
                break;
            }
        }
        if(toDelete!=null){
            menuItems.remove(toDelete);
        }
    }

    public List<PizzaPolozky> getMenuItems() {
        return menuItems;
    }

    public int getMenuSize(){
        return menuItems.size();
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public boolean equals(Object obj){
        return ((PizzaMenu)obj).getMenuSize() == getMenuSize();
    }
}
