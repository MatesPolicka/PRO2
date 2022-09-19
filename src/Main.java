import models.PizzaMenu;
import models.PizzaPolozky;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        int num = 10;
        int num2 = 20;
        if (num == num2) {
            System.out.println("num = num2");
        } else if (num < num2) {
            System.out.println("num < num2");
        }

        boolean b1 = false;

        String text1 = "text";
        String text2 = "text";

        if (text1 == text2) {
            System.out.println("text1=text2");
        } else {
            System.out.println("text1!=text2");
        }

        PizzaPolozky polozka1 = new PizzaPolozky(190, "Hawai", "Ananas");
        PizzaPolozky polozka2 = new PizzaPolozky(180, "Šunka", "Šunka");
        PizzaPolozky polozka3 = polozka1;

        if(polozka1==polozka2) {
            System.out.println("polozka1 = polozka2");
        }
        else System.out.println("polozka1 != polozka2");

        if(polozka1==polozka3) {
            System.out.println("polozka1 = polozka3");
        }
        else System.out.println("polozka1 != polozka3");

        polozka3.setPrice(200);

        System.out.println("Polozka1 cena:" + polozka1.getPrice());

        System.out.println(polozka1);

        List<PizzaPolozky> PizzaItems = new ArrayList<>();
        PizzaItems.add(polozka1);
        PizzaItems.add(polozka2);
        PizzaItems.add(polozka3);

        for (PizzaPolozky item:
             PizzaItems) {
            System.out.println(item);
        }

        PizzaPolozky itemFromList = PizzaItems.get(1);
        System.out.println(itemFromList);

        System.out.println("_______________");

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(polozka1);
        menu1.addItem(polozka2);
        System.out.println(menu1.getMenuItems());
        System.out.println(menu1.getLastUpdate());

        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
    }
}
