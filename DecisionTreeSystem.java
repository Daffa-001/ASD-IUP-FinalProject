import java.util.Scanner;

public class DecisionTreeSystem {
    DecisionNode root;
    Scanner scanner = new Scanner(System.in);

    public DecisionTreeSystem() {
        buildTree();
    }

    // 1. HARDCODING THE LOGIC TREE (Based on the Diagram above)
    private void buildTree() {
        // Step 1: Create the Final Outcomes (Leaf Nodes)
        DecisionNode buyFood = new DecisionNode("RECOMMENDATION: Buy Food (Delivery/Takeout)");
        DecisionNode cookComplex = new DecisionNode("RECOMMENDATION: Cook a Full Meal");
        DecisionNode cookSimple = new DecisionNode("RECOMMENDATION: Cook a Simple/Quick Meal (e.g., Omelet)");
        DecisionNode shopAndCook = new DecisionNode("RECOMMENDATION: Go Shopping & Cook");

        // Step 2: Create the Logic Layers (Bottom Up)

        // Branch: High Energy -> Ingredients?
        DecisionNode marketOpen = new DecisionNode("Is the market/supermarket still open?", shopAndCook, buyFood);
        DecisionNode checkIngredients = new DecisionNode("Do you have ingredients in the fridge?", cookComplex, marketOpen);

        // Branch: Low Energy -> Time? -> Budget?
        DecisionNode checkBudget = new DecisionNode("Is the budget tight right now?", cookSimple, buyFood);
        DecisionNode checkTime = new DecisionNode("Is it late at night (past 7 PM)?", buyFood, checkBudget);

        // Step 3: The Root (First Question)
        // Root connects the High Energy path and the Low Energy path
        root = new DecisionNode("Is your energy level above 50% (Feeling fit)?", checkIngredients, checkTime);
    }

    // 2. TRAVERSAL METHOD (The "Game Loop")
    public void startDecisionProcess() {
        DecisionNode current = root;

        // ... (Previous tree traversal while loop) ...
        // Assume we have exited the loop and 'current' is a leaf node

        System.out.println("\n=================================");
        System.out.println(current.text);
        System.out.println("=================================");

        // CHECK if the decision implies Cooking
        // We check if the result string contains the word "Cook"
        if (current.text.contains("Cook")) {
            System.out.println("\n[SYSTEM] Loading Recipe Database...");
            RecipeManager manager = new RecipeManager();

            // 1. SORTING DEMO
            System.out.println("[SYSTEM] Sorting recipes by quickest time (Merge Sort)...");
            manager.sortRecipesByTime();
            manager.showRecipes();

            // 2. SEARCHING DEMO (New Feature)
            System.out.println("\nWould you like to filter recipes by ingredient? (y/n)");
            System.out.print("> ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("y")) {
                System.out.print("Enter keyword (e.g., 'Egg', 'Rice'): ");
                String keyword = scanner.nextLine().trim();

                // Call the Linear Search
                manager.filterRecipes(keyword);
            }

            System.out.println("\n[SYSTEM] Good luck with your meal!");
        }
        System.out.println("\n[SYSTEM] Loading Recipe Database...");
        RecipeManager manager = new RecipeManager();

        System.out.println("[SYSTEM] Sorting recipes by quickest time (Merge Sort)...");
        manager.sortRecipesByTime();

        manager.showRecipes();
    }

    // Optional: Add logic for "Buy" to show Restaurants
    // ... inside startDecisionProcess() ...

    else if (current.text.contains("Buy")) {
        System.out.println("[SYSTEM] Result is 'BUY'. Finding options...");

        RestaurantManager restManager = new RestaurantManager();

        // Use Selection Sort to show cheapest options first
        System.out.println("[SYSTEM] Sorting restaurants by Price (Selection Sort)...");
        restManager.sortByPrice();

        restManager.showRestaurants();

        System.out.println("\n[SYSTEM] Enjoy your meal!");
    }
}