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

    public void removeItem(String name) {

    }

    public List<PizzaPolozky> getMenuItems() {
        return menuItems;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
