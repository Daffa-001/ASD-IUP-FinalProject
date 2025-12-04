public class Recipe {
    String name;
    int prepTime;       // in minutes
    String difficulty;
    String ingredients; // <--- NEW FIELD

    public Recipe(String name, int prepTime, String difficulty, String ingredients) {
        this.name = name;
        this.prepTime = prepTime;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %d mins | %-8s\n   > Ingredients: %s",
                name, prepTime, difficulty, ingredients);
    }
}