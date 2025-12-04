import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    List<Recipe> recipeDatabase;

    public RecipeManager() {
        recipeDatabase = new ArrayList<>();
        populateData();
    }

    private void populateData() {
        recipeDatabase.add(new Recipe("Instant Noodles", 5, "Easy", "Noodles, Seasoning Powder, Water, Egg"));
        recipeDatabase.add(new Recipe("Avocado Smoothie", 5, "Easy", "Avocado, Milk, Sugar, Ice"));
        recipeDatabase.add(new Recipe("Tuna Sandwich", 10, "Easy", "Bread, Tuna, Mayo, Lettuce, Tomato"));
        recipeDatabase.add(new Recipe("Omelet", 10, "Easy", "Eggs, Salt, Pepper, Butter, Cheese"));
        recipeDatabase.add(new Recipe("Yogurt Parfait", 5, "Easy", "Yogurt, Granola, Berries"));
        recipeDatabase.add(new Recipe("Boiled Eggs", 12, "Easy", "Eggs, Water, Salt"));
        recipeDatabase.add(new Recipe("Peanut Butter Toast", 5, "Easy", "Bread, Peanut Butter, Banana"));
        recipeDatabase.add(new Recipe("Cheese Quesadilla", 15, "Easy", "Tortilla, Cheese, Salsa"));
        recipeDatabase.add(new Recipe("Tofu Scramble", 15, "Easy", "Tofu, Turmeric, Vegetables"));
        recipeDatabase.add(new Recipe("Mug Cake", 8, "Easy", "Flour, Sugar, Cocoa Powder, Milk"));
        recipeDatabase.add(new Recipe("Garlic Bread", 10, "Easy", "Bread, Butter, Garlic"));
        recipeDatabase.add(new Recipe("Tomato Soup (Canned)", 10, "Easy", "Canned Soup, Milk/Water"));
        recipeDatabase.add(new Recipe("Pancakes (Mix)", 15, "Easy", "Pancake Mix, Milk, Syrup"));
        recipeDatabase.add(new Recipe("Hot Dog", 10, "Easy", "Bun, Hot Dog, Ketchup, Mustard"));
        recipeDatabase.add(new Recipe("Edamame", 10, "Easy", "Edamame Pods, Salt, Water"));
        recipeDatabase.add(new Recipe("Rice Porridge", 20, "Easy", "Cooked Rice, Water, Chicken Stock"));
        recipeDatabase.add(new Recipe("Fruit Salad", 10, "Easy", "Assorted Fruits"));
        recipeDatabase.add(new Recipe("Cereal", 5, "Easy", "Cereal, Milk, Sugar"));
        recipeDatabase.add(new Recipe("Oatmeal Instan", 3, "Easy", "Oats, Air Panas, Madu"));
        recipeDatabase.add(new Recipe("Kentang Rebus", 15, "Easy", "Kentang, Garam, Air"));
        recipeDatabase.add(new Recipe("Puding Cepat Saji", 5, "Easy", "Puding Mix, Susu Dingin"));
        recipeDatabase.add(new Recipe("Roti Panggang Keju", 7, "Easy", "Roti, Keju Slice, Mentega"));
        recipeDatabase.add(new Recipe("Smoothie Pisang", 5, "Easy", "Pisang, Susu Almond, Es"));
        recipeDatabase.add(new Recipe("Telur Mata Sapi", 8, "Easy", "Telur, Minyak, Garam"));
        recipeDatabase.add(new Recipe("Sereal Buah", 5, "Easy", "Sereal, Susu, Potongan Buah"));
        recipeDatabase.add(new Recipe("Waffle Beku", 10, "Easy", "Waffle, Topping Sirup"));
        recipeDatabase.add(new Recipe("Kacang Rebus", 20, "Easy", "Kacang, Garam, Air"));
        recipeDatabase.add(new Recipe("Biskuit Keju", 5, "Easy", "Biskuit, Keju Oles"));
        recipeDatabase.add(new Recipe("Sosis Goreng", 10, "Easy", "Sosis, Minyak"));
        recipeDatabase.add(new Recipe("Salad Alpukat", 15, "Easy", "Alpukat, Lemon, Garam"));
        recipeDatabase.add(new Recipe("Kopi Dingin", 5, "Easy", "Kopi Instan, Air, Es"));
        recipeDatabase.add(new Recipe("Nasi dan Kecap", 5, "Easy", "Nasi Panas, Kecap Manis"));
        recipeDatabase.add(new Recipe("Sayur Kaleng Rebus", 10, "Easy", "Sayur Kaleng, Air"));
        recipeDatabase.add(new Recipe("Keju dan Anggur", 5, "Easy", "Keju Blok, Anggur"));
        recipeDatabase.add(new Recipe("Keripik dan Guacamole", 10, "Easy", "Keripik Tortilla, Alpukat, Bawang"));
        recipeDatabase.add(new Recipe("Pisang Goreng Cepat", 15, "Easy", "Pisang, Tepung Premix"));
        recipeDatabase.add(new Recipe("Mie Instan Kuah", 10, "Easy", "Mie, Bumbu, Air"));
        recipeDatabase.add(new Recipe("Kopi Hitam", 3, "Easy", "Kopi Bubuk, Gula, Air Panas"));


        recipeDatabase.add(new Recipe("Fried Rice", 15, "Medium", "Rice, Soy Sauce, Egg, Garlic, Chili"));
        recipeDatabase.add(new Recipe("Caesar Salad", 20, "Medium", "Romaine Lettuce, Croutons, Parmesan, Dressing"));
        recipeDatabase.add(new Recipe("Grilled Chicken", 45, "Medium", "Chicken Breast, Lemon, Garlic, Spices"));
        recipeDatabase.add(new Recipe("Spaghetti Bolognese", 35, "Medium", "Pasta, Tomato Sauce, Minced Beef, Cheese"));
        recipeDatabase.add(new Recipe("Nasi Campur", 40, "Medium", "Rice, Shredded Chicken, Egg, Sambal, Vegetables"));
        recipeDatabase.add(new Recipe("Tuna Pasta Salad", 30, "Medium", "Pasta, Tuna, Celery, Mayonnaise"));
        recipeDatabase.add(new Recipe("Quick Chili", 40, "Medium", "Ground Beef, Beans, Tomato Paste, Chili Powder"));
        recipeDatabase.add(new Recipe("Baked Potatoes", 45, "Medium", "Potatoes, Butter, Sour Cream, Chives"));
        recipeDatabase.add(new Recipe("Stir-Fry Vegetables", 30, "Medium", "Assorted Veggies, Soy Sauce, Ginger, Garlic"));
        recipeDatabase.add(new Recipe("Meatballs", 40, "Medium", "Ground Beef, Breadcrumbs, Tomato Sauce"));
        recipeDatabase.add(new Recipe("Salmon Patties", 30, "Medium", "Canned Salmon, Egg, Breadcrumbs"));
        recipeDatabase.add(new Recipe("Chicken Fajitas", 45, "Medium", "Chicken Strips, Bell Peppers, Tortillas"));
        recipeDatabase.add(new Recipe("Frittata", 35, "Medium", "Eggs, Milk, Spinach, Feta Cheese"));
        recipeDatabase.add(new Recipe("Chicken Noodle Soup", 45, "Medium", "Chicken Broth, Noodles, Carrots, Celery"));
        recipeDatabase.add(new Recipe("Gado-Gado", 30, "Medium", "Vegetables, Peanut Sauce, Tofu, Tempeh"));
        recipeDatabase.add(new Recipe("Capcay", 35, "Medium", "Vegetables, Chicken/Shrimp, Corn Starch"));
        recipeDatabase.add(new Recipe("Taco Meat", 25, "Medium", "Ground Beef, Taco Seasoning"));
        recipeDatabase.add(new Recipe("Tuna Melt", 20, "Medium", "Bread, Tuna Salad, Cheese"));
        recipeDatabase.add(new Recipe("Scampi", 25, "Medium", "Shrimp, Garlic, Butter, Parsley"));
        recipeDatabase.add(new Recipe("Lemon Chicken", 40, "Medium", "Chicken Thighs, Lemon Juice, Honey"));
        recipeDatabase.add(new Recipe("Shepherd's Pie (Quick)", 45, "Medium", "Ground Meat, Mashed Potatoes"));
        recipeDatabase.add(new Recipe("Sop Tomat Creamy", 30, "Medium", "Tomat, Krim, Bawang, Kaldu Ayam"));
        recipeDatabase.add(new Recipe("Tumis Bayam Bawang", 25, "Medium", "Bayam, Bawang Merah, Bawang Putih"));
        recipeDatabase.add(new Recipe("Ikan Goreng Tepung", 35, "Medium", "Fillet Ikan, Tepung Roti, Minyak"));
        recipeDatabase.add(new Recipe("Pizza Roti Tawar", 25, "Medium", "Roti Tawar, Saus Tomat, Keju, Sosis"));
        recipeDatabase.add(new Recipe("Burger Homemade", 40, "Medium", "Daging Cincang, Roti Burger, Keju"));
        recipeDatabase.add(new Recipe("Sayur Lodeh Praktis", 45, "Medium", "Nangka Muda, Santan, Bumbu Dasar"));
        recipeDatabase.add(new Recipe("Ayam Popcorn Cepat", 30, "Medium", "Ayam Fillet, Tepung Bumbu, Minyak"));
        recipeDatabase.add(new Recipe("Ramen Instan Mewah", 30, "Medium", "Ramen Instan, Telur, Daun Bawang, Daging"));
        recipeDatabase.add(new Recipe("Pepes Tahu Cepat", 40, "Medium", "Tahu, Kemangi, Bumbu Halus"));
        recipeDatabase.add(new Recipe("Sambal Goreng Kentang", 45, "Medium", "Kentang, Cabe Merah, Santan"));
        recipeDatabase.add(new Recipe("Nasi Goreng Kampung", 35, "Medium", "Nasi, Bumbu Ulek, Ayam Suwir"));
        recipeDatabase.add(new Recipe("Fettuccine Alfredo", 30, "Medium", "Pasta, Krim, Keju Parmesan, Butter"));
        recipeDatabase.add(new Recipe("Makaroni Panggang", 45, "Medium", "Makaroni, Keju, Telur, Daging Asap"));
        recipeDatabase.add(new Recipe("Sup Jagung Manis", 35, "Medium", "Jagung, Telur, Air Kaldu"));
        recipeDatabase.add(new Recipe("Tumis Kangkung Terasi", 25, "Medium", "Kangkung, Terasi, Bawang"));
        recipeDatabase.add(new Recipe("Ayam Woku Cepat", 40, "Medium", "Ayam, Bumbu Kuning, Daun Jeruk"));
        recipeDatabase.add(new Recipe("Telur Dadar Sayur", 20, "Medium", "Telur, Wortel, Buncis, Daun Bawang"));
        recipeDatabase.add(new Recipe("Mie Tek Tek Rebus", 30, "Medium", "Mie, Telur, Bumbu Halus"));
        recipeDatabase.add(new Recipe("Steak Daging Sapi (Tipis)", 40, "Medium", "Daging Sapi, Garam, Lada, Mentega"));
        recipeDatabase.add(new Recipe("Sop Iga Sapi Cepat", 45, "Medium", "Iga Sapi Rebus, Wortel, Bumbu Dasar"));


        recipeDatabase.add(new Recipe("Beef Stew", 120, "Hard", "Beef Chunks, Potatoes, Carrots, Broth, Onion"));
        recipeDatabase.add(new Recipe("Chicken Curry", 60, "Hard", "Chicken, Coconut Milk, Curry Paste, Potato"));
        recipeDatabase.add(new Recipe("Soup Buntut", 90, "Hard", "Oxtail, Carrot, Potato, Spices, Celery"));
        recipeDatabase.add(new Recipe("Lasagna", 90, "Hard", "Pasta Sheets, Ricotta, Ground Beef, Marinara"));
        recipeDatabase.add(new Recipe("Roast Chicken", 120, "Hard", "Whole Chicken, Herbs, Root Vegetables"));
        recipeDatabase.add(new Recipe("Beef Rendang", 180, "Hard", "Beef, Coconut Milk, Spices, Chili"));
        recipeDatabase.add(new Recipe("Perkedel Kentang", 60, "Hard", "Potatoes, Ground Meat, Spices, Egg"));
        recipeDatabase.add(new Recipe("Sop Buntut", 90, "Hard", "Oxtail, Spices, Vegetables"));
        recipeDatabase.add(new Recipe("Opor Ayam", 75, "Hard", "Chicken, Coconut Milk, Lemongrass, Galangal"));
        recipeDatabase.add(new Recipe("Gulai Kambing", 120, "Hard", "Lamb, Coconut Milk, Rich Spices"));
        recipeDatabase.add(new Recipe("Sate Lilit", 75, "Hard", "Minced Fish/Meat, Coconut, Lemongrass"));
        recipeDatabase.add(new Recipe("Ayam Betutu", 180, "Hard", "Whole Chicken, Balinese Spices"));
        recipeDatabase.add(new Recipe("Lumpia", 60, "Hard", "Spring Roll Wrappers, Fillings (Bamboo Shoot, Shrimp)"));
        recipeDatabase.add(new Recipe("Nasi Kuning", 60, "Hard", "Rice, Coconut Milk, Turmeric, Spices"));
        recipeDatabase.add(new Recipe("Pindang Bandeng", 90, "Hard", "Milkfish, Tamarind, Turmeric, Chili"));
        recipeDatabase.add(new Recipe("Rendang Daging Sapi", 240, "Hard", "Daging Sapi, Santan Kental, Bumbu Rempah Lengkap"));
        recipeDatabase.add(new Recipe("Gulai Ayam Spesial", 70, "Hard", "Ayam, Santan, Bumbu Gulai, Cabai"));
        recipeDatabase.add(new Recipe("Rawon Daging", 150, "Hard", "Daging, Kluwek, Bumbu Lengkap"));
        recipeDatabase.add(new Recipe("Soto Betawi", 120, "Hard", "Daging, Santan, Susu, Bumbu Dasar"));
        recipeDatabase.add(new Recipe("Nasi Kebuli Kambing", 180, "Hard", "Nasi, Daging Kambing, Rempah Arab"));
        recipeDatabase.add(new Recipe("Tongseng Kambing", 90, "Hard", "Daging Kambing, Kol, Kecap, Tomat"));
        recipeDatabase.add(new Recipe("Semur Jengkol", 120, "Hard", "Jengkol, Kecap Manis, Bumbu Semur"));
        recipeDatabase.add(new Recipe("Kari Kambing India", 150, "Hard", "Kambing, Yogurt, Masala, Jahe"));
        recipeDatabase.add(new Recipe("Ikan Kuah Kuning", 75, "Hard", "Ikan, Kunyit, Kemiri, Jeruk Nipis"));
        recipeDatabase.add(new Recipe("Bebek Goreng Rempah", 90, "Hard", "Bebek, Bumbu Ungkep, Rempah"));
        recipeDatabase.add(new Recipe("Sayur Asem Jakarta", 60, "Hard", "Labu Siam, Kacang Panjang, Asam Jawa"));
        recipeDatabase.add(new Recipe("Krengsengan Daging", 70, "Hard", "Daging Sapi, Kecap, Bawang Merah"));
        recipeDatabase.add(new Recipe("Bacem Tahu Tempe", 90, "Hard", "Tahu, Tempe, Gula Merah, Air Kelapa"));
        recipeDatabase.add(new Recipe("Ayam Kodok", 180, "Hard", "Ayam Utuh, Isi Daging Cincang"));
        recipeDatabase.add(new Recipe("Sop Ikan Batam", 75, "Hard", "Ikan Fillet, Sayuran, Bumbu Rempah"));
        recipeDatabase.add(new Recipe("Gulai Kepala Ikan", 120, "Hard", "Kepala Ikan, Santan, Cabai"));
    }

    // ALGORITHM: MERGE SORT (Sorts by PrepTime)
    public void sortRecipesByTime() {
        recipeDatabase = mergeSort(recipeDatabase);
    }

    private List<Recipe> mergeSort(List<Recipe> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<Recipe> left = new ArrayList<>(list.subList(0, mid));
        List<Recipe> right = new ArrayList<>(list.subList(mid, list.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private List<Recipe> merge(List<Recipe> left, List<Recipe> right) {
        List<Recipe> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).prepTime <= right.get(j).prepTime) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        merged.addAll(left.subList(i, left.size()));
        merged.addAll(right.subList(j, right.size()));
        return merged;
    }

    // ALGORITHM: LINEAR SEARCH (Filter by Name or Ingredient)
    public void filterRecipes(String keyword) {
        System.out.println("\n[SEARCH] Searching for recipes with: '" + keyword + "'...");

        List<Recipe> results = new ArrayList<>();
        boolean found = false;

        for (Recipe r : recipeDatabase) {
            //Search in Name OR Ingredients
            if (r.name.toLowerCase().contains(keyword.toLowerCase()) ||
                    r.ingredients.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(r);
                found = true;
            }
        }

        if (found) {
            System.out.println("Found " + results.size() + " match(es):");
            printTable(results);
        } else {
            System.out.println("[!] No recipes found matching '" + keyword + "'.");
        }
    }

    public void showRecipes() {
        System.out.println("\n--- RECOMMENDED RECIPES (Sorted by Time) ---");
        printTable(recipeDatabase);
    }

    // Helper method to keep printing consistent
    private void printTable(List<Recipe> list) {
        System.out.println(String.format("%-20s | %-7s | %s", "NAME", "TIME", "DIFFICULTY"));
        System.out.println("---------------------------------------------------------");
        for (Recipe r : list) {
            System.out.println(r);
            System.out.println("---------------------------------------------------------"); // Separator line
        }
    }
}