package queueusingtwostacks;
import java.util.*;
public class QueueUsingTwoStacks {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    private void moveStack1ToStack2(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.pop();
    }
    public int peek(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q1 = new QueueUsingTwoStacks();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        System.out.println(q1.stack1);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }
}
