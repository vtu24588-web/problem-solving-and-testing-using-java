import java.util.*;

class Item {
    String name;
    double rating;

    Item(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        // Example data
        items.add(new Item("ItemA", 8.8));
        items.add(new Item("ItemB", 7.5));
        items.add(new Item("ItemC", 8.6));
        items.add(new Item("ItemD", 7.9));
        items.add(new Item("ItemE", 8.4));

        double threshold = 8.0;
        List<Item> filtered = new ArrayList<>();

        for (Item item : items) {
            if (item.rating >= threshold) {
                filtered.add(item);
            }
        }

        Collections.sort(filtered, (a, b) -> {
            if (b.rating != a.rating) {
                return Double.compare(b.rating, a.rating);
            }
            return a.name.compareTo(b.name);
        });

        for (Item item : filtered) {
            System.out.println(item.name + " " + item.rating);
        }
    }
}
