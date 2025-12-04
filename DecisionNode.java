public class DecisionNode {
    String text;
    DecisionNode yesBranch;
    DecisionNode noBranch;
    boolean isLeaf;

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