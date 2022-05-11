package stack;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{
    private int size = 0;
    private Node top;
        /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    @Override
    public void push(Object element) {
        Node node = new Node();

        node.data = element;
        node.next = top;
        top = node;
        size++;

    }

    @Override
    public Object pop() {

        if (top == null)
        {
            throw new NoSuchElementException("Intet element");
        }
            Node sletNode = top;
            top = top.next;
            size--;
            return sletNode.data;
    }

    @Override
    public Object peek() {
        if (top ==null)
        {
            throw new NoSuchElementException("Intet element");
        }
        return top.data;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else return false;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
