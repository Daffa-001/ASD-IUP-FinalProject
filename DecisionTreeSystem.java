import java.util.Scanner;

public class DecisionTreeSystem {

    DecisionNode root;
    Scanner scanner = new Scanner(System.in);
    String userLocation; // <-- Pastikan field ini ada di sini!

    public DecisionTreeSystem() {
        // Panggil buildTree() di constructor untuk menginisialisasi root
        buildTree();
    }

    // --- 1. METHOD INPUT LOKASI ---
    private void askUserLocation() {
        System.out.println("=========================================");
        System.out.println("Selamat datang di Decision Helper!");
        System.out.println("Di wilayah manakah Anda berada saat ini?");
        System.out.println("(Pilihan: BARAT / PUSAT / TIMUR)");
        System.out.print("> ");
        // userLocation diisi dari input Scanner
        userLocation = scanner.nextLine().trim().toUpperCase();
    }

    // --- 2. METHOD BUILD TREE (Harus terpisah) ---
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

        // ROOT NODE: Inisialisasi root harus di dalam method ini
        root = new DecisionNode("Is your energy level above 50% (Feeling fit)?", checkIngredients, checkTime);
    }

    // --- 3. METHOD START PROCESS (MAIN CONTROLLER) ---
    public void startDecisionProcess() {
        // Panggil input lokasi di awal
        askUserLocation();

        DecisionNode current = root;

        System.out.println("\n=== MOM'S DECISION HELPER ===");
        System.out.println("Answer with 'yes' or 'no'.\n");

        // --- TREE TRAVERSAL ---
        while (!current.isLeaf) {
            System.out.println("[?] " + current.text);
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Check input
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

        // --- INTEGRATION: COOK (Merge Sort & Linear Search) ---
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

        // --- INTEGRATION: BUY (Selection Sort & Location Filter) ---
        else if (current.text.contains("Buy")) {
            System.out.println("[SYSTEM] Result is 'BUY'. Mencari opsi di wilayah " + userLocation + "...");
            RestaurantManager restManager = new RestaurantManager();

            // Panggil method showRestaurants DENGAN LOKASI PENGGUNA
            restManager.showRestaurants(userLocation);
        }

        System.out.println("\n[SYSTEM] Good luck with your meal!");
    }
}