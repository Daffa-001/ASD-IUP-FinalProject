import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    List<Restaurant> restaurantList;

    public RestaurantManager() {
        restaurantList = new ArrayList<>();
        populateRestaurants();
    }

    private void populateRestaurants() {
        restaurantList.add(new Restaurant("Warung Tegal", 1, 0.5));
        restaurantList.add(new Restaurant("Fancy Steakhouse", 5, 4.2));
        restaurantList.add(new Restaurant("Burger King", 2, 1.0));
        restaurantList.add(new Restaurant("Sushi Tei", 4, 3.5));
        restaurantList.add(new Restaurant("Soto Lamongan", 1, 2.1));
    }

    // --- ALGORITHM: SELECTION SORT (Sort by Price: Low to High) ---
    // Why Selection Sort? It's easy to explain: "We look for the cheapest, put it first, then repeat."
    public void sortByPrice() {
        int n = restaurantList.size();

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element (Cheapest) in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (restaurantList.get(j).priceLevel < restaurantList.get(minIndex).priceLevel) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            Restaurant temp = restaurantList.get(minIndex);
            restaurantList.set(minIndex, restaurantList.get(i));
            restaurantList.set(i, temp);
        }
    }

    public void showRestaurants() {
        System.out.println("\n--- NEARBY RESTAURANTS (Sorted by Price) ---");
        System.out.println(String.format("%-20s | %-5s | %s", "NAME", "PRICE", "DISTANCE"));
        System.out.println("------------------------------------------------");
        for (Restaurant r : restaurantList) {
            System.out.println(r);
        }
        System.out.println("------------------------------------------------");
    }
}