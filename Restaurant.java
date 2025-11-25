public class Restaurant {
    String name;
    int priceLevel; // 1 = Cheap ($), 5 = Expensive ($$$$$)
    double distanceKm;

    public Restaurant(String name, int priceLevel, double distanceKm) {
        this.name = name;
        this.priceLevel = priceLevel;
        this.distanceKm = distanceKm;
    }

    @Override
    public String toString() {
        // Creates a string of '$' based on price level (e.g., 3 becomes "$$$")
        String dollarSigns = new String(new char[priceLevel]).replace("\0", "$");
        return String.format("%-20s | %-5s | %.1f km", name, dollarSigns, distanceKm);
    }
}