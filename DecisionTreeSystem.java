import java.util.Scanner;

public class DecisionTreeSystem {

    DecisionNode root;
    Scanner scanner = new Scanner(System.in);
    String userLocation;

    public DecisionTreeSystem() {
        buildTree();
    }

    private void askUserLocation() {
        System.out.println("=========================================");
        System.out.println("WELCOME TO MOM'S KITCHEN HELPER");
        System.out.println("\n[?] Which region do you live in?");
        System.out.println("(Choices: WEST / CENTER / EAST)");
        System.out.print("> ");
        userLocation = scanner.nextLine().trim().toUpperCase();
    }

    private void buildTree() {
        // LEAF NODES
        DecisionNode buyFood = new DecisionNode("RECOMMENDATION: Buy Food (Delivery/Takeout)");
        DecisionNode cookComplex = new DecisionNode("RECOMMENDATION: Cook a Full Meal");
        DecisionNode cookSimple = new DecisionNode("RECOMMENDATION: Cook a Simple/Quick Meal");
        DecisionNode shopAndCook = new DecisionNode("RECOMMENDATION: Go Shopping & Cook");

        // BRANCH NODES
        DecisionNode marketOpen = new DecisionNode("Is the market/supermarket still open?", shopAndCook, buyFood);
        DecisionNode checkIngredients = new DecisionNode("Do you have ingredients in the fridge?", cookComplex, marketOpen);
        DecisionNode checkBudget = new DecisionNode("Is the budget tight right now?", cookSimple, buyFood);
        DecisionNode checkTime = new DecisionNode("Is it late at night (past 7 PM)?", buyFood, checkBudget);

        // ROOT NODE
        root = new DecisionNode("Is your energy level above 50% (Feeling fit)?", checkIngredients, checkTime);
    }

    // METHOD START PROCESS (MAIN CONTROLLER)
    public void startDecisionProcess() {
        askUserLocation();

        DecisionNode current = root;
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Answer with 'yes' or 'no'.\n");

        // TREE TRAVERSAL
        while (!current.isLeaf) {
            System.out.println("[?] " + current.text);
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

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

        // COOK (Merge Sort & Linear Search)
        if (current.text.contains("Cook")) {
            System.out.println("\n[SYSTEM] Loading Recipe Database...");
            RecipeManager manager = new RecipeManager();

            // 1. SORTING (Merge Sort)
            System.out.println("[SYSTEM] Sorting recipes by quickest time (Merge Sort)...");
            manager.sortRecipesByTime();
            manager.showRecipes();

            // 2. SEARCHING (Linear Search)
            System.out.println("\nWould you like to filter recipes by ingredient? (yes/no)");
            System.out.print("> ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.startsWith("y")) {
                System.out.print("Enter keyword (e.g., 'Egg', 'Chicken'): ");
                String keyword = scanner.nextLine().trim();
                manager.filterRecipes(keyword);
            }
        }

        // BUY (Selection Sort & Location Filter)
        else if (current.text.contains("Buy")) {
            System.out.println("[SYSTEM] Result is 'BUY'. Searching options in " + userLocation + " region...");
            RestaurantManager restManager = new RestaurantManager();

            restManager.showRestaurants(userLocation);
        }

        System.out.println("\n[SYSTEM] Good luck with your meal!");
    }
}