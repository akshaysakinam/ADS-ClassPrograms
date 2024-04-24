import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedList {

    private LinkedList<Integer> list;
    public DoublyLinkedList() {
        list = new LinkedList<>();
    }
    public void addFirst(int data) {
        list.addFirst(data);
    }
    public void addLast(int data) {
        list.addLast(data);
    }
    public int removeFirst() {
        return list.removeFirst();
    }
    public int removeLast() {
        return list.removeLast();
    }
    public int get(int index) {
        return list.get(index);
    }
    public void set(int index, int data) {
        list.set(index, data);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"-->");
        }
        System.out.println();
    }
    // Method to traverse the linked list in reverse order 
    public void printReverse() {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + "-->");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.print();
        list.removeFirst();
        list.print();
        list.addLast(4);
        list.print();
        list.set(1, 5);
        list.print();
        list.printReverse();
    }
} 