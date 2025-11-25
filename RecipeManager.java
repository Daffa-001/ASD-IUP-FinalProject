import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    List<Recipe> recipeDatabase;

    public RecipeManager() {
        recipeDatabase = new ArrayList<>();
        populateData();
    }

    private void populateData() {
        // Now adding specific ingredients to every recipe
        recipeDatabase.add(new Recipe("Grilled Chicken", 45, "Medium", "Chicken Breast, Lemon, Garlic, Spices"));
        recipeDatabase.add(new Recipe("Instant Noodles", 5, "Easy", "Noodles, Seasoning Powder, Water, Egg"));
        recipeDatabase.add(new Recipe("Fried Rice", 15, "Medium", "Rice, Soy Sauce, Egg, Garlic, Chili"));
        recipeDatabase.add(new Recipe("Beef Stew", 120, "Hard", "Beef Chunks, Potatoes, Carrots, Broth, Onion"));
        recipeDatabase.add(new Recipe("Omelet", 10, "Easy", "Eggs, Salt, Pepper, Butter, Cheese"));
        recipeDatabase.add(new Recipe("Caesar Salad", 20, "Easy", "Romaine Lettuce, Croutons, Parmesan, Dressing"));
    }

    // --- ALGORITHM: MERGE SORT (Sorts by PrepTime) ---
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

    // --- ALGORITHM: LINEAR SEARCH (Filter by Name or Ingredient) ---
    public void filterRecipes(String keyword) {
        System.out.println("\n[SEARCH] Searching for recipes with: '" + keyword + "'...");

        List<Recipe> results = new ArrayList<>();
        boolean found = false;

        for (Recipe r : recipeDatabase) {
            // Updated logic: Search in Name OR Ingredients
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