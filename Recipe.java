public class Recipe {
    String name;
    int prepTime; // in minutes
    String difficulty;

    public Recipe(String name, int prepTime, String difficulty) {
        this.name = name;
        this.prepTime = prepTime;
        this.difficulty = difficulty;
    }

    // formatting for clean console output
    @Override
    public String toString() {
        return String.format("%-25s | %d mins | %s", name, prepTime, difficulty);
    }
}