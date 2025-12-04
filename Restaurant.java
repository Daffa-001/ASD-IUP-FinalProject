public class Restaurant {
    String name;
    int priceLevel;
    double distanceKm;
    String area;

    public Restaurant(String name, int priceLevel, double distanceKm, String area) {
        this.name = name;
        this.priceLevel = priceLevel;
        this.distanceKm = distanceKm;
        this.area = area;
    }

    @Override
    public String toString() {
        // Logic formatting
        String dollarSigns = new String(new char[priceLevel]).replace("\0", "$");
        return String.format("%-20s | %-5s | %.1f km", name, dollarSigns, distanceKm);
    }
}