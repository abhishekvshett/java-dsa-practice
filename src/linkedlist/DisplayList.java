
// Display linked list
// Time: O(n)
// Space: O(1)

public class DisplayList {

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
