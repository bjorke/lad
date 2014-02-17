import java.util.NoSuchElementException;

/** Immutable string sets represented as binary trees. */
abstract class Tree {

    /** Is the set empty? */
    abstract public boolean isEmpty();

    /** Is elem a member of the set? */
    abstract public boolean member (String elem);

    /** Construct a set from this which additionally contains string elem.
     *  If the string was already present the result set has
     *  the same elements as this.
     */
    abstract public Tree insert (String elem);

    /** Construct a set from this which does not contain string elem.
     *  If this did not contain the string, the result set has
     *  the same elements as this.
     */
    abstract public Tree delete (String elem);

    /** Return the alphabetically first string of the set. */
    abstract public String min();

    /** Construct a set that contains all strings of this
     *  but the alphabetically first.
     */
    abstract public Tree deleteMin();

    /** Print all strings in the set in ascending order. */
    public void printInOrder() {}

    /** The empty set. */
    public static Tree empty = new Nil();
}

/** Operations on the empty set. */
class Nil extends Tree {
    public boolean isEmpty() {
        return true;
    }
    public boolean member(String elem) {
        return false;
    }
    public Tree insert (String elem) {
        return new Node(elem);
    }
    public Tree delete (String elem) {
        return this;
    }
    public String min() {
        return null;
    }
    public Tree deleteMin() {
        throw new NoSuchElementException();
    }
}

/** Operations on non-empty sets. */
class Node extends Tree {

    /** The data stored at the node. */
    private final String label;

    /** Left and right subtrees, never null. */
    private final Tree left, right;

    /** Construct a leaf (a singleton search tree). */
    Node(String label) {
        this.label = label;
        this.left  = Tree.empty;
        this.right = Tree.empty;
    }

    /** Construct a binary node. */
    Node(String label, Tree left,  Tree right) {
        this.label = label;
        this.left  = left;
        this.right = right;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean member (String elem) {
        final int cmp = elem.compareTo(label);
        if (cmp == 0) return true;
        if (cmp < 0)  return left.member(elem);
        else          return right.member(elem);
    }

    public Tree insert(String elem) {

        // TODO
        return null;

    }

    public String min() {
        if (left.isEmpty()) return label;
        else return left.min();
    }

    public Tree deleteMin() {
        if (left.isEmpty()) return right;
        else return new Node(label, left.deleteMin(), right);
    }

    public Tree delete(String elem) {

        // TODO
        return null;

    }

    public void printInOrder() {

        // TODO

    }
}

public class StringSet {

    public static void main (String args[]) {
        Tree.empty
                .insert("I")
                .insert("like")
                .insert("eating")
                .insert("young")
                .insert("jelly")
                .insert("frozen")
                .delete("I")
                .delete("like")
                .insert("questioning")
                .insert("worrying")
                .insert("zookeepers")
                .insert("after")
                .insert("being")
                .insert("completely")
                .insert("drugged")
                .insert("karen")
                .insert("is")
                .insert("tempting")
                .insert("many")
                .insert("uninvited")
                .insert("xenophobic")
                .insert("visitors")
                .insert("reality")
                .insert("states")
                .insert("paper")
                .insert("including")
                .insert("listed")
                .insert("notes")
                .delete("is")
                .insert("gelatinous")
                .insert("on")
                .insert("hemp")
                .printInOrder();
    }
}