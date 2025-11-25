import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    List<Recipe> recipeDatabase;

    public RecipeManager() {
        recipeDatabase = new ArrayList<>();
        populateData();
    }

    // Hardcoded dummy data for the project
    private void populateData() {
        recipeDatabase.add(new Recipe("Grilled Chicken", 45, "Medium"));
        recipeDatabase.add(new Recipe("Instant Noodles", 5, "Easy"));
        recipeDatabase.add(new Recipe("Fried Rice", 15, "Medium"));
        recipeDatabase.add(new Recipe("Beef Stew", 120, "Hard"));
        recipeDatabase.add(new Recipe("Omelet", 10, "Easy"));
        recipeDatabase.add(new Recipe("Caesar Salad", 20, "Easy"));
    }


    // --- ALGORITHM: MERGE SORT (Sorts by PrepTime) ---
    public void sortRecipesByTime() {
        recipeDatabase = mergeSort(recipeDatabase);
    }

    private List<Recipe> mergeSort(List<Recipe> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Recipe> left = new ArrayList<>(list.subList(0, mid));
        List<Recipe> right = new ArrayList<>(list.subList(mid, list.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private List<Recipe> merge(List<Recipe> left, List<Recipe> right) {
        List<Recipe> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            // Sorting Logic: Compare PrepTime
            if (left.get(i).prepTime <= right.get(j).prepTime) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        merged.addAll(left.subList(i, left.size()));
        merged.addAll(right.subList(j, right.size()));

        return merged;
    }
    // --------------------------------------------------
    // ... (Existing code: list, constructor, mergeSort) ...

    // --- ALGORITHM: LINEAR SEARCH (Filter by Name/Ingredient) ---
    // Complexity: O(n) - Checks every element once.
    public void filterRecipes(String keyword) {
        System.out.println("\n[SEARCH] Searching for recipes containing: '" + keyword + "'...");

        List<Recipe> results = new ArrayList<>();
        boolean found = false;

        // Iterate through the entire database (Linear Scan)
        for (Recipe r : recipeDatabase) {
            // Check if recipe name contains the keyword (case-insensitive)
            if (r.name.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(r);
                found = true;
            }
        }

        if (found) {
            System.out.println("Found " + results.size() + " match(es):");
            System.out.println("-----------------------------------------------------");
            for (Recipe r : results) {
                System.out.println(r);
            }
            System.out.println("-----------------------------------------------------");
        } else {
            System.out.println("[!] No recipes found matching '" + keyword + "'.");
        }
    }

    public void showRecipes() {
        System.out.println("\n--- RECOMMENDED RECIPES (Sorted by Time) ---");
        System.out.println(String.format("%-25s | %s | %s", "NAME", "TIME", "DIFFICULTY"));
        System.out.println("-----------------------------------------------------");
        for (Recipe r : recipeDatabase) {
            System.out.println(r);
        }
        System.out.println("-----------------------------------------------------");
    }
}