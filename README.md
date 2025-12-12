# Mom's Kitchen Helper: The Cook or Buy Dilemma
Mom's Kitchen Helper: A console-based decision system that helps moms to decide wether to cook or buy meals depending on their current circumstances. Factoring in energy left, time of day, available ingredients, budget and markets around the area

# Course Information
* **Course Code**: ES234317
* **Course Name**: Algorithm and Data Structure
* **Course Convenor**: Renny Pradina Kusumawardhani
* **Academic Year**: 2024/2025

# Group 5 Members
1. 5026241001 - Daffa Agung Pratama
2. 5026241007 - I Gusti Ayu Anindya Septiari
3. 5026241050 - Mahda Vekia

### Background

The project addresses the phenomenon of **decision fatigue** experienced by individuals who must frequently weigh the trade-offs between cooking (healthier, cheaper) and buying takeout (faster, more practical). This choice is complex, factoring in dynamic variables such as time of arrival, physical energy, ingredient availability, and budget.

The system automates this cognitive load by modeling the thought process into a structured algorithm.

### Application Overview

**Mom's Kitchen Helper** is a **Decision Support System** that guides the user through two phases:

1.  **Decision Phase:** Uses a **Binary Decision Tree** to filter options based on user input (Yes/No).
2.  **Action Phase:** Applies appropriate **Sorting and Searching algorithms** to provide the fastest (COOK path) or cheapest (BUY path) recommendations based on the outcome.

**Data Scale:**
* **Recipe Database:** 56+ unique recipes (used to demonstrate $O(n \log n)$ performance).
* **Restaurant Database:** 150 localized entries (50 per region: WEST, CENTER, EAST).


### Key Features and Algorithmic Implementation

#### 1. Dynamic Decision Flow (Binary Decision Tree)

This is the core decision logic. The entire application flow is controlled by the traversal of the **Binary Decision Tree**.

* **Mechanism:** Implemented via `DecisionNode.java`, the tree maps user conditions (energy, time) to a final action.
* **Algorithm:** **Binary Decision Tree** Traversal.
* **Complexity:** $O(h)$ (where h is tree height).

#### 2. Speed Optimization (Merge Sort)

If the final decision is to **COOK**, the system must help the user save time.

* **Algorithm:** **Merge Sort** is implemented in `RecipeManager.java`.
* **Purpose:** To sort the 56+ recipes by **Preparation Time** (fastest first).
* **Complexity:** $O(n \log n)$ (chosen for its efficiency and stability on a large recipe database).

#### 3. Budget Optimization (Selection Sort & Local Filter)

If the final decision is to **BUY**, the system must prioritize affordability and relevance.

* **Feature:** **Localized Filtering** is applied first, restricting the 150 restaurants to only the user's specific region (WEST/CENTER/EAST).
* **Algorithm:** **Selection Sort** is then executed on the filtered list.
* **Purpose:** Orders restaurants by **Price Level** (cheapest first).
* **Complexity:** $O(n^2)$ (used to demonstrate a different sorting method suitable for the smaller, filtered local list).

#### 4. Ingredient Search (Linear Search)

A search feature is available to filter the recipes after they have been sorted.

* **Algorithm:** **Linear Search** is implemented in `RecipeManager.java`.
* **Purpose:** Finds all recipes containing a user-specified keyword (e.g., "Egg") by scanning **all recipe names and ingredients**.
* **Complexity:** $O(n)$, required here because the list is sorted by time, not ingredient, necessitating a full sequential scan for filtering.

### Implementation Notes

* **Platform Constraint:** The solution strictly uses the **Scanner** for input and `System.out.println` for output, adhering to the console-based requirement.
* **Data Models:** Data structures (`Recipe.java` and `Restaurant.java`) are tailored to serve as keys for the different sorting and filtering algorithms (`prepTime`, `priceLevel`, `area`).
* **Data Location:** All data is initialized via *hardcoded* `populateData()` methods within the Manager classes.

# Presentation Files
Initial Presentation: [Link to File/Slides]

Progress Presentation: [Link to File/Slides]

Final Presentation: [Link to File/Slides]

# Related Repositories
Other Groups' Projects
1. Group 1: github.com/yelllsit-glitch/Final-Project-ASD
2. Group 2: github.com/riozakyrizky/Final-Project-ASD-2025
3. Group 3: github.com/strupwa/RevASD/
4. Group 4: github.com/Stephanie020207/Connect4AIGame
5. Group 5: github.com/Daffa-001/ASD-IUP-FinalProject
