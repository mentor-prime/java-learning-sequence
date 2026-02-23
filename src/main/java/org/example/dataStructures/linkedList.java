package org.example.dataStructures;

/**
 * Singly Linked List Implementation in Java
 * Operations: append, prepend, insert, delete, search, reverse, remove duplicates, and more.
 */
public class linkedList {

    // ── Node ─────────────────────────────────────────────────────────────────

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ── Fields ────────────────────────────────────────────────────────────────

    private Node head;
    private int size;

    public linkedList() {
        head = null;
        size = 0;
    }

    // ── Insertion ─────────────────────────────────────────────────────────────

    /** Add a node at the end. */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        size++;
    }

    /** Add a node at the beginning. */
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /** Insert a new node at a given 0-based index. */
    public void insertAt(int index, int data) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (index == 0) {
            prepend(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) current = current.next;
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    /** Insert a new node after the first node containing `target`. */
    public boolean insertAfter(int target, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                size++;
                return true;
            }
            current = current.next;
        }
        System.out.println("Value " + target + " not found.");
        return false;
    }

    // ── Deletion ──────────────────────────────────────────────────────────────

    /** Delete the first node containing `data`. */
    public boolean delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return false;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        System.out.println("Value " + data + " not found.");
        return false;
    }

    /** Delete the node at a given 0-based index. */
    public void deleteAt(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) current = current.next;
            current.next = current.next.next;
        }
        size--;
    }

    // ── Search & Access ───────────────────────────────────────────────────────

    /** Return the 0-based index of `data`, or -1 if not found. */
    public int search(int data) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == data) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    /** Return the data at a given 0-based index. */
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current.data;
    }

    /** Check if a value exists in the list. */
    public boolean contains(int data) {
        return search(data) != -1;
    }

    // ── Utility ───────────────────────────────────────────────────────────────

    /** Reverse the list in-place. */
    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    /** Remove duplicate values (keeps first occurrence). */
    public void removeDuplicates() {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
                size--;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    /** Return the number of nodes. */
    public int size() {
        return size;
    }

    /** Check if the list is empty. */
    public boolean isEmpty() {
        return head == null;
    }

    /** Clear the entire list. */
    public void clear() {
        head = null;
        size = 0;
    }

    /** Print the list. */
    public void display() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        System.out.println(sb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        return sb.append("]").toString();
    }

    // ── Main / Demo ───────────────────────────────────────────────────────────

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("           Linked List Demo (Java)");
        System.out.println("==================================================");

        linkedList ll = new linkedList();

        // Append
        System.out.println("\n1. Appending 10, 20, 30, 40, 50...");
        for (int v : new int[]{10, 20, 30, 40, 50}) ll.append(v);
        ll.display();

        // Prepend
        System.out.println("\n2. Prepending 5...");
        ll.prepend(5);
        ll.display();

        // Insert at position
        System.out.println("\n3. Inserting 25 at index 3...");
        ll.insertAt(3, 25);
        ll.display();

        // Insert after
        System.out.println("\n4. Inserting 35 after 30...");
        ll.insertAfter(30, 35);
        ll.display();

        // Search
        System.out.println("\n5. Search for 30: index = " + ll.search(30));
        System.out.println("   Search for 99: index = " + ll.search(99));

        // Get
        System.out.println("\n6. Get element at index 2: " + ll.get(2));

        // Contains
        System.out.println("\n7. Contains 40? " + ll.contains(40));
        System.out.println("   Contains 99? " + ll.contains(99));

        // Delete by value
        System.out.println("\n8. Deleting 25...");
        ll.delete(25);
        ll.display();

        // Delete at index
        System.out.println("\n9. Deleting node at index 0 (head)...");
        ll.deleteAt(0);
        ll.display();

        // Size
        System.out.println("\n10. List size: " + ll.size());

        // Remove duplicates
        System.out.println("\n11. Adding duplicates 10, 20, 30...");
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.display();
        System.out.println("    Removing duplicates...");
        ll.removeDuplicates();
        ll.display();

        // Reverse
        System.out.println("\n12. Reversing the list...");
        ll.reverse();
        ll.display();

        // toString
        System.out.println("\n13. toString: " + ll);

        // Clear
        System.out.println("\n14. Clearing list...");
        ll.clear();
        System.out.println("    isEmpty? " + ll.isEmpty());

        System.out.println("\n==================================================");
        System.out.println("Done!");
    }
}
