import java.util.Scanner;

public class DecisionTreeSystem {
    DecisionNode root;
    Scanner scanner = new Scanner(System.in);

    public DecisionTreeSystem() {
        buildTree();
    }

    private void buildTree() {
        // LEAF NODES (Final Answers)
        DecisionNode buyFood = new DecisionNode("RECOMMENDATION: Buy Food (Delivery/Takeout)");
        DecisionNode cookComplex = new DecisionNode("RECOMMENDATION: Cook a Full Meal");
        DecisionNode cookSimple = new DecisionNode("RECOMMENDATION: Cook a Simple/Quick Meal");
        DecisionNode shopAndCook = new DecisionNode("RECOMMENDATION: Go Shopping & Cook");

        // BRANCH NODES (Questions)
        DecisionNode marketOpen = new DecisionNode("Is the market/supermarket still open?", shopAndCook, buyFood);
        DecisionNode checkIngredients = new DecisionNode("Do you have ingredients in the fridge?", cookComplex, marketOpen);
        DecisionNode checkBudget = new DecisionNode("Is the budget tight right now?", cookSimple, buyFood);
        DecisionNode checkTime = new DecisionNode("Is it late at night (past 7 PM)?", buyFood, checkBudget);

        // ROOT NODE
        root = new DecisionNode("Is your energy level above 50% (Feeling fit)?", checkIngredients, checkTime);
    }

    public void startDecisionProcess() {
        DecisionNode current = root;

        System.out.println("=== MOM'S DECISION HELPER ===");
        System.out.println("Answer with 'yes' or 'no'.\n");

        // --- TREE TRAVERSAL ---
        while (!current.isLeaf) {
            System.out.println("[?] " + current.text);
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            // FIX: Accept both "y" and "yes"
            if (input.startsWith("y")) {
                current = current.yesBranch;
            } else if (input.startsWith("n")) {
                current = current.noBranch;
            } else {
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }
        }

        System.out.println("\n=================================");
        System.out.println(current.text);
        System.out.println("=================================");

        // --- INTEGRATION: COOK (Tree + Sorting + Searching) ---
        if (current.text.contains("Cook")) {
            System.out.println("\n[SYSTEM] Loading Recipe Database...");
            RecipeManager manager = new RecipeManager();

            // 1. SORTING (Merge Sort)
            System.out.println("[SYSTEM] Sorting recipes by quickest time (Merge Sort)...");
            manager.sortRecipesByTime();
            manager.showRecipes();

            // 2. SEARCHING (Linear Search) - THE PART THAT WAS SKIPPED
            System.out.println("\nWould you like to filter recipes by ingredient? (yes/no)");
            System.out.print("> ");
            String choice = scanner.nextLine().trim().toLowerCase();

            // FIX: Changed .equals("y") to .startsWith("y") to handle "yes"
            if (choice.startsWith("y")) {
                System.out.print("Enter keyword (e.g., 'Egg', 'Chicken'): ");
                String keyword = scanner.nextLine().trim(); // Capture user input

                // Call the filter method
                manager.filterRecipes(keyword);
            }
        }

        // --- INTEGRATION: BUY (Tree + Selection Sort) ---
        else if (current.text.contains("Buy")) {
            System.out.println("[SYSTEM] Result is 'BUY'. Finding options...");
            RestaurantManager restManager = new RestaurantManager();

            System.out.println("[SYSTEM] Sorting restaurants by Price (Selection Sort)...");
            restManager.sortByPrice();
            restManager.showRestaurants();
        }

        System.out.println("\n[SYSTEM] Good luck with your meal!");
    }
}