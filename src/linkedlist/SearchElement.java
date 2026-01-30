
// Search element in linked list
// Time: O(n)
// Space: O(1)

public class SearchElement {

    public static boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }
}
