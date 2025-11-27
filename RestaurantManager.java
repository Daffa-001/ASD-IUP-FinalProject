import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; // Diperlukan untuk filtering data berdasarkan lokasi

public class RestaurantManager {
    List<Restaurant> restaurantList;

    public RestaurantManager() {
        restaurantList = new ArrayList<>();
        populateRestaurants();
    }

    private void populateRestaurants() {
        // PERHATIAN: Constructor Restaurant harus menerima 4 parameter: Name, Price, Distance, dan Area

        // --- DATA SURABAYA PUSAT (5 Item) ---
        restaurantList.add(new Restaurant("Bebek Sinjay", 2, 1.2, "PUSAT"));
        restaurantList.add(new Restaurant("Pecel Pincuk", 1, 0.8, "PUSAT"));
        restaurantList.add(new Restaurant("Gudeg Yu Djum", 3, 2.0, "PUSAT"));
        restaurantList.add(new Restaurant("Soto Madura", 2, 1.0, "PUSAT"));
        restaurantList.add(new Restaurant("Sop Iga Cak Top", 4, 1.5, "PUSAT"));

        // --- DATA SURABAYA TIMUR (5 Item) ---
        restaurantList.add(new Restaurant("Sate Klopo", 3, 2.5, "TIMUR"));
        restaurantList.add(new Restaurant("Rujak Cingur A", 2, 1.0, "TIMUR"));
        restaurantList.add(new Restaurant("Lontong Balap", 1, 1.8, "TIMUR"));
        restaurantList.add(new Restaurant("Depoto", 4, 3.2, "TIMUR"));
        restaurantList.add(new Restaurant("Bakso Pak Eko", 1, 0.7, "TIMUR"));

        // --- DATA SURABAYA BARAT (5 Item) ---
        restaurantList.add(new Restaurant("Rawon Kalkulator", 2, 1.5, "BARAT"));
        restaurantList.add(new Restaurant("Nasi Goreng Merah", 1, 3.0, "BARAT"));
        restaurantList.add(new Restaurant("Soto Ayam B", 2, 0.7, "BARAT"));
        restaurantList.add(new Restaurant("Ikan Bakar", 3, 2.1, "BARAT"));
        restaurantList.add(new Restaurant("Mie Ayam C", 1, 1.9, "BARAT"));
    }

    // --- ALGORITHM: SELECTION SORT (Sort by Price: Low to High) ---
    public void sortByPrice(List<Restaurant> listToSort) { // Modifikasi: menerima list
        int n = listToSort.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (listToSort.get(j).priceLevel < listToSort.get(minIndex).priceLevel) {
                    minIndex = j;
                }
            }
            // Swap
            Restaurant temp = listToSort.get(minIndex);
            listToSort.set(minIndex, listToSort.get(i));
            listToSort.set(i, temp);
        }
    }

    // --- MODIFIKASI: MENAMPILKAN RESTORAN BERDASARKAN WILAYAH ---
    public void showRestaurants(String filterArea) {

        // 1. Filter Data Berdasarkan Wilayah yang Diinput Pengguna
        List<Restaurant> filteredList = restaurantList.stream()
                .filter(r -> r.area.equalsIgnoreCase(filterArea))
                .collect(Collectors.toList());

        // JIKA WILAYAH TIDAK DITEMUKAN: Tampilkan data keseluruhan
        if (filteredList.isEmpty()) {
            System.out.println("\n[SYSTEM] Wilayah '" + filterArea + "' tidak dikenali atau tidak memiliki data spesifik.");
            System.out.println("[SYSTEM] Menampilkan data keseluruhan (Semua Wilayah) untuk perbandingan.");
            filteredList = restaurantList;
            filterArea = "Semua Wilayah";
        }

        // 2. Sorting data yang sudah difilter
        // Panggil Selection Sort pada filteredList
        sortByPrice(filteredList);

        // 3. Tampilkan Hasil
        System.out.println("\n--- RESTORAN DI WILAYAH " + filterArea.toUpperCase() + " (Sorted by Price) ---");
        System.out.println(String.format("%-20s | %-5s | %s", "NAME", "PRICE", "DISTANCE"));
        System.out.println("------------------------------------------------");
        for (Restaurant r : filteredList) { // Loop melalui list yang sudah diurutkan
            System.out.println(r);
        }
        System.out.println("------------------------------------------------");
    }

    // Catatan: Anda perlu memanggil showRestaurants(userLocation) di DecisionTreeSystem.
}