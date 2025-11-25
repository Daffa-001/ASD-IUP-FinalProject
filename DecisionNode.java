public class DecisionNode {
    String text;                // The question or the final decision
    DecisionNode yesBranch;     // Where to go if user types "Yes"
    DecisionNode noBranch;      // Where to go if user types "No"
    boolean isLeaf;             // True if this is a final answer (End of tree)

    // Constructor for a Question Node (Branch)
    public DecisionNode(String question, DecisionNode yes, DecisionNode no) {
        this.text = question;
        this.yesBranch = yes;
        this.noBranch = no;
        this.isLeaf = false;
    }

    // Constructor for a Result Node (Leaf)
    public DecisionNode(String result) {
        this.text = result;
        this.yesBranch = null;
        this.noBranch = null;
        this.isLeaf = true;
    }
}