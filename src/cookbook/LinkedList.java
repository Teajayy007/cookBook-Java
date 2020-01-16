/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookbook;

/**
 *
 * @author 7302
 */
public class LinkedList {

    public class Node { // constructing Node claas

        private Recipe data;
        private Node next;

        public Node() {

        }
    }// end of node class

    private Node head;

    public LinkedList() {
        head = new Node();
        head.data = null;
        head.next = null;
    }

    public boolean insert(Recipe newRecipe) {
        Node n = new Node();
        if (n == null) {
            return false;
        } else {
          
                n.next = head.next;
            head.next = n;
            n.data = newRecipe.deepCopy();
            return true;
        }
    }

    public boolean delete(String targetKey) {
        Node q = head;         // Set the trailing pointer
        Node f = head.next;    // Set the traversal pointer to the first node
        // Search until end of list or found
        while (f != null && !(f.data.getName().compareTo(targetKey) == 0)) {
            q = f;          // Set trailer to current
            f = f.next;     // Move along
        }
        if (f != null) {
            q.next = f.next;// If found, branch around the node
            return true;
        } else {
            return false;
        }
    }

    public Recipe showOne(String targetKey) {// based on name
        Node f = head.next;    // point to the first listing
        // search until found or the end of the list
        while (f != null && !(f.data.compareTo(targetKey) == 0)) {
            f = f.next;
        }                   // return the appropriate value
        if (f != null) {
            return f.data.deepCopy();
        } else {
            return null;
        }
    }

    public String showAll(String k) {// show all by type
        String output = "";
        Node p = head.next;    // Set up the traversal pointer
        while (p != null) {  // Continue to end of list
            // Display a listing
            if (p.data.getType().compareTo(k) == 0) {
                output += p.data.toString() + "\n";
            }
            p = p.next;     // Move the traversal pointer
        }
        return output;
    }

}
