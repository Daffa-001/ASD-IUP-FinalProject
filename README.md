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

Working mothers often face a recurring dilemma at the end of the day: **whether to cook at home**, which is generally healthier and more economical—or **to buy food**, which is faster and more practical. This decision is rarely straightforward because it depends on several constantly changing factors, such as the time they arrive home, their remaining physical energy, the availability of ingredients in the fridge, and the complexity or duration of the recipes they might prepare. Family priorities, particularly children’s nutritional needs, further influence this choice. When these decisions are made manually, especially after a long and exhausting day—mothers often experience **decision fatigue**, which lowers the quality and consistency of their choices. To address this issue, this program is designed to **automate the decision-making process using data structures**, ensuring that each recommendation is logical, efficient, and tailored to the user’s situation. The system tackles three main challenges: determining the best action (Cook vs. Buy) based on inputs like energy, time, and ingredient availability; helping the user quickly find a recipe that fits within the remaining time if cooking is chosen; and, if buying food is the better option, filtering nearby restaurants based on criteria such as price or distance.

The system automates this cognitive load by modeling the thought process into a structured algorithm.

### Application Overview

**1. Smart Decision Engine (Cook vs. Buy vs. Shop & Cook)**
The system automatically determines the best action for the user by evaluating key variables such as energy level, time, budget, ingredient availability, and store hours. Instead of forcing the user to think while tired, the program applies rule-based logic to recommend:
- Buy Food
- Cook a Simple Meal
- Cook a Full Meal
- Shop & Cook if ingredients are missing but stores are open
This feature acts as the core intelligence of the application.

**2. Ingredient Availability Checking**
The decision logic includes a check to determine whether the required ingredients are available at home. Depending on the result, the system may:
- Continue with cooking,
- Recommend a simpler recipe,
- Or suggest buying ingredients before cooking.
This makes the system realistic and adaptive to daily kitchen conditions.

**3. Time-Based Recipe Sorting (Merge Sort)**
When the user chooses to cook, the program runs the RecipeManager, which:
- Sorts all recipes based on preparation time using Merge Sort
- Ensures fast and efficient sorting even with increasing recipe data
- Allows the user to quickly identify recipes they can finish within their remaining time
This improves usability by reducing manual scanning of recipe lists.

**4. Restaurant Filtering When Buying Food**
If the system decides "BUY FOOD," the user is asked for their location (Center/West/East). The program then applies:
- Filtering by Location
- Selection Sort by Price to find the most affordable nearby option
This feature ensures the recommendations are practical, especially when the user's budget is tight.

**5. Store/Market Availability Check (for SHOP & COOK)**
If ingredients are not available, the system checks whether the market or store is open. If yes, the action becomes Shop & Cook, bridging the gap between unavailable ingredients and the desire to cook something healthy.

**6. User-Friendly Step-by-Step Flow**
The entire system is designed with a decision-tree structure, guiding users through:
**Energy → Time → Ingredients → Budget → Action**
This makes the logic easy to follow, transparent, and replicable.

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
