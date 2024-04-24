import java.util .*;
class SingleLinkedList{
    LinkedList linklist = new LinkedList();
    public void add(int item){
        linklist.add(item);
    }
    public int remove(){
        return (int) linklist.remove();
    }
    public void printList(){
        System.out.println(linklist);
    }
}
public class SingleLinkedListUsingLinkedList {
    public static void main(String[] args) {
        SingleLinkedList s1 = new SingleLinkedList();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.printList();
    }
}